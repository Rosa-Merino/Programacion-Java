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
public class Vehiculo  {
    
    private String matricula;
    private Persona p1;

    public Vehiculo(String matricula, Persona p1) {
        this.matricula = matricula;
        this.p1 = p1;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getP1() {
        return p1;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", p1=" + p1 + '}';
    }

    

    
    
    
    
}
