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
public class RaizCuadrada {
    public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingrese el numero a sacarle raiz cuadrada:");
     int num = leer.nextInt();
     
     
        int raizC = raiz(num);
        if (raizC == -1) {
            System.out.println("Raiz no encontrada o no existe en los numeros reales" + num + "es:" + raizC);
        } else {
            System.out.println("la raiz cuadrada de" + num + "es:" + raizC + "O" + (-1*raizC));
     }
    }

    public static int raiz(int num) {
        int contador = 1;
        int resultado = 0;
        int raiz = 0;
        boolean salida = false;

        while (contador < num && salida == false) {
            resultado = (int) (num / contador);

            if (resultado == contador) {
                raiz = resultado;
                salida = true;
            } else {
                contador++;
                raiz = - 1;
                salida = false;
            }
        }
        if (raiz != -1 && num >=0) {
            return resultado;
        } else {
            return -1;
        }

    }    
    }
    
    

