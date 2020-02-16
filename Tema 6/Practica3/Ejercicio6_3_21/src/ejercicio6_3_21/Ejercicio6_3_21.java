/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_3_21;
import MisClases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio6_3_21 {

    /**
     * @param args the command line arguments
     */
        static String nombre;
        static String codigo;
        static String domicilio;
        static String telefono;
        static String edad;
        static String sexo;
        static LocalDate fechanacimiento;
        static String correopersonal;
        static String correocentro;
        static String paginaweb;
        static String curso;
        static String EstadoCivil;
        
        private static ArrayList<Alumnos> alumnos=new ArrayList();
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        do{
            try{
                Alumnos al=new Alumnos();
                
                al.setNombre(entradaNombre());
                al.setCodigo(entradaCodigo());
                
                entradaDomicilio();
                entradaTelefono();
                entradaEdad();
                entradaSexo();
                entradaFechanacimiento();
                entradaCorreopersonal();
                entradaCorreocentro();
                entradaPaginaweb();
                entradaCurso();
                entradaEstadoCivil();
                alumnos.add(al);
                
                
            }
            
            
            
        }while(JOptionPane.showConfirmDialog(null, "¿Quieres introducir otro Alumno?")==0);
        
    }
        
        private static String entradaNombre(){
            boolean condi=true;
            
            do{
            
            nombre=JOptionPane.showInputDialog("Introduce tu nombre");
            Pattern p1=Pattern.compile("^[A-z]+([ ]?[A-z])+$");
            Matcher m1=p1.matcher(nombre);
            if(!m1.matches())
            {
                JOptionPane.showMessageDialog(null, "No es un nombre, introduce correctamente tu nombre");
            }
            else{
                condi=false;
            
            }
            
            
            
        }while(condi);
            return nombre;
        }
        private static String entradaCodigo(){
            
            
             boolean condi=true;
            
            do{
            
            codigo=JOptionPane.showInputDialog("Introduce tu Codigo");
            Pattern p1=Pattern.compile("^[0-9]{5}");
            Matcher m1=p1.matcher(nombre);
            if(!m1.matches())
            {
                JOptionPane.showMessageDialog(null, "No es un codigo, introduce correctamente tu codigo");
            }
            else{
                condi=false;
            
            }
            
            
            
        }while(condi);
            return codigo;
        }
            
            
            
        
        

        private static void entradaDomicilio() {
        
    }

        private static void entradaTelefono() {
       
    }

     private static void entradaEdad() {
        
    }

     private static void entradaSexo() {
       
    }

     private static void entradaFechanacimiento() {
        
    }

     private static void entradaCorreopersonal() {
        
    }

     private static void entradaCorreocentro() {
      
    }

    private static void entradaPaginaweb() {
        
    }

    private static void entradaCurso() {
        
    }

    private static void entradaEstadoCivil() {
        
    }
    
    
}
