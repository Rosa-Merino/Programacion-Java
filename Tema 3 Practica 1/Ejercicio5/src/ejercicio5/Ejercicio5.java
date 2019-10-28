/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Rosita
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner entrada=new Scanner(System.in);
       System.out.println("Escribe la temperatura en grados centigrados");
       int grados=entrada.nextInt();
       double resultado=(1.8*grados)+32;
       System.out.println("la temperatura en Fahrenheit "+resultado);
       
       
      
    }
    
}
