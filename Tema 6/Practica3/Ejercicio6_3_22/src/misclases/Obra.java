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
public class Obra {
    private String titulo;
    private int anoEdicion;
    
   private ArrayList<Artista> artistas;
    
      //constructor

    public Obra() {
    }

    public Obra(String titulo, int anoEdicion) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    public void setArtista(Artista A){
        this.artistas.add(A);
    }
  
    
    
}

