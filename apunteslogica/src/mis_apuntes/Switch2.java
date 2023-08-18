/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
import java.util.Scanner;
public class Switch2 {
     public static void main(String[] args) {
         
      //queremos crear un menu para selccionar platos en un restaurante.
      //cree una opcion para desayunos, almuerzo , cena, bebidas, snacks y comidas rapidas   
         
       Scanner sc = new Scanner(System.in);

        int opc;

        System.out.println("Bienvenido al restaurante");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo ");
        System.out.println("3. Cena ");
        System.out.println("4. Bebidas ");
        System.out.println("5. Snacks ");
        System.out.println("6. Comidas rapidas ");
        System.out.println("7.Salir");
        
        System.out.println("Seleccione una opcion:");
        opc = sc.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Haz seleccionado desayuno");
                break;
            case 2:
                System.out.println("Haz seleccionado almuerzo");
                break;
            case 3:
                System.out.println("Haz selecionado cena");
                break;
            case 4:
                System.out.println("Haz seleccionado bebida");
                break;
            case 5:
                System.out.println("Haz seleccionado snacks");
                break;
            case 6:
                System.out.println("Haz seleccionado comidas rapidas, seleccione una opcion:"
                        + " 1.Hamburguesa"
                        + " 2. Pizza "
                        + " 3. Lasagna"
                        );
                break;
            case 7:
                 System.out.println("Gracias por visitarnos");
                 break;
            default:
                 System.out.println("Ingrese una opcion valida");
                
        }

        
        
        
        
        
        
        
        
        
        
        
}
}