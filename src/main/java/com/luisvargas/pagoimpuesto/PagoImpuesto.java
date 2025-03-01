package com.luisvargas.pagoimpuesto;
/**
 *
 * @author Luis Vargas
 */
import model.Calculoimpuesto;
import view.Impuesto;
import controller.Controlador;
import model.Vehiculo;



public class PagoImpuesto {

    
    public static void main(String[] args) {
        
        Vehiculo carro = new Vehiculo(" ", " ", 0,0,0.0);
        Calculoimpuesto calcular = new Calculoimpuesto();
        Impuesto verImpuesto = new Impuesto();
        
        Controlador control = new Controlador(verImpuesto, calcular, carro);
        
        control.inicio();
        
    }
}

    
