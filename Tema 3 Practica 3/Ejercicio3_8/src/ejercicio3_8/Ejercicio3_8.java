/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion;
        
        do{
            
                           
             opcion = EligeOpcion().toLowerCase();
            switch (opcion){
                
                case "a" :
                    CalcularEdad();
                    break;
                case "b" :
                    Sumar ();
                    break;
                case "c" :
                    ContarVocales();
                    break;
                                    
                    
            }        
                    
            
           
            
        }while(!opcion.equals("d") );
       
   }
    
    public static String EligeOpcion () {
        String opcion="";
     boolean correcto;
     do{
       try{  
         
        opcion =  JOptionPane.showInputDialog("a.- Calcula la edad de una persona \n"
                + "b.- suma dos numeros \n"
                + "c.- Contar cuantas vocales hay en una cadena \n"
                + "d.- Salir del programa\n\n"
                + "Elige una opción");
        if (!opcion.equalsIgnoreCase("a")&& !opcion.equalsIgnoreCase("b") && !opcion.equalsIgnoreCase("c") && !opcion.equalsIgnoreCase("d"))
            throw new NoValida();
            correcto = true;
        
        
    }
       catch(NoValida e)
           {
             JOptionPane.showMessageDialog(null,"La opción elegida en el menú no es válida");
             correcto = false;
           }
       catch(NullPointerException | StringIndexOutOfBoundsException e)
           {
                          
             JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
             correcto = false;
           }
         catch(Exception e)
           {
              JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
              correcto = false;
           } 
       
     }while(!correcto);
     return opcion;
     
    }
    public static void CalcularEdad() {
        
        try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea la fecha de nacimiento dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaString, formatter);
             
            LocalDate fechahoy = LocalDate.now();
          
            Period difernecia = Period.between(fechahoy, fecha);
            JOptionPane.showMessageDialog(null, "Tienes " + difernecia.getYears() + " años" );
        }
       
        catch(NullPointerException | StringIndexOutOfBoundsException e)
           {
                          
             JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
           }
        catch(DateTimeParseException e){
            
        
         JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar la fecha en el formato pedido");
        }
        
        catch(Exception e)
           {
             JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
           }    
    }
    
    public static void Sumar(){
        
        try{
         int n1=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
         int n2=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
         JOptionPane.showMessageDialog(null," El resultado de la suma es: " + (n1 + n2));
        
        }
         catch(NumberFormatException e)
         {
           JOptionPane.showMessageDialog(null,"Hay que teclear numeros");
         }
         catch(ArithmeticException e)
          {
            JOptionPane.showMessageDialog(null,"No se puede realizar la operación con los numeros introducidos");
          }
           catch(NullPointerException | StringIndexOutOfBoundsException e)
          {
             JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
          }
         catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
          }    
    }
    
    public static void ContarVocales(){
         String frase="";
        boolean correcto;
        int contador=0;
        do
        {
            try
            {
                frase = JOptionPane.showInputDialog("Teclea una frase");
                if (frase.isEmpty())//Si la frase esta vacia error
                    throw new NoValida();
                int i;
                for( i = 0; i < frase.length() && !Character.isDigit(frase.charAt(i)); i++){};// recorre la frase caracter a caracter desde 0 hasta el final y va mirando que no sea un digito
                if (i != frase.length())
                   
                    throw new NoValida();
                correcto = true;
        
        frase.toLowerCase();
        for(int x = 0; x < frase.length(); x++)
        {
            
            switch (frase.charAt(x))
            {
                case 'a':     
                case 'e':     
                case 'i':    
                case 'o':    
                case 'u':     
                    contador = contador +1;
                    break;      
                
            }
        }    
         JOptionPane.showMessageDialog(null, " La cadena tiene " + contador + " vocales");
         
        }
        catch(NoValida e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. No puede estar vacía  contener números.");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"No pulses cancelar o x");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
                correcto = false;
            }
           
        
            }while (!correcto);
       
    }
 
        
      }
   
    

