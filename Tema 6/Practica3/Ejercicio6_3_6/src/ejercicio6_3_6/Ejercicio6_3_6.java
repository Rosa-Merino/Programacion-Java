/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            boolean condi = true;
        do{
        Pattern p1 = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
        Matcher m1 = p1.matcher(JOptionPane.showInputDialog("Matrícula"));
        if(!m1.matches())
        {
            JOptionPane.showMessageDialog(null, "No es una matrícula");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ES UNA MATRÍCULA");
            condi=false;
        }
    }while(condi);
    }
    
}
