/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class OperadorComparacion {
    public static void main (String[]args){
        
        int num1=10;
        int num2=7;
        boolean resultado=num1>=num2;
        System.out.println(resultado);
        
        
        String nombre1="Maria";
        String nombre2="Maria";
        boolean nombreIgual= nombre1 == nombre2;
        System.out.println("Es igual el Nombre??"+nombreIgual);
        
        double salario1 = 1160000;
        double salario2 = 1200000;
        
        boolean compSalarios= salario1 !=salario2;
        boolean  compSalarios2= salario1 == salario2;
        System.out.println("Los salarios son diferentes"+ compSalarios);
        System.out.println("Los salarios son iguales"+ compSalarios2);
        
        //vamos a incluir validaciones
        
        int edad= 25;
        if (edad <= 10){
           
       System.out.println("El niño puede ingresar");
        } 
        if (edad <= 12) {
            
            System.out.println("El niño/a puede ingresar");
        }else{
            System.out.println("El niño es mayor de 12 años y no puede ingresar");
       
        }
        
        //si pepito tiene menos de 2800 en la civica
        double pasaje= 2900;
        if (pasaje < 2800){
            System.out.println("Saldo insuficiente");
        }else{
            double saldo= pasaje- 2800;
            System.out.println("Su nuevo saldo"+saldo);
        }
        // si juan saco 2.9 en el examen de logica
        
        
        
                //si Andres es 3cm mas alto que Juan
                //si tengo el fin de semana libre
                //si me invitan a una fiesta
                //si quiero helado o quiero pizza
                
                
        
                   
        
    }
}
