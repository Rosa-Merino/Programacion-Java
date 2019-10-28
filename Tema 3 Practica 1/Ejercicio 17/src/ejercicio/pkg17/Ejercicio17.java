/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio17 {
    static int notamax=-1;
     static int notamin=11;
    static String nombremax,nombremin;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       for(int i=0;i<3;i++) 
       {
       String nombre=JOptionPane.showInputDialog(null,"Introduce tu nombre");
       int nota=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu nota"));
       
       
       calcularMaxMin(nota,nombre);
       
       
       
       }
       
       System.out.println(nombremax + " es la nota mas alta " + notamax);
       System.out.println(nombremin + " es la nota mas baja " + notamin);
       
     }
    
    public static void calcularMaxMin(int nota,String nombre){
        
        if (nota>notamax){
            notamax=nota;
            nombremax=nombre;
            
        }
        if (nota<notamin){
            notamin=nota;
            nombremin=nombre;
        }
        
    }
       
       
    
}
