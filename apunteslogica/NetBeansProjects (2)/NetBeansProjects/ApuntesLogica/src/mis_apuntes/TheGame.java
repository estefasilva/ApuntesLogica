/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 503
 */
public class TheGame {
    public static void main (String[]args){
    
    int lifes=5;
    
    int points=0;
    
    int num;
    
    while (lifes !=0 ){
      num=(int)(Math.random()*100);  
        if(num==0){
            lifes--;
            System.out.println("Le queda"+ lifes + "vidas");
        }else{
        points++;
            System.out.println("Has ganado" + points);
        }
    
    }
        
    
    }
}
//como saber si un numero es par o impar usando random y modulo, haciendo ciclo while