/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
         
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate fechaUno = LocalDate.parse(fechaString, formato);
           
         fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
         LocalDate fechaDos = LocalDate.parse(fechaString, formato);
         
         int contador = 0;
         while(fechaUno.isBefore(fechaDos))
         {
             if (fechaUno.getDayOfWeek()==DayOfWeek.SUNDAY)
                 contador++;
             //le sumo un dia para que llegue hasta la fecha dos
             fechaUno = fechaUno.plusDays(1);
         }
         JOptionPane.showMessageDialog(null, "Hay " + contador + " domingos");
         
         
    }
    
}

