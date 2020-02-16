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
public class Directivo extends Empleado  {
    
   private String categoria;
    // Relación con Empleado
    private ArrayList<Empleado> subordinados;

    public Directivo() {
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados) {
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldo_bruto) {
        super(sueldo_bruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "Directivo{" + "categoria=" + categoria + ", subordinados=" + subordinados + '}';
    }
    
}
