/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.Scanner;
/**
 *
 * @author 507
 */
public class Array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String flores[] = {"Crisantemo", "Loto","loto", "Margarita", "Girasoles", "Orquidea"};
        System.out.println("El tamaño del array es:" + flores.length);
        for (int j =0; j< flores.length; j ++){
        System.out.println("la flor es:" + flores[j]);
        }
        //podemos acceder a la posicion indicando la misma
        System.out.println("la flor en la posicion 0 es" + flores[0]);
        //podemos definir un array y agregar elementos en las diferentes posiciones

        int tallas[];//Esto es definir un array
        tallas = new int[7];// esto es declara un array
        int n= 0 ;
        System.out.println("el numero de tallas hombre es:);");
        n = sc.nextInt();
        int tallasHombre[] = new int[n];//se define y se declara el array
        System.out.println("la longitud del array es:" + tallasHombre.length);
        tallasHombre[0]=28;
        tallasHombre[1]=30;
        tallasHombre[2]=32;
        tallasHombre[3]=34;
        tallasHombre[4]=36;
        
        for(int i=0; i < tallasHombre.length; i++){
            System.out.println("la talla" + i + "es:" +  tallasHombre[i]);
        }
    }
}
