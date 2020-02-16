/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Rosita
 */
public class Circulo {
    private double radio;
    private double volumen;
    private double area;
    private double longitud;

    public Circulo() {
    }

    public Circulo(double radio, double volumen, double area, double longitud) {
        this.radio = radio;
        this.volumen = volumen;
        this.area = area;
        this.longitud = longitud;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return (Math.rint(4*Math.PI*Math.pow(radio, 2)*radio/3));
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArea() {
        return (Math.rint(Math.PI*Math.pow(radio, 2)));
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLongitud() {
        return (Math.rint(2*Math.PI *radio));
    }

   
    }
    
    
    


    

