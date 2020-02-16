/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          boolean condi=true;
        
        do{
            Pattern p1=Pattern.compile("^.+@gmail.com$");//("`[_a-z0-9]+(.[_a-z0-9]*@(.[a-z0-9]+)*(.[a-z]{2,4}))$);
            Matcher m1=p1.matcher(JOptionPane.showInputDialog("email"));
        if(!m1.matches())
        {
            JOptionPane.showMessageDialog(null, "No es un email");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Es un email");
            condi=false;
        }
        }while(condi);
                
    }
    
    
}
