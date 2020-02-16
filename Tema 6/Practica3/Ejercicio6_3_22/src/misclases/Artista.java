/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Artista  {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    private ArrayList<Obra> obras;
    private ArrayList<Peliculas> peliculas;

    public Artista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public ArrayList<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }
    
    public void setObra(Obra O){
        this.obras.add(O);
        
    }
    
    
    
    
}
