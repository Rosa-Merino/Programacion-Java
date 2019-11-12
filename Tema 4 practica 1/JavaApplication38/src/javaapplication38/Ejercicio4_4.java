/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean comparacion=false;
        while(!comparacion){
            try{
                String[] array={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
                String mes =JOptionPane.showInputDialog("Introduce el nombre de un mes");
                mes=mes.toLowerCase();
                //me crea una lista y me busca
                boolean contenido = Arrays.asList(array).contains(mes);
                if(contenido)
                {
                    JOptionPane.showMessageDialog(null,"El mes "+ mes + " que has escrito es correcto");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El mes "+ mes + " que has escrito es incorrecto"); 
                }
                comparacion=true;
            }catch(Exception e)
                  {
                JOptionPane.showMessageDialog(null,"No valido" + e.getClass() + e.getMessage());
                  }
        }
    }
    
}
