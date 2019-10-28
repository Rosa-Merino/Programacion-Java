/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Rosita
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la base");
        int base=entrada.nextInt();
        System.out.println("Introduce la altura");
        int altura=entrada.nextInt();
        System.out.println("El perimetro del rectangulo es "+((2*base)+(2*altura)));
        
    }
    
}
