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
public class Cajero {

    public static void main(String[] args) {
        int saldo = 300000;
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 300000;
        int saldoActual = saldoInicial;

        System.out.println("Bienvenido");
        System.out.println("Su saldo actual es de $" + saldoInicial);
        while (true) {
            System.out.println("cuanto desea retirar? (maximo $50000)");
            int montoRetiro = scanner.nextInt();
            if (montoRetiro > saldoActual) {
                System.out.println("No tiene suficiente  saldo para realizar la transaccion");
                break;
            } else if (montoRetiro > 50000) {
                System.out.println("El monto maximo que puede retirar es 50000.");
            } else {
                saldoActual = montoRetiro;
                System.out.println("retiro $" + montoRetiro + "su saldo actual es de $" + saldoActual);
                if (saldoActual == 0) {
                }
                System.out.println(" Ha alcanzado el limite de su saldo");
            break;
        }
        System.out.println("Desea realizar otro retiro?(S/N)");
        String respuesta = scanner.next();
        if (!respuesta.equalsIgnoreCase("S")) {
            break;

            }
        }
        System.out.println("Gracias por su visita");
        scanner.close();
    }
}
    

