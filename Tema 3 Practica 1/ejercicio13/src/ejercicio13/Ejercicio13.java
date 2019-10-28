/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        int contchicas=0;
        int contchicos=0;
        int personas=0;
        for(int i=0;i<30;i++)
            
        {
            int peso=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu peso"));
            
            int edad=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad"));
            
        
            String nombre=JOptionPane.showInputDialog("Escribe tu nombre");
            
            String sexo=JOptionPane.showInputDialog("sexo:masculino o femenino");
            double estatura=Double.parseDouble(JOptionPane.showInputDialog("Escribe tu estatura"));
            
       
            if(sexo.equals("femenino"))
            {
                if(peso>60 && estatura>1.60)
                {
                  contchicas++;  
                }
            }
            else 
                {
                    if(peso>70 && estatura>1.70) 
                    {
                     contchicos++;
                    }    
                        
                }    
            
             
            
           
          
        }
         
         System.out.println("El numero de chicas aptas es " + contchicas);
         System.out.println("El numero de chicos aptos es " + contchicos);  
                        
    } 
}
