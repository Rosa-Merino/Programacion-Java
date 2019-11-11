/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        char caracter = JOptionPane.showInputDialog("Teclea el carácter").charAt(0);
       
        int veces = buscar(cadena, caracter);
        
        
        String mensaje = String.format("El carácter %c aparece %d veces en la cadena %s",caracter,veces,cadena);
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static int buscar(String cadena, char c){
        int contador = 0;
        for(int y = 0; y < cadena.length(); y++)
            if ( cadena.charAt(y)== c)
                contador++;
        return contador;
       
    }
    
}
