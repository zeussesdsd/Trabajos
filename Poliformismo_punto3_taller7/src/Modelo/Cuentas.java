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
public abstract class  Cuentas {
    
    protected int nCuenta;
    protected String nCliente;
    protected double saldo;

    public Cuentas(int nCuenta, String nCliente, double saldo) {
        this.nCuenta = nCuenta;
        this.nCliente = nCliente;
        this.saldo = saldo;
    }

    public Cuentas() {
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract String Consulta();
    public abstract double Depositar();
    public abstract double Retirar(Date dato,double retiro);
}
