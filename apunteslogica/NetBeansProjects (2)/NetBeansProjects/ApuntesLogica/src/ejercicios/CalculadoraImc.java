/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
import java.util.Scanner;
public class CalculadoraImc {
     static Scanner sc= new Scanner(System.in);
    
     public static void main (String [] args){ 
     
     
     System.out.println("ingrese el peso:");
     double peso = sc.nextDouble();
     System.out.println("ingrese altura:");
     double altura = sc.nextDouble();
     double indice = peso /(altura*altura);
     System.out.println(indice);
     if (indice<18.5){
          System.out.println("Con bajo peso");
     }else if (indice  >= 18.5 && indice <= 24.9){
        System.out.println("peso normal");   
     }else if (indice >= 25 && indice <=29.9){
        System.out.println("Con sobre peso");
     }else if (indice >=30){
           System.out.println("Obesidad");
     }
     
     
     
}
}