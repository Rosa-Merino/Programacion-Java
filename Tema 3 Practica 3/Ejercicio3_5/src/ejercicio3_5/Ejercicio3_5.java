/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_5;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String mesLetra="";
    String diaSemana="";
    boolean programa=true;
    do{
    try{
        
     
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
        // Validaciones??
        // Construir la fecha
     
         
         
         
           // Con LocalDate
          LocalDate fecha = LocalDate.of(ano,mes,dia);
          fecha = fecha.plusDays(100);
         
          
         
        
       
       
        
         
         // Para visualizar el día y el mes en letras tendré que plantear switch
         
         switch(fecha.getDayOfWeek())
         {
             case MONDAY: 
                 diaSemana = "Lunes";
                 break;
             case TUESDAY: 
                 diaSemana = "Martes";
                 break;
             case WEDNESDAY: 
                 diaSemana = "Miercoles";
                 break;
             case THURSDAY: 
                 diaSemana = "Jueves";
                 break;
             case FRIDAY: 
                 diaSemana = "Viernes";
                 break;
             case SATURDAY: 
                 diaSemana = "Sábado";
                 break;
             case SUNDAY: 
                 diaSemana = "Domingo";
                 break;
                 
                
         }
         
         
         switch(fecha.getMonth())
         {
             case JANUARY: 
                 mesLetra = "Enero";
                 break;
             case FEBRUARY: 
                mesLetra = "Febrero";
                 break;
             case MARCH: 
                 mesLetra = "Marzo";
                 break;
             case APRIL: 
                mesLetra = "Abril";
                 break;
             case MAY: 
                mesLetra = "Mayo";
                 break;
             case JUNE: 
                mesLetra = "Junio";
                 break;
             case JULY: 
                 mesLetra = "Julio";
                 break;
            case AUGUST: 
                mesLetra = "Agosto";
                 break;
             case SEPTEMBER: 
                mesLetra = "Septiembre";
                 break;
             case OCTOBER: 
                 mesLetra = "Octubre";
                 break;
             case NOVEMBER: 
                mesLetra = "Noviembre";
                 break;
             case DECEMBER: 
                mesLetra = "Diciembre";
                 break;
     
         }
   
          
          
          
          
       JOptionPane.showMessageDialog(null, diaSemana +", " + fecha.getDayOfMonth() +
                  " de " + mesLetra + " del " + fecha.getYear());
       
        }catch(DateTimeException e){
           JOptionPane.showMessageDialog(null, "Has introducido mal la fecha");
           programa=false;
            
                
        }
    
    }while(!programa);
    
  }   
}  
 


