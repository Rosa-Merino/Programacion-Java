/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladora;

import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class JavaApplication111 {
    ArrayList<Persona> listaPersonas = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String nombre, int dNacimiento, int mNacimiento, int aNacimiento, String direccion, String codigoPostal, String ciudad
        Persona persona1=new Persona(
       "Pepe","03","02","1995","C/ poeta","09200","vitoria" );
    }
    
}
