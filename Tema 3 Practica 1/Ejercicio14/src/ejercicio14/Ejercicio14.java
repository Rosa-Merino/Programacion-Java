/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int suma=0;
        for(int i=0;i<10;i++){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Escibe un numero"));
        
            suma = suma + num;
           
        }
        JOptionPane.showMessageDialog(null,"El resultado de la suma es "+ suma);
        
    }
    
}
