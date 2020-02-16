/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_5 {

    /**
     * @param args the command line arguments
     */
  
      public static void main(String[] args) {
     
      boolean programa = false;
           
      while(!programa){
        try{
            double[] arraylitros = new double[12]; 
            String cadena="";
            String[] meses = {"Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , 
            "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
        do
        {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("mes"));
            double litros= Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos litro han llovido?"));
            arraylitros[mes-1]=arraylitros[mes-1]+litros;       
            }
        while(JOptionPane.showInputDialog("Deseas continuar?").equalsIgnoreCase("si"));
       
        for(int x=0; x<meses.length; x++)
        {
            cadena = cadena +" En el mes de "+ meses[x] +" han llovido "+ arraylitros[x]+ " litros\n\n";
        }
     JOptionPane.showMessageDialog(null, cadena); 
    
      programa=true;
        } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR!");
        }
   }
  }
    
}