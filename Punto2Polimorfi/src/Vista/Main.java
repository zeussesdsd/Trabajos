/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Autobus;
import Modelo.Tractor;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Main {
    
    public static void main(String[] args) throws ParseException {
        
        Autobus a=new Autobus(1.5, 5.6, "A23", 2500);
        a.rentaVehiculo();
        System.out.println(a);
        
        System.out.println("----------------------------------------------------");
        
        SimpleDateFormat formato=new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat format2=new SimpleDateFormat("dd/mm/yyyy");
        
        Tractor b=new Tractor(formato.parse("11/10/2022"),format2.parse("20/10/2022"), "A23232", 5500);
        b.rentaVehiculo();
        System.out.println(b);
        
        
       
    }
}
