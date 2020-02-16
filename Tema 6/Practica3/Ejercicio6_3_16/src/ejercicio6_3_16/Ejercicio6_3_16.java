/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean condi = true;
        do{
        Pattern p1 = Pattern.compile("^([0][1-9]|[1-2][0-9]|30)/(0[469]|11)/(19[0-9]{2}|20[0-9]{2})");
        Pattern p2= Pattern.compile("^([0][1-9]|[1-2][0-9]|3[0-1])/(0[13578]|10|12)/(19[0-9]{2}|20[0-9]{2})");
        Pattern p3=Pattern.compile("^([0][1-9]|[1-2][0-9])/02/(19[0-9]{2}|20[0-9]{2})");
        String fecha=JOptionPane.showInputDialog("fecha dd/mm/yyyy");
        Matcher m1 = p1.matcher(fecha);
        
        if(m1.matches())
        {
            JOptionPane.showMessageDialog(null, " es una fecha");
            condi=false;
        }
        else
        {
            m1=p2.matcher(fecha);
            
           
          
            
            if(m1.matches()){
              
              JOptionPane.showMessageDialog(null, "Es un numero fecha");
            condi=false;
        }
          else{
              m1=p3.matcher(fecha);
             
              
              if (m1.matches()){
               JOptionPane.showMessageDialog(null, " es una fecha");
               condi=false;
          }
               else{
                       
                 JOptionPane.showMessageDialog(null, "no es una fecha");
                       
                       }
          }
          
              
          }
          
          
              
              
          
    }while(condi);
    }
    
    
}
