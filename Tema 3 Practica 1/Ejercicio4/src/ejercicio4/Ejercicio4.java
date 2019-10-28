/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Rosita
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la Diagonal mayor y menor");
        float D=entrada.nextInt();
       // System.out.println("Introduce la diagonal menor");
        float d=entrada.nextInt();
        System.out.println("El área del rombo es "+ (D*d)/2);
    }
    
}
