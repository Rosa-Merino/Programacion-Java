/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author Rosita
 */
public class Peliculas extends Obra {
    private String productora;
    private int duracion;

    public Peliculas(String productora, int duracion, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.productora = productora;
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}
