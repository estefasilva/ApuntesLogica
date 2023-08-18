/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**

 * @author desarrollo
 */
public class Lista {

    public static void main(String[] args) {

        String[] names = {"Maria", "Juan", "Andres", "Luisa"};

        System.out.println("El elemento 0 es:" + names[0]);
        System.out.println("El elemento 1 es:" + names[1]);
        System.out.println("El elemento 2 es:" + names[2]);
        System.out.println("El elemento 3 es:" + names[3]);

        int size = names.length;
        System.out.println("El tamaño de names es:" + size);
        for (int i = 0; i < names.length; i++) {

            System.out.println("El elemento en la posicion" + i + "es" + names[i]);
        }
/*
        System.out.println("------------------------------------");

        String[] frutas = {"Uchuva", "uva", "coco", "piña"};

        System.out.println("El elemento 0 es:" + frutas[0]);
        System.out.println("El elemento 1 es:" + frutas[1]);
        System.out.println("El elemento 2 es:" + frutas[2]);
        System.out.println("El elemento 3 es:" + frutas[3]);

        int size = frutas.length;
        System.out.println("El tamaño la fruta es:" + size);
        for (int i = 0; i < frutas.length; i++) {

            System.out.println("El elemento en la posicion" + 1 + "es" + frutas[i]);
        }
        System.out.println("------------------------------------");

        String[] redes = {"facebook", "instagram", "twitter", "tiktok"};

        System.out.println("El elemento 0 es:" + redes[0]);
        System.out.println("El elemento 1 es:" + redes[1]);
        System.out.println("El elemento 2 es:" + redes[2]);
        System.out.println("El elemento 3 es:" + redes[3]);

        int size = redes.length;

        System.out.println("El tamaño de la red es:" + size);
        for (int i = 0; i < redes.length; i++) {

            System.out.println("El elemento en la posicion" + i + +"es" + redes[i]);
*/
        }

    }

