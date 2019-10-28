/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String continuar;
        int personas=0;
        int totaledad=0;
        do
        {
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        personas++;
        totaledad = totaledad + edad;//totaledad += edad
        continuar=JOptionPane.showInputDialog("Quieres continuar: si o no");
        }
        while(continuar.equals("si"));
        double media=totaledad/personas;
        JOptionPane.showMessageDialog(null,"El promedio de edad es " + media );
     }
    
}
