/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 203
 */
public class NominaPepito {
    public static void main (String[]args) {
        
        double salario=1250000; 
        double prestamo=160000; 
        double salud= salario*0.04; 
        double pension= salario*0.04; 
        double auxTransporte= 140606; 

         

        double totalDescuentos=prestamo+salud+pension; 
        double pagoNeto=salario-totalDescuentos+auxTransporte; 

         

        System.out.println("Planilla de descuentos:"); 
        System.out.println("Prestamo:"+ prestamo); 
        System.out.println("Descuento salud:"+ salud); 
        System.out.println("Descuento pension:"+ pension); 
        System.out.println("Auxilio Transporte:"+ auxTransporte); 

         

        System.out.println("Salario:"+ salario); 
        System.out.println("Total Descuentos:"+ totalDescuentos); 
        System.out.println("Pago Neto:"+ pagoNeto); 

    }
}
