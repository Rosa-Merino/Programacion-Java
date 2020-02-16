/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_1;

/**
 *
 * @author Rosita
 */
import Clases.Circulo;
import javax.swing.JOptionPane;
public class Ejercicio6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1=new Circulo();
        c1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("introduce el radio")));
        
        JOptionPane.showMessageDialog(null, "el area del circulo con radio "+ c1.getRadio() + " es " + c1.getArea() + 
                                    " la longitud del ciculo es " + c1.getLongitud() + " El volumen es " +
                                     c1.getVolumen());
        
       
    }
    
}
