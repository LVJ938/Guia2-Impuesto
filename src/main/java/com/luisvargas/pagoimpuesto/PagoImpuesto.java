package com.luisvargas.pagoimpuesto;
/**
 *
 * @author Luis Vargas
 */
import model.Calculoimpuesto;
import model.Vehiculo;
import java.text.DecimalFormat;
import view.Impuesto;
public class PagoImpuesto {

    
    public static void main(String[] args) {
        
        Impuesto pantalla = new Impuesto();
        pantalla.setVisible(true);
        pantalla.setLocation(null);
        /*
        Vehiculo carro1 = new Vehiculo("Mazda","Publico",2020,1600,60000000);
        Calculoimpuesto impuesto = new Calculoimpuesto();
        
        double avaluo = impuesto.calcularAvaluo(carro1);
        DecimalFormat formato = new DecimalFormat("$#,##0.00");
        String avaluoFormating = formato.format(avaluo);
        System.out.println("El avaluo de su carro es: " + avaluoFormating);
        
        double pagarImpuesto = impuesto.calcularImpuesto(carro1);
        DecimalFormat formato1 = new DecimalFormat("$#,##0.00");
        String impuestoFormating = formato1.format(pagarImpuesto);
        System.out.println("-----------------------------------------");
        System.out.println("El avaluo de su carro es: " + impuestoFormating);
        */
    }
}

    
