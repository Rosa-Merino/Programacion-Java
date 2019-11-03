/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_4;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Rosita
 */
public class Ejercicio3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       /*Intento guiado por internet
        String fechastring1=JOptionPane.showInputDialog("Introduce una fecha con el siguiente formato dd/mm/yy");
        String  fechastring2=JOptionPane.showInputDialog("Introduce una segunda fecha con el siguiente formato dd/mm/yy");
         
         SimpleDateFormat sc=new SimpleDateFormat();
     try{    
         Date fechauno=sc.parse(fechastring1);
         Date fechados=sc.parse(fechastring2);
         
         long diferencia= fechauno.getTime()-fechados.getTime();
         
         JOptionPane.showMessageDialog(null, "La diferencia de dias es " + diferencia/ (3600000 *24));
       
        
     }catch(Exception e) {
         JOptionPane.showMessageDialog(null, "error en el programa");
         
     }
    }
    */
       
       
        try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
        
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
            
            // Validaciones ???
            LocalDate fechaDos = LocalDate.of(año,mes,dia);
          
            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia es de " + period.getYears() + " años" + period.getMonths() + " meses y " + period.getDays() + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    

}
    
