/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import javax.swing.JOptionPane;


/**
 *
 * @author Rosita
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      int num1=Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
      int num2=Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
      int num3=Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
      
     if (num1>num2 && num1>num3) {
	System.out.println("El número mayor es: " +num1);
	if(num2>num3) 
            System.out.println("El número menor es: " +num3);
        else
            System.out.println("El número menor es: " +num2);
     }
     else
     {   //n1 no es el mas grande
         if (num2>num3)
         {
             System.out.println("El número mayor es: " +num2);
             if (num1>num3)
                 System.out.println("El número menor es: " +num2);
         
             else 
                            System.out.println("El número menor es: " +num1);
     }
         else
         {
           System.out.println("El número mayor es: " +num3);  
         }
            if (num1>num2){
                System.out.println("el numero menor es :" + num2);
                
            }
            else{
                System.out.println("El numero menor es :"+ num1);
            }
                
     }
    
    }
}



                                
      

      
      
    
    
 

