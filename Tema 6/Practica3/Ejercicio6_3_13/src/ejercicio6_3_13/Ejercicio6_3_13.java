/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        boolean condi = true;
        do{
        int decimal=Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuemor de decimales"));
        Pattern p1 = Pattern.compile("^-?[0-9]+[.,][0-9]{"+decimal+"}$");
        Matcher m1 = p1.matcher(JOptionPane.showInputDialog("numero real con"+  decimal + " decimales") );
        if(!m1.matches())
        {
            JOptionPane.showMessageDialog(null, "No es un numero real con" +  decimal + " decimales");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Es un numero real cpn" +  decimal + " decimales");
            condi=false;
        }
    }while(condi);
    }
    
    
    
}
