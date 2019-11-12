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
          int[] array = new int[Integer.parseInt(JOptionPane.showInputDialog("Tamaño del array"))];
        String resultado="";
        int suma = 0;
        for(int x=0; x<array.length;x++)
        {
            //doy un valor aleatorio de entre el 0 y el 9 a dicha posicion del array
            array[x]=(int)(Math.random()*9);
            //creo la linea de la posicion correspondiente al array
            String posicion = "Posición "+x+" con valor "+array[x]+"\n\n";
           //guardo cada linea en el string global para el resultado
            resultado = resultado+posicion;
            //sumo el nuevo valor a la suma total
            suma=suma+array[x];
        }
        JOptionPane.showMessageDialog(null, resultado+"La suma total es "+suma);
    }
    
}
    
    

