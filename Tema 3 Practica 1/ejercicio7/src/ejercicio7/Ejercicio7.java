/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Rosita
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe el valor del cateto");
        double c1=entrada.nextInt();
        System.out.println("Escribe el valor del segundo cateto");
        double c2=entrada.nextInt();
        double hipotenusa=Math.sqrt((Math.pow(c1,2)+Math.pow(c2, 2)));
        hipotenusa=Math.rint(hipotenusa);
        System.out.println(hipotenusa);
        
        
        
        
        
      
    }
    
}
