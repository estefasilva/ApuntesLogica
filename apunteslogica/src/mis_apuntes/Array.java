/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.Scanner;
/**
 *
 * @author desarrollo
 */
public class Array {

    public static void main(String[] args) {

        String name[] = new String[4];
        name[0] = "maria";
        name[1] = "juan";
        name[2] = "andres";
        name[3] = "luisa";

        System.out.println("Posicion 1:" name[1] );
    for (int i = 0; i < name.length; i++) {

            System.out.println("posicion" + i + "es:" + name[i]);

        }

    }
}
