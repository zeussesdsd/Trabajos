/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Zeus
 */
        

public class Vehiculo {

  private String placa;
  private double precio;
  private boolean alquilado;
  private double importe;

    public Vehiculo() {
    }

    public Vehiculo(String placa, double precio) {
        this.placa = placa;
        this.precio = precio;
        this.alquilado = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

  

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
  
  
    public String rentaVehiculo(){ //cuando ya se devolvió el vehiculo
        
        this.alquilado=false;
        return "";
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", precio=" + precio + '}';
    }
    
    
    
}


