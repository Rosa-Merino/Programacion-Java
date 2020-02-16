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
public class Disco extends Obra {
    
    private String discografia;
    private int numeroCanciones;

    public Disco() {
    }

    public Disco(String discografia, int numernoCanciones, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.discografia = discografia;
        this.numeroCanciones = numernoCanciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getNumernoCanciones() {
        return numeroCanciones;
    }

    public void setNumernoCanciones(int numernoCanciones) {
        this.numeroCanciones = numernoCanciones;
    }

   
    
   
    
    
}
