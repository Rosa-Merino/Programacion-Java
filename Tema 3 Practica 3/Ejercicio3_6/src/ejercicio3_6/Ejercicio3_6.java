/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_6;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       // constantes
       final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
       final LocalDate VERANO = LocalDate.of(2019,6,21);
       final LocalDate OTOÑO = LocalDate.of(2019,9,21);
       final LocalDate INVIERNO = LocalDate.of(2019,12,21);
       
       boolean programa;
       do
       {
           try
           {
               //el año lo pongo yo para comparar.
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
                LocalDate fecha = LocalDate.of(2019,mes,dia);

               if (fecha.isBefore(PRIMAVERA))
                   JOptionPane.showMessageDialog(null,"Invierno");
               else
                     if (fecha.isBefore(VERANO))
                        JOptionPane.showMessageDialog(null,"Primavera");
                    else
                           if (fecha.isBefore(OTOÑO))
                                JOptionPane.showMessageDialog(null,"Verano");
                           else
                                JOptionPane.showMessageDialog(null,"Otoño");
               programa=true;
               
           }
           catch(DateTimeException e)
           {
               JOptionPane.showMessageDialog(null," Valores invalidos para convertirlos en fecha");
               programa = false;
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas");
               programa = false;
           }
       }
       while(!programa);
    }
    
}
