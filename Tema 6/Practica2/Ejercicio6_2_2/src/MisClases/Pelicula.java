/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Pelicula {
     private String titulo;
    private String ano;
    private float duracion;
    private String tipo;
    
    ArrayList<Estudio> estudio = new ArrayList();
    
    // CONSTRUCTORES 

    public Pelicula() {
    }

    public Pelicula(String titulo, String ano, float duracion, String tipo) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.tipo = tipo;
    }
    
    // GET Y SET

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getEstudio() {
        return estudio;
    }

    public void setEstudio(ArrayList<Estudio> estudio) {
        this.estudio = estudio;
    }
}
    

