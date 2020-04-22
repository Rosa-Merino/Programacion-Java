/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Productos {
    
    private String nombre;
    private int unidades;
    private double precio;
    
    private ArrayList<Proveedores> Proveedores;

    public Productos(String nombre, int unidades, double precio, ArrayList<Proveedores> Proveedores) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
        this.Proveedores = Proveedores;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedores> getProveedores() {
        return Proveedores;
    }

    public void setProveedores(ArrayList<Proveedores> Proveedores) {
        this.Proveedores = Proveedores;
    }
    
    
    
}
