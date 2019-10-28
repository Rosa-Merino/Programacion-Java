/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_2;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aptoV="";
         String aptoC;
         String aptoJ;
         String aptoS;
    do{
        try{
        aptoV=JOptionPane.showInputDialog("Introduce si eres apto o no apto en Visual.Net");
        if(!aptoV.equalsIgnoreCase("apto") && !aptoV.equalsIgnoreCase("no apto")){
            throw new excepciones();
        }
        } catch (excepciones e)
                {
            
            JOptionPane.showMessageDialog(null,"Has metido mal el dato");
        }   
    } while(!aptoV.equalsIgnoreCase("apto") && !aptoV.equalsIgnoreCase("no apto"));    
        aptoC=JOptionPane.showInputDialog("Intrdue si eres apto o no apto en Cobol");
        aptoJ=JOptionPane.showInputDialog("Introduce si eres apto o no apto en Java");
        aptoS=JOptionPane.showInputDialog("Intoduce si eres apto o no apto en SQL");
        
        
        
        if (aptoV.equalsIgnoreCase("apto")&& aptoC.equalsIgnoreCase("apto") && aptoJ.equalsIgnoreCase("apto")&& aptoS.equalsIgnoreCase("apto")){
            
            JOptionPane.showMessageDialog(null, "La nota es sobresaliente");
            
        }
          else  if (aptoS.equalsIgnoreCase("apto") && aptoC.equalsIgnoreCase("apto") && (aptoV.equalsIgnoreCase("apto")||aptoJ.equalsIgnoreCase("apto"))){
                
                JOptionPane.showMessageDialog(null, "La nota es Notable");
            }
            
            else if(aptoS.equalsIgnoreCase("apto") && aptoC.equalsIgnoreCase("apto")){
                
                JOptionPane.showMessageDialog(null, "La nota es Bien");
                
            } else if ((aptoC.equalsIgnoreCase("apto") || aptoS.equalsIgnoreCase("apto")) && (aptoJ.equalsIgnoreCase("apto")|| aptoV.equalsIgnoreCase("apto"))){
                
               JOptionPane.showMessageDialog(null, "La nota es Suficiente");
               
            } 
            
            
        else {
                
                 JOptionPane.showMessageDialog(null, "La nota es Insuficiente");
                
            }        
       
        
        
       
        
    }
    
    
    
}
