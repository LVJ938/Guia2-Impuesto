package controller;

/**
 *
 * @Luis Vargas
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import view.Impuesto;
import model.Calculoimpuesto;
import model.Vehiculo;


public class Controlador implements ActionListener{
    private Impuesto ver;
    private Calculoimpuesto calculos;
    private Vehiculo carro;
    
    public Controlador(Impuesto view, Calculoimpuesto calculoImpuesto,Vehiculo vehiculo )
    {
        this.ver= view;
        this.calculos = calculoImpuesto;
        this.carro = vehiculo;
        this.ver.btnCalcular.addActionListener(this);
                
    }
    
    public void inicio()
    {
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       carro.setMarca(ver.Marca.getText());
       carro.setCilindraje(Integer.parseInt(ver.Cilindraje.getText()));
       carro.setModelo(Integer.parseInt(ver.Modelo.getText()));
       carro.setValor(Double.parseDouble(ver.Valor.getText()));
       String seleccion = ver.getSeleccionComboBox();
       carro.setTipo(seleccion);
       
       //Calculo de avaluo
       double avaluo = calculos.calcularAvaluo(carro);
       DecimalFormat formato = new DecimalFormat("$#,##0.00");
       String avaluoFormating = formato.format(avaluo);
       ver.Avaluo.setText(avaluoFormating);
       
        //Calculo del impuesto
       double impuesto = calculos.calcularImpuesto(carro);
       DecimalFormat formatoImpuesto = new DecimalFormat("$#,##0.00");
       String impuestoFormating = formatoImpuesto.format(impuesto);
       ver.ValorApagar.setText(impuestoFormating);
       
    }    
}
