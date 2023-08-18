/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 503
 */
import java.util.Scanner;
public class Calculadora {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Por favor, ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();

        // Mensaje de bienvenida
        System.out.println("¡Hola, " + usuario + "! Bienvenido/a a la calculadora.");

        // funcion while
        while (true) {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break; 
            }

            System.out.print("Ingrese el primer número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + dividir(numero1, numero2));
                    } else {
                        System.out.println("No es posible dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Elija una opción válida.");
            }
        }

        sc.close();
    }

    // Funciones para realizar las operaciones matemáticas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

    
