/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
//import java.util.Scanner;
import java.util.Scanner;
public class Condicional {
  static Scanner sc= new Scanner(System.in);
  
  
    public static void main (String [] args){
        //------------------------//
        int num1=5;
        int num2=5;
        boolean isEqual=num1==num2;
        System.out.println("Es igual?"+ isEqual);
        
        String word ="Hola";
        String word2 ="hola";
        boolean result =word.equals(word2);
        System.out.println("Es igual:"+result);
        
        //-----------------------//
        
        String name = "Pepito";
        String mail="pepito@mail.com";
        int  password = 123456;
   System.out.println("ingrese su email:");
   String emailUser = sc.nextLine();
   System.out.println("ingrese su contraseña");
   int passUser=sc.nextInt();
   
        boolean esCorrecto= mail.equals(emailUser);
        boolean esCorrecto2= password== passUser;
        
    if(esCorrecto&& esCorrecto2){
        System.out.println("Bienvenido"+ name);
          
    }else{
        System.out.println("revise credenciales");
    }
       
        
        
}
}