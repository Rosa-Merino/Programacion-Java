/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] array=new int[Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño del array"))];
        String resultado="";
        int suma=0;
        
        for(int x=0; x<array.length; x++)
        {
            array[x]=(int)(Math.random()*10);
            String posicion= "Posicion "+ x +" con valor " + array[x] + " \n";
            resultado = resultado + posicion;
            suma=suma + array[x];
            
        }
        JOptionPane.showMessageDialog(null, resultado + " La suma total es " + suma);
    }
    
}
    
    

