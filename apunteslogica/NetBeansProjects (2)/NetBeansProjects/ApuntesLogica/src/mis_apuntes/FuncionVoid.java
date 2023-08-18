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
public class FuncionVoid   {     
                  
  static Scanner sc = new Scanner(System.in); 
  static int opc;

   public static void main(String[] args) {
      printBebidas();
      menuSnacks();
      menuDesayunos();
      menuAlmuerzos();
   }
        public static void printBebidas (){      
     System.out.println("Seleccione una opcion");
       
System.out.println("1. coca- cola"+ "2. manzana"+ "3. jugo natural");
opc = sc.nextInt();
switch (opc){
            case 1:
                System.out.println("coca-cola");
                break;
            case 2:
                System.out.println("manzana");
                break;
            case 3:
                System.out.println("jugo natural");
                break;
            default:
                System.out.println(" seleccione una opcion valida");         
}
}
        //------------------Funcion snacks----------------
public static void menuSnacks (){
System.out.println ("Seleccione una opcion");

System.out.println("1. deditos de queso" + "2. nachos con queso" + "3. maizitos");
opc =sc.nextInt();
switch (opc){
    case 1:
        System.out.println("deditos de queso");
        break;
    case 2:
        System.out.println("nachos con queso");
        break;
    case 3:
        System.out.println("maizitos");
        break;  
    default:
        System.out.println("Seleccione una opcion valida");  
}
}
public static void menuDesayunos(){
System.out.println("Seleccione una opcion");

System.out.println("1. Pancakes" + "2. Waffles" + "3.Huevos pericos");
opc=sc.nextInt();
switch (opc){
    case 1: 
        System.out.println("Pancakes");
        break;
    case 2:
        System.out.println("Waffles");
        break;
    case 3:
        System.out.println("Huevos pericos");
    default:
        System.out.println("Seleccione una opcion valida");
}       
}
public static void menuAlmuerzos(){
System.out.println("Seleccione una opcion");

System.out.println("1. Pastas" + "2. cazuela de mariscos" + "3. paella");
opc=sc.nextInt();
switch (opc){
    case 1:
        System.out.println("Pastas");
        break;
    case 2:
        System.out.println("cazuela de mariscos");
        break;
    case 3:
        System.out.println("paella");
        break;
    default:
       System.out.println("Seleccione una opcion valida"); 
}
}
public static void menuCena(){
System.out.println("Seleccione la opcion");

System.out.println("1. Ensalada caprese" + "2. Pollo al horno" + "3. Arroz oriental");
opc = sc.nextInt();
switch (opc){
    case 1:
        System.out.println("Ensalada caprese");
        break;
    case 2:
        System.out.println("Pollo al horno");
        break;
    case 3:
        System.out.println("Arroz oriental");
        break;
    default:
        System.out.println("Seleccione una opcion valida");
}   

}
}





