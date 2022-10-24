/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Zeus
 */
public class Cheques extends Cuentas {
    
    private double comision;

    public Cheques(double comision, int nCuenta, String nCliente, double saldo) {
        super(nCuenta, nCliente, saldo);
        this.comision = comision;
    }

    public Cheques() {
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String Consulta() {
        return "La comision por uso de chequera es  "+this.comision+" El saldo es  "+this.saldo+ " N cuenta  "+this.nCuenta;
    }

    @Override
    public double Depositar() {
        return 0;
    }

    @Override
    public double Retirar(Date dato, double retiro) {
        
       return 0;
    }
    
    public double Comision(double cheque) {
        
        this.comision=this.comision/100;
        
        double proceso=this.comision*cheque;
        
        this.comision=proceso;
        
        this.saldo=this.saldo-this.comision;
        return comision;
    }
    
    
}
