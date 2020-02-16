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
public class Camion extends Vehiculo {
    
    private MarcaCam marca;

    public Camion(MarcaCam marca, String matricula, Persona p1) {
        super(matricula, p1);
        this.marca = marca;
    }


    public MarcaCam getMarca() {
        return marca;
    }

    public void setMarca(MarcaCam marca) {
        this.marca = marca;
    }
    
   
    @Override
    public String toString() {
        return "Camion{" + "marca=" + marca + '}';
    }
    
    
    
}
