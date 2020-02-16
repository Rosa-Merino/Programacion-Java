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
public class Cliente extends Persona {
    
    private int telefono;

    public Cliente(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(int telefono, String nombre, int edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   // @Override
    public String mostrar() {
       return this.getNombre() + " " + this.getEdad() + " " + this.getTelefono();
    }
    
    
    
}
