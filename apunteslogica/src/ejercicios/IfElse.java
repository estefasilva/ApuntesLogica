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
public class IfElse {

public static void main (String []args){
    Scanner scanner = new Scanner (System.in);
      
   //int num1=30; int num2=32;
   // validar si el num1 es menor que el num2 y cual es la diferencia
   //validar si num1 es igual que num2
   //validar si num1 es diferente que num2
   //validar si num2 es mayor que num1 y cual es la difenrencia
   //castear num1 y num2 y realizar una division, una multiplicacion, sumar y restar
   //tipo num3=num1-num2;---tipo suma=num1+num2
   //realizar la siguiente operacion num1%num2 , explicar el resultado.
   
// Ejercicio 1: Validar si una persona es mayor de edad,puede sino no puede 
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (esMayorDeEdad(edad)) {
            System.out.println("Puede ingresar.");
        } else {
            System.out.println("No puedes ingresar.");
        }

// Ejercicio 2: Validar el pago de auxilio de transporte o salario convenido
        double salarioMinimo = 1300606;
        double auxTransporte = 140606;

        System.out.print("Ingrese el salario de la persona: ");
        double salarioPersona = scanner.nextDouble();

        if (pagaAuxTransporte(salarioPersona, salarioMinimo)) {
            System.out.println("Se pagará auxilio de transporte.");
        } else {
            System.out.println("Se pagará salario convenido.");
        }

// Ejercicio 3: Operaciones con num1 y num2
        int num1 = 30;
        int num2 = 32;

// Validar si num1 es menor que num2 y calcular la diferencia
        if (num1 < num2) {
            int diferencia = num2 - num1;
            System.out.println("num1 es menor que num2 y la diferencia es: " + diferencia);
        } else if (num1 == num2) { 
            System.out.println("num1 es igual a num2.");
        } else { 
            int diferencia = num2 - num1;
            System.out.println("num2 es mayor que num1 y la diferencia es: " + diferencia);
        }

// Castear num1 y num2 y realizar operaciones
        double num1Double = (double) num1;
        double num2Double = (double) num2;

        double division = num1Double / num2Double;
        double multiplicacion = num1Double * num2Double;
        double suma = num1Double + num2Double;
        double resta = num1Double - num2Double;

        System.out.println("num1 / num2 = " + division);
        System.out.println("num1 * num2 = " + multiplicacion);
        System.out.println("num1 + num2 = " + suma);
        System.out.println("num1 - num2 = " + resta);

        // Operación num1 % num2
        int modulo = num1 % num2;
        System.out.println("num1 % num2 = " + modulo + " (El resultado es el residuo de la división de num1 entre num2).");

        scanner.close();
    }

    public static boolean esMayorDeEdad(int edad) {
        // Se considera mayor de edad a partir de 18 años.
        return edad >= 18;
    }

    public static boolean pagaAuxTransporte(double salario, double salarioMinimo) {
        // Se considera que se paga auxilio de transporte si el salario es menor a dos salarios mínimos.
        return salario < 2 * salarioMinimo;
    }
}
       


