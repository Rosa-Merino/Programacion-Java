/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Ciudad {
    
    //ATRIBUTOS
    private String codigo_ciudad;
    private String nombre;
    ArrayList <Vuelo> Vuelos=new ArrayList();
    //CONSTRUCTOR
    public Ciudad() {
    }
 //METODOS
   public void agregarNuevo(){
       
   }
   public Ciudad obtener(){
       return null;
   }
//GET AND SET
    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return Vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> Vuelos) {
        this.Vuelos = Vuelos;
    }
   
   
    
    
    
}
