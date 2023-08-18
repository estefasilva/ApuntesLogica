/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorAritmetico {
    public static void main (String [] args){
        //sacar el promedio de puntos
        //por sancion perdio 50 puntos los dias martes y miercoles
        //le van a pagar por cada 50 puntos una bonificacion de 10.000 los dias lunes, martes, y miercoles y de 15.000 los jueves y viernes
        //cuanto dinero recibe por bonificacion en total y cuanto dejo de ganar por la sancion
        //debera imprimir un informe 
        
       int lunes;
       int martes;
       int miercoles;
       int jueves,viernes;
    //suma   
       lunes=10000; 
       martes=10000;
       miercoles= 10000;
       jueves=15000;
       viernes=15000;
       
     int puntosTotales = lunes + martes + miercoles + jueves + viernes;
        System.out.println("El total obtenido es " + puntosTotales);
          
      //perdio
       int puntosPerdidos = 50;
       //bonificacion
       int bonificacionPor50puntos= 10000;
       //bonificacion juevesviernes
       int bonificacionJuevesViernes= 15000;
       //sacar promedio puntos
       int promedioPuntos= (puntosTotales)/5;
       
       
       
       
       
        
       
       
        
        
        
        
        
    }   
}
