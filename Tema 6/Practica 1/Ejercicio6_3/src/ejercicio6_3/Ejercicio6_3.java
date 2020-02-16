/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3;

import Excepciones.NoValido;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import personas.Personas;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Personas[] arrayPersonas = new Personas[3];
        
        for (int x=0;x<3;x++){
            
            arrayPersonas[x] = crearObjeto();
        }
        buscar(arrayPersonas);
    }
    public static Personas crearObjeto(){
        
        String nombre=solicitarNombre();
        
        int dNacimiento,mNacimiento,aNacimiento;
        
            dNacimiento=solicitarDia();
            mNacimiento=solicitarMes();
            aNacimiento=solicitarAño();
            
        String direccion = solicitarDireccion();
        
        String codigoPostal= solicitarCodigoPostal();
        
        String ciudad= solicitarCiudad();
        
        Personas objetoPersona= new Personas(nombre,dNacimiento,mNacimiento,aNacimiento,direccion,codigoPostal,ciudad);
        
        return objetoPersona;
        
        
        
            
        }
    public static String solicitarNombre(){
        
        boolean programa=true;
        String nombre="";
        do
        {
            try{
                nombre=JOptionPane.showInputDialog("Introduce el nombre de la persona");
                if(nombre.isEmpty())
                    throw new NoValido();
                programa=false;
            }
            catch(NoValido e){
                 JOptionPane.showMessageDialog(null, "Error"+e.getClass());
                
                programa=true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error"+e.getClass());
            }
          
        }while(programa);
        return nombre;
    }
 
    public static int solicitarDia(){
        boolean error = true;
        int dia=0;
        do
        {
            try
            {
                String d=javax.swing.JOptionPane.showInputDialog("Teclea día de nacimiento: ");
                if (d.isEmpty())
                    throw new NoValido();
                dia = Integer.parseInt(d);
               
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo numérico");
                error = true;
            }
         
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el dia de nacimiento \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return dia;
    }
    
    public static int solicitarMes(){
        boolean error = true;
        String m = "";
        int mes=0;
        do
        {
            try
            {
               m=javax.swing.JOptionPane.showInputDialog("Teclea el mes de nacimiento: ");
               if (m.isEmpty())
                    throw new NoValido();
               mes = Integer.parseInt(m);
              
                
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes es un dato numérico");
                error = true;
            }
         
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el mes \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return mes;
    }
    

    
    public static int solicitarAño(){
        boolean error = true;
        int año=0;
        do
        {
            try
            {
                String a=javax.swing.JOptionPane.showInputDialog("Teclea el año de nacimiento: ");
                if (a.isEmpty())
                    throw new NoValido();
                año = Integer.parseInt(a);
             
                
                
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo numérico");
                error = true;
            }
        
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el año \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return año;
    }
   
    public static String solicitarDireccion(){
        boolean error = true;
        String direccion="";
        do
        {
            try
            {
                direccion=javax.swing.JOptionPane.showInputDialog("Teclea la direccion de la persona: ");
                if (direccion.isEmpty())
                    throw new NoValido();
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El direccion es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la dirección \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return direccion;
    }
    
    public static String solicitarCodigoPostal(){
        boolean error = true;
        String codigo="";
        do
        {
            try
            {
                codigo=javax.swing.JOptionPane.showInputDialog("Teclea el código postal: ");
                if (codigo.isEmpty())
                    throw new NoValido();
              
                Integer.parseInt(codigo);
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código es un campo obligatorio");
                error = true;
            }
           
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código no es correcto ya que tiene que estar formado por cinco numeros");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el código \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return codigo;
    }
    
    public static String solicitarCiudad(){
        boolean error = true;
        String ciudad="";
        do
        {
            try
            {
                ciudad=javax.swing.JOptionPane.showInputDialog("Teclea la ciudad: ");
                if (ciudad.isEmpty())
                    throw new NoValido();
                error = false;
            }
            catch(NoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El ciudad es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la ciudad \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return ciudad;
    }
    
    public static void buscar(Personas[] arrayPersonas){
        int mayorEdad = 0;
        int posicionPersonaMayorEdad = 0;
        
        String nombres = "";
        
        String nombresMayoria="";
        
        for(int x = 0; x < arrayPersonas.length; x++)
        {
            // Persona de más edad
            int edad = arrayPersonas[x].Calculoanos();
            if ( edad > mayorEdad)
            {
                posicionPersonaMayorEdad = x;
                mayorEdad = edad;
            }
            
            // Personas que viven en Elche
            if (arrayPersonas[x].getCiudad().compareToIgnoreCase("Elche") == 0)
            {
                nombres += "\n" + arrayPersonas[x].getNombre();
            }
            
            // Mayores de edad
            if (arrayPersonas[x].isMayorEdad())
            {
                nombresMayoria += "\n" + arrayPersonas[x].getNombre();
            }
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "La persona de mayor edad es: " + arrayPersonas[posicionPersonaMayorEdad].getNombre() + " y tiene "+ mayorEdad + " años");
        
        if (nombres.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas de Elche");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "En Elche viven: "+nombres);
        
        if (nombresMayoria.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas mayores de edad");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Las personas mayores de edad son:" + nombresMayoria);
    }
    
}
 


