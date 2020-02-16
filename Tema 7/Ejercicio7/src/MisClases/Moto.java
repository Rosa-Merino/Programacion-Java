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
public class Moto extends Vehiculo {
    private MarcaM marca;

    public Moto(MarcaM marca, String matricula) {
        super(matricula);
        this.marca = marca;
    }

    public Moto(MarcaM marca, String matricula, Persona p1) {
        super(matricula, p1);
        this.marca = marca;
    }

   

    public void setMarca(MarcaM marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" + "marca=" + marca + '}';
    }
    
    
    
    
    
}
