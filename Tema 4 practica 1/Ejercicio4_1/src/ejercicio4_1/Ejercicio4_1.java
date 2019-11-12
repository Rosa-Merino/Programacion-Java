/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_1 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
       double[] array = new double[10];
      
        array[0] = Double.parseDouble(JOptionPane.showInputDialog("introduce un numero"));
          double maximo = array[0];
          double minimo = array[0];

//for para pedir todos los valores de nuestro array
      
      for(int x=1; x<array.length; x++)
       {
          array[x] = Double.parseDouble(JOptionPane.showInputDialog("introduce un numero"));
          if(array[x]>maximo)
          {
              maximo = array[x];
          }
          else
              if(array[x]<minimo)
              {
                  minimo = array[x];
              }
       }
      JOptionPane.showMessageDialog(null, "el máximo es "+maximo+" y el mínimo es "+minimo);
    }
    
}
