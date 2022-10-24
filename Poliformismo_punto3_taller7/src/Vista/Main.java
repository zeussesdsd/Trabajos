/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.util.Date;
import Modelo.Ahorro;
import Modelo.Cheques;
import Modelo.Cuentas;

/**
 *
 * @author Zeus
 */
public class Main {

    
    public static void main(String[] args) {
        
        Cuentas a= new Ahorro(new Date(122, 10, 22), 5, 2323, "Jesus de la hoz",5000);
        
        a.Depositar();
        a.Depositar();
        System.out.println(a.Consulta());  //para saber si funciona el depositar
        a.Retirar(new Date(122, 10, 22), 200);
        
        System.out.println(a.Consulta()); //para saber si funciona retirar
        
        System.out.println("--------------------------------------------------------------");
        
        Cheques b=new Cheques(10, 3333, "mariano", 555);
        b.Comision(3000);
        System.out.println(b.Consulta());  //Para calcular la comision
        
        
    }
    
}
