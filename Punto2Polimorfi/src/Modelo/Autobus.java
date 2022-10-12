/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Zeus
 */
public class Autobus extends Vehiculo {
    
    private double cKilometros;
    private double cKdevueltos;


    public Autobus() {
    }

    public Autobus(double cKilometros, double cKdevueltos, String placa, double precio) { //precio por kilometro
        super(placa, precio);
        super.setAlquilado(true);
        this.cKilometros = cKilometros;
        this.cKdevueltos = cKdevueltos;
    }

    public double getcKilometros() {
        return cKilometros;
    }

    public void setcKilometros(double cKilometros) {
        this.cKilometros = cKilometros;
    }

    public double getcKdevueltos() {
        return cKdevueltos;
    }

    public void setcKdevueltos(double cKdevueltos) {
        this.cKdevueltos = cKdevueltos;
    }
    
    @Override
    public String rentaVehiculo(){    //cuando ya se devuelve el vehiculo
        super.rentaVehiculo();
        
        double totalkilometros=(this.cKdevueltos-this.cKilometros);
        super.setImporte(totalkilometros*super.getPrecio());
        return "";
    }

    @Override
    public String toString() {
        return "Placa del autobus  "+super.getPlaca()
                +"\n Precio por Kilometro  $ "+super.getPrecio()   //impresion de datos
                +"\n Cantidad de kilometros cuando se rento  "+cKilometros+" km"
                +"\n Cantidad de kilometros devueltos  "+cKdevueltos+" km"
                +"\n Importe a pagar  $ "+super.getImporte();
    }
    
    
    
}
