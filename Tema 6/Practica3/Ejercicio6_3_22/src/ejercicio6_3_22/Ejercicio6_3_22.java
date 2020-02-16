/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_22;

import Excepciones.DatoNoValido;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import misclases.*;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        /*version feaaa
        ArrayList <Obra> obras=new ArrayList();
        Libro l1=new Libro();
        String titulol1=obtenerDato("Titulo","^([A-z0-9]+[ ]?)+$");
        int anoEdicionl1=Integer.parseInt(obtenerDato("Año de Edicion","^(19[2-9][0-9])|(20(([0-1][0-9])|(20)))$"));
        String editoriall=obtenerDato("Editorial","^([A-z0-9]+[ ]?)+$");
        int numeroPaginasl1=Integer.parseInt(obtenerDato("numero de dato","^[0-9}{2,4}$"));
        l1.setTitulo(titulol1);
        l1.setAnoEdicion(anoEdicionl1);
        l1.setEditorial( editoriall);
        
        Disco d1=new Disco();
        String titulod1=obtenerDato("Titulo","^([A-z0-9]+[ ]?)+$");
        int anoEdiciond1=Integer.parseInt(obtenerDato("Año de Edicion","^(19[2-9][0-9])|(20(([0-1][0-9])|(20)))$"));
        String discografia=obtenerDato
        
        
        */
        
    }
    public static String obtenerDato(String campo, String expreg) {
        
          String dato="";
        boolean error;
        do
        {
            try
            {
                dato = JOptionPane.showInputDialog("Indica el " + campo );
                Pattern patron = Pattern.compile(expreg);
                Matcher m = patron.matcher(dato);
                if (!m.matches())
                    throw new DatoNoValido(campo);
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return dato;
        
    }
}
