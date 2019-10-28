/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Rosita
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escribe la nota de 0 a 10");
        int nota=entrada.nextInt();
        if(nota>=5 && nota<=10){
            System.out.println("Has aprobado");
        }
        else {
            System.out.println("Has suspendido");
        }
    }
    
}
