package model;
/**
 *
 * @Luis vargas
 */
public class Calculoimpuesto {
    int actualYear = 2025;
    double decrementoAnual = 0.1; // del 10%
    
    public double calcularAvaluo(Vehiculo vehiculo) 
        {
          int antiguedad = actualYear - vehiculo.getModelo();
          
          //Depreciacion segun los años de antiguedad 
          double depreciacion = 1- decrementoAnual ;
          double valorDepreciado = vehiculo.getValor() * Math.pow(depreciacion,antiguedad);
          
          //Ajuste del valor segun el cilindraje  (ejemplo: +2% por cada 100 cc)
          double ajusteCilindraje = (vehiculo.getCilindraje()/100)*0.02;
          
          //Calculo valor avaluo
          double valorAvaluo = valorDepreciado * (1+ ajusteCilindraje);
          
          return valorAvaluo;
          
        }
    
    public double calcularImpuesto (Vehiculo vehiculo)
        {
            double  valorImpuesto;
            double valorAvaluo = calcularAvaluo(vehiculo);
            
            if (vehiculo.getTipo().equals("Publico"))
            {
               valorImpuesto = valorAvaluo * 0.007;  // 0,7 % 
               return valorImpuesto;
            }
            else if (valorAvaluo <= 55679000)
            {
                valorImpuesto = valorAvaluo * 0.017; // 1,7%
                return valorImpuesto;
            }
            else if (valorAvaluo > 55679000 && valorAvaluo <= 125274000)
            {
                valorImpuesto = valorAvaluo * 0.027; // 2,7%
                return valorImpuesto;
            }
            else
            {
                valorImpuesto = valorAvaluo * 0.037; // 3,7%
                return valorImpuesto;
            }
        }
}
