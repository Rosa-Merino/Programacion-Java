/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_4;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="si";
        int alumnos=0;
        double media=0;
        double mediatotal=0;
         
     while(!nombre.equalsIgnoreCase("FIN")){    
       try{ 
        nombre=JOptionPane.showInputDialog("Escribe el nombre del alumno") ;  
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
        int n4=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
        int n5=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
        int n6=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
         
        int suma=(n1+n2+n3+n4+n5+n6);
      
         media=(suma)/6;
           JOptionPane.showMessageDialog(null, "La nota media de " + nombre + "es " + media);
           alumnos++;
           
         nombre=JOptionPane.showInputDialog("si no quieres continuar escribe FIN" );
           
        mediatotal= mediatotal + media;
        
        
         
         
       }
       catch (Exception e){
            
            }
        
   
        
    
  
        
    }
     
      JOptionPane.showMessageDialog(null, "La nota media de los alumnos es" + mediatotal/alumnos);
     
    
    }
    
}
