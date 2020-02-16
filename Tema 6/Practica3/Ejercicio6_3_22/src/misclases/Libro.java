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
public class Libro extends Obra {
    private String editorial;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(String editiorial, int numeroPaginas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.editorial = editiorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editiorial) {
        this.editorial = editiorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

  
    
    
    
}
