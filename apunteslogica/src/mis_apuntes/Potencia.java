/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base:");
        int num1 = leer.nextInt();
        System.out.println("ingrese el exponente");
        int num2 = leer.nextInt();

        int resultado = potencia(num1, num2);
        System.out.println("el resultado del" + num1 + "elevado a" + num2 + "es: " + resultado);
    }

    //funcion para la potencia
    public static int potencia(int num1, int num2) {
        int resultado = 1;
        int contador = 1;

        //ejecucion del while
        while (contador <= num1) {
            resultado *= num1; //resultado = resultado *num1;
            contador++; //contador = contador +1;
        }
        return resultado;

    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
