/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean programa = false;
       while(!programa)
       {
           try
           {
               char[] letras = new char[28];
               int[] contador = new int[28];
               for(int x=1 ; x<letras.length ; x++ )
                {
                    letras[x]=(char)('A' + x-1);
                }
               String cadena=JOptionPane.showInputDialog("Escribe una palabra");
               cadena=cadena.toUpperCase();
               for(int x=cadena.length()-1;x>0;x--)
               {
               int posicion = Arrays.binarySearch(letras, cadena.charAt(x));
               contador[posicion]=contador[posicion]+1;
               }
               String completo="";
               for(int x=1; x<contador.length-1;x++)
               {
                   completo=completo+"La letra "+letras[x]+" aparece "+contador[x]+" veces\n\n";
               }
               JOptionPane.showMessageDialog(null, completo);
               programa=true;
           }
            catch(Exception e)
                   {
                   JOptionPane.showMessageDialog(null, "ERROR!");
                   }
       }
    }
    
}
    

