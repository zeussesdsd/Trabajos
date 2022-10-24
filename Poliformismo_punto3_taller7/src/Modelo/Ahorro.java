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
public class  Ahorro extends Cuentas {
    
    private Date fVencimiento;
    private double porcentaje;

    public Ahorro(Date fVencimiento, double porcentaje, int nCuenta, String nCliente, double saldo) {
        super(nCuenta, nCliente, saldo);
        this.fVencimiento = fVencimiento;
        this.porcentaje = porcentaje;
    }

    public Ahorro() {
    }

    public Date getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(Date fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String Consulta() {
        return "Fecha de vencimiento  "+this.fVencimiento+ "  porcentaje de interes mensual "+ this.porcentaje+ " Saldo  "+this.saldo
                + "\n Numero de cuenta "+this.nCuenta+ "  Dueño  "+ this.nCliente;
    }

    @Override
    public double Depositar() {
        double porcen=this.porcentaje/100;
        porcen= this.saldo*porcen;
       this.saldo= porcen+this.saldo;
       
       return saldo;
    }

    @Override
    public double Retirar(Date dato,double retiro) {
      
        if (dato.compareTo(this.fVencimiento)==0) {
             if (this.saldo>retiro){
                 this.saldo=this.saldo-retiro;
                 System.out.println("Saldo Retirado Realizado Exitosamente");
             }
             else {
                 System.out.println("Error, Verifique su saldo");
             }  
        }
        
        if (dato.compareTo(this.fVencimiento)!=0){
            System.out.println("Solo es posible retirar en la fecha de vencimiento");
        }
        return this.saldo;
      }
   
    
}

