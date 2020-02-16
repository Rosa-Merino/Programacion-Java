/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_2;

import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */

public class Ejercicio6_2 {

 
    static boolean programa=true;
   static ArrayList<Alumnos> nombres = new ArrayList();
    public static void main(String[] args) {
        while(programa)
        {
            try
            {
               CrearYGuardarDatos();
               MostrarDatosConCodigo();
            }
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null, "Introduce un codigo numérico"); 
            }
        }
    }
    public static void CrearYGuardarDatos ()
    {
        int condi = 0;
         do
       {
           try{
                
                 String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
               
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
               
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
            
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                
            
                Alumnos alumno = new Alumnos(codigo,nombre,domicilio,telefono);
                
                
                 nombres.add(alumno);
                 condi = JOptionPane.showConfirmDialog(null, "Añadir otro alumno?");
           }catch(NumberFormatException e)
           {
               JOptionPane.showMessageDialog(null, "Introduce un codigo numérico"); 
           }
       }
       while(condi==0);
    }
    public static void MostrarDatosConCodigo()
    {
        int condi=0;
        do
        {
            try
            {
        String codigo = JOptionPane.showInputDialog("Codigo");
        String respuesta = "";
        for(int x=0;x<nombres.size();x++)
        {

            if(nombres.get(x).getCodigo().equals(codigo)==true)
            {
                respuesta += "Código: "+codigo+"\n\nNombre: "+nombres.get(x).getNombre()+"\n\nDomicilio: "+nombres.get(x).getDomicilio()+"\n\nTelefono: "+nombres.get(x).getTelefono();
            }
        }
        if(respuesta.isEmpty())
        {
            respuesta += "No hay ningun alumno con este código";
            JOptionPane.showMessageDialog(null, respuesta);
        }
        else{
        JOptionPane.showMessageDialog(null, respuesta);
         condi = JOptionPane.showConfirmDialog(null, "Mostrar otro alumno?");
        }
            }
            
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Introduce un codigo numérico");
            }
        }
        while(condi==0);
        programa=false;
    }
}
