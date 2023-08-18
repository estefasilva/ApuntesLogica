/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class EjerciciosComparacion {
    public static void main (String []args){
         //si pepito tiene menos de 2800 en la civica
        double pasaje= 2900;
        if (pasaje < 2800){
            System.out.println("Saldo insuficiente");
        }else{
            double saldo= pasaje- 2800;
            System.out.println("Su nuevo saldo"+saldo);
        }
        // si juan saco 2.9 en el examen de logica
        
         double nota=2.9;
         double notaMinima=3.0;
         if (nota>= notaMinima){
            System.out.println("Gana el examen");
         }else{
        
             System.out.println("Juan no aprobo");
         }
    }
    {
         
                //si Andres es 3cm mas alto que Juan
                
      boolean valor1 = true;
      boolean valor2 =false;
      if (valor1==valor2){
          System.out.println("Los valores son iguales");
      }else{
          System.out.println("Los valores son diferente");
      }      
         int alturaAndres=180;
         int alturaJuan=177;
         if (alturaAndres> alturaJuan+3){
             System.out.println("Andres es 3cm mas alto que Juan");
         }else{
             System.out.println("Andres no es mas alto que juan");   
         }
                //si tengo el fin de semana libre
        boolean Finsemanalibre= true;
        boolean noFinsemanalibre=false;
        if (Finsemanalibre==noFinsemanalibre){
            System.out.println("tengo fin de semana libre");
        }else{
            System.out.println("no tengo el fin de semana libre");
        }
           
                //si me invitan a una fiesta
        boolean meInvitan=true;
        boolean nomeInvitan=false;
        if(meInvitan==nomeInvitan){
            System.out.println("me invitan a una fiesta");
        }else{
            System.out.println("no me invitan a la fiesta");
        }
                //si quiero helado o quiero pizza
         boolean quieroPizza=true;
         boolean quieroHelado=true;
         if (quieroPizza || quieroHelado){
             System.out.println("me gustan las dos opciones");
         }else{
             System.out.println("cualquiera de las dos me gustan");
         }
                
                
                
    }
    
}
