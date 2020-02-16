/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Rosita
 */
public class Coche extends Vehiculo{
    private  marcaC marca;

    public Coche(marcaC marca, String matricula, Persona p1) {
        super(matricula, p1);
        this.marca = marca;
    }

   

    public marcaC getMarca() {
        return marca;
    }

    public void setMarca(marcaC marca) {
        this.marca = marca;
    }

    

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + '}';
    }
    
    
    
    
    
}
