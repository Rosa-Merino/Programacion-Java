/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long nro = Long.parseLong(JOptionPane.showInputDialog(null,"Teclea el número"));
        int contador = 0, nroImpar = 1;
        long resultado = 0;
        while(contador < nro)
        {
            resultado = resultado + nroImpar;
            nroImpar = nroImpar + 2;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null,resultado);
    }
    
}
