/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean condi=true;
        
        do{
            Pattern p1=Pattern.compile("^([A-z]+[ ]?[A-z]+)$");
            Matcher m1=p1.matcher(JOptionPane.showInputDialog("Nombre"));
        if(!m1.matches())
        {
            JOptionPane.showMessageDialog(null, "No es un nombre");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Es un nombre");
            condi=false;
        }
        }while(condi);
                
    }
    
}
