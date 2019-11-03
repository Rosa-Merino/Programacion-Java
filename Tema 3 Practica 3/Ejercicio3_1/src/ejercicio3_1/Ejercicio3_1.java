/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String frase = entradaFrase();
       
        int numero = contarVocales(frase);
        JOptionPane.showMessageDialog(null, " La cadena tiene " + numero + " vocales");
        
    }
    public static String entradaFrase() {
         String frase="";
        boolean correcto;
        do
        {
            try
            {
                frase = JOptionPane.showInputDialog("Teclea una frase");
                if (frase.isEmpty())//Si la frase esta vacia error
                    throw new fraseNoValida();
                int i;
                for( i = 0; i < frase.length() && !Character.isDigit(frase.charAt(i)); i++){};// recorre la frase caracter a caracter desde 0 hasta el final y va mirando que no sea un digito
                if (i != frase.length())
                    // Salimos de for por isAlphabetic == false
                    throw new fraseNoValida();
                correcto = true;
                
            }
            catch(fraseNoValida e)
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
           
        }
        while (!correcto);
        return frase;
        
    
}
    public static int contarVocales(String frase){
        int contador = 0;
        // Repetitiva para ir recorriendo la cadena
        for(int x = 0; x < frase.length(); x++)
        {
            // charAt(x) == caracter de la posición x
            switch (frase.charAt(x))
            {
                case 'a':     case 'A':
                case 'e':     case 'E':
                case 'i':     case 'I':
                case 'o':     case 'O':
                case 'u':     case 'U':
                    contador = contador +1;
                    break;
            }
        }
        return contador; 
    }
}
