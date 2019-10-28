/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aprobados=0;
        String continuar;
        do
        {
            double nota=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu nota"));
            
            if (nota>=6)
            {
             aprobados++;    
            }
            continuar=JOptionPane.showInputDialog("Quieres continuar: si o no");
        }
        while(continuar.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null,"han aprobado" + aprobados);
    }
    
}
