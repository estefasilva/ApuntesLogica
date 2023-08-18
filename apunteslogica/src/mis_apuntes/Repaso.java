/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Repaso {
    
    public static void main(String [] args){
        
        //Variables
        
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        long num5 = 2147483647;
        float num6 = 4.556842f; 
        double num7 = 5.45875441556988744555544878744;
        char caracter = 64;
        boolean isON; //Cuando declaramos una variable booleana esta por defecto es falso
        
        isON = true;  
     
        
        //System.out.println("Float : "+ num6);
        //System.out.println("Double : "+ num7);
        System.out.println (caracter);
        System.out.println (isON);
        
        //Operadores Aritmeticos/
       //+,-,*,/,%
       
       int a;
       int b;
       int c;
       
       int d,e;
       
       a=500; 
       b=400;
       c= 390;
       d=510;
       e=300;
       
       //suma
       
       int puntosTotales = a + b + c + d + e;
       
           System.out.println("El total obtenidos por Pepito es " + puntosTotales);
        
           
         //variable tipo string
         //String es un objeto
         String name = "Pepito";
         String name2 = "Pepito";
         
         boolean compare = name.contentEquals(name2);
         
         System.out.println("Es igual? "+compare);
         
         
         
         
         
         
    }
}
