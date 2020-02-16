/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.time.LocalDate;

/**
 *
 * @author Rosita
 */
public class Alumnos {
    //Atributos
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private LocalDate fechanacimiento;
    private String correopersonal;
    private String correocentro;
    private String paginaweb;
    private String curso;
    private String estadocivil;
    //constructores

    public Alumnos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreopersonal() {
        return correopersonal;
    }

    public void setCorreopersonal(String correopersonal) {
        this.correopersonal = correopersonal;
    }

    public String getCorreocentro() {
        return correocentro;
    }

    public void setCorreocentro(String correocentro) {
        this.correocentro = correocentro;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fechanacimiento=" + fechanacimiento + ", correopersonal=" + correopersonal + ", correocentro=" + correocentro + ", paginaweb=" + paginaweb + ", curso=" + curso + ", estadocivil=" + estadocivil + '}';
    }
    
    
    
    
    
}
