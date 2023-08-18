/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class GradosFarenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        double fahrenheit, celsius;
        
        while ( contador < 3){
            switch (contador){
                case 0:
            System.out.println("Ingrese la temperatura en grados fahrenheit:");
            fahrenheit= input.nextDouble();
            celsius = (fahrenheit - 32)* 5/9;
            
            System.out.println(fahrenheit + " grados fahrenheit equivalen a:" + celsius + "grados celsius.");
            break;
                default:
            }
            contador++;
        }
    }
}

        
      
