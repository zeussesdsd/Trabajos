/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;




public class Tractor extends Vehiculo {
   
    private Date fRenta;
    private Date fDevolucion;
   
   
  
  
    private SimpleDateFormat formato=new SimpleDateFormat("dd/mm/yyyy");    

    public Tractor(Date fRenta, Date fDevolucion, String placa, double precio) {
        super(placa, precio);
        this.fRenta = fRenta;
        this.fDevolucion = fDevolucion;
        super.setAlquilado(true);
    }

    public Date getfRenta()  {
       
        return fRenta;
    }

    public void setfRenta(Date fRenta) {
        this.fRenta = fRenta;
    }

    public Date getfDevolucion() {
        return fDevolucion;
    }

    public void setfDevolucion(Date fDevolucion) {
        this.fDevolucion = fDevolucion;
    }

   

    public SimpleDateFormat getFormato() {
        return formato;
    }

    public void setFormato(SimpleDateFormat formato) {
        this.formato = formato;
    }

  
    
    
    @Override
    public String rentaVehiculo(){
        super.rentaVehiculo();
        
        long diferencia=this.fDevolucion.getTime()-this.fRenta.getTime();
        
        TimeUnit tiempo=TimeUnit.DAYS;
        
        long dias=tiempo.convert(diferencia ,TimeUnit.MILLISECONDS);
        
        super.setImporte(dias*super.getPrecio());
        
        return "";
    }
    
  
    @Override
    public String toString() {
        
         
        return "    Tractor   "
                +"\n Placa del tractor  "+super.getPlaca()
                +"\n Precio por dia  $ "+super.getPrecio()
                +"\n Fecha de renta  "+formato.format(fRenta)
                +"\n Fecha de devolucion  "+formato.format(fDevolucion)
                +"\n Importe de renta por dia  $ "+super.getImporte();
    }
    
    
}
