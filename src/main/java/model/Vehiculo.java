package model;
/**
 *
 * Luis Vargas
 */
//import java.time.Year;

public class Vehiculo {
    
    private String marca;
    private String tipo;
    private int modelo;
    private int cilindraje;
    private double valor;
    
    // constructor 
    public Vehiculo(String marcaVehiculo, String tipoVehiculo, int modeloVehiculo, int cilindrajeVehiculo, double valorComercial)
        {
        this.marca = marcaVehiculo;
        this.tipo = tipoVehiculo;
        this.modelo = modeloVehiculo;
        this.cilindraje = cilindrajeVehiculo;
        this.valor = valorComercial;
        }
        /*
        public int calcularAntiguedad()      
        {
            int actualYear = 2025;
            return actualYear - this.modelo;
         }
        */
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getModelo() {
            return modelo;
        }

        public void setModelo(int modelo) {
            this.modelo = modelo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getCilindraje() {
            return cilindraje;
        }

        public void setCilindraje(int cilindraje) {
            this.cilindraje = cilindraje;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    
    }
