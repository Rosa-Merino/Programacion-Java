/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Rosita
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe tu nota del 0 al 10");
        double nota=entrada.nextDouble();
        
        if(nota<=3){
            System.out.println("Nota muy deficinete");
            
        }
        else {
                if(nota==4){
                    System.out.println("nota insuficiente");
                }
                else 
                {
                    if(nota==5){
                        System.out.println("suficiente");
                    }  
                    
                    else{
                        if(nota ==6){
                            System.out.println("bien");
                        }
                         else{ 
                                 if(nota>6 && nota<=8){
                                 System.out.println("notable");
                                 }
                                 else{
                                     if(nota>8 && nota<=10){
                                         System.out.println("sobresaliente");
                                     }
                                 }     
                                 }  
                            
                        }
                    }
                }
    
    
             
        }            
    }

