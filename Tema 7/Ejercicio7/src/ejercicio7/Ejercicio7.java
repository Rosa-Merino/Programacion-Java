/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import MisClases.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
     private static ArrayList<Persona> listaPersonas;
     private static ArrayList<Vehiculo> listaVehiculos;
    
    public static void main(String[] args) {
        // TODO code application logic here
        // try           
            listaVehiculos=new ArrayList();
            listaPersonas=new ArrayList();
            Alta();
            mostrar();
            
            
    }        

     public static void Alta(){
         do
         {
         Persona persona=datosPersona();
         persona.setVehiculos(datosVehiculos(persona));//relacion de persona con vehiculo
         
         listaPersonas.add(persona);
         
         }
         while (JOptionPane.showConfirmDialog( null,"¿Quieres seguir añadiendo personas")==0);
                 
         
         
         
         
     }
     
     public static Persona datosPersona(){
         return new Persona(obtenerDni(),obtenerNombreApellido(),obtenerDireccion(),obtenerTelefono());
         
         
     }
     
     public static ArrayList<Vehiculo> datosVehiculos(Persona p) {
         ArrayList<Vehiculo> vehiculos=new ArrayList();
         boolean programa=true;
         while(programa)
         {
              String tipoVehiculo= ObtenerTipo().toLowerCase;
              switch(tipoVehiculo){
                  
                  case "a" :
                      vehiculos.add(new Moto(obtenerMarcaMoto(),obtenerMatricula(),p));
                      programa=false;
                      break;
                  case "b":
                      vehiculos.add(new Camion(obtenerMarcaCamion(),obtenerMatricula(),p));
                      programa=false;
                      break;
                  case "c":
                      vehiculos.add(new Coche(obtenerMarcaCoche(),obtenerMatricula(),p));
                      programa=false;
                      break;
                     }
                      
         }
       
     }
     
     public static String ObtenerTipo(){
         boolean proceso= true;
         while(proceso){
             try {
                 String opcion=JOptionPane.showInputDialog("Introduce la opcion que deseas \n"
                                                            + "a)Moto"
                                                            + "b)Camion"
                                                            +"c)Coche");
             }
         }
         
     }
     
     public static String obtenerDni(){
     
     /*¿hay ya un persona con ese dni
         
         int x=0;
         fot(x=0 x<listâPerspnas.size() && !listaPersona.get(x).getDni().equals(dni);x++{
         if( x!= listaPersonas.size())
            throw new Dni
         
         /* final String dni2=dni; Constante para poder usarla en la funcion lamda
         if (listapersonas.steam().anyMatch(pe-> pe.getDni().equals(dni2)))
         throw ner DNiNoValido();
         */
     
     }
     
     
    
}

return MarcaMoto.valueOf(marcaMoto)