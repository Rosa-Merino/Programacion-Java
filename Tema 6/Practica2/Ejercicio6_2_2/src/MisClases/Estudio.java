/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Estudio {
    
     private String nombre;
    private String ciudad;
    private String direccion;
    private String drweb;
    private LocalDate fechaFundacion;
    private String pais;
    private ArrayList<String> telefono = new ArrayList();
    
    ArrayList<Pelicula> pelicula = new ArrayList();
    
    //CONSTRUSCTORES

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String drweb, LocalDate fechaFundacion, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.drweb = drweb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
    }
    
    //GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDrweb() {
        return drweb;
    }

    public void setDrweb(String drweb) {
        this.drweb = drweb;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(ArrayList<String> telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    } 
}

