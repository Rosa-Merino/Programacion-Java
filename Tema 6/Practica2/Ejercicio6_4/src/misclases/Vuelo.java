/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rosita
 */
public class Vuelo {
    
    private int ndevuelo;
    private String horadesalida;
    private String lugardeorigen;
    private String lugardedestino;
    private Date fechadesalida;
    private Date fechaderegreso;
    private String tipodevuelo;
   //relaciones
    
    ArrayList<Asiento> asientos=new ArrayList();
    private Avion avion;
    private Piloto piloto;
    private Pasajero pasajero;
    private Ciudad ciudad;

    public Vuelo() {
    }
    
    public void reservar(){
        
    }
    public void modificar(){
        
    }
    public void eliminar(){
        
    }
    public Vuelo buscar(){
        return null;
    }

    public int getNdevuelo() {
        return ndevuelo;
    }

    public void setNdevuelo(int ndevuelo) {
        this.ndevuelo = ndevuelo;
    }

    public String getHoradesalida() {
        return horadesalida;
    }

    public void setHoradesalida(String horadesalida) {
        this.horadesalida = horadesalida;
    }

    public String getLugardeorigen() {
        return lugardeorigen;
    }

    public void setLugardeorigen(String lugardeorigen) {
        this.lugardeorigen = lugardeorigen;
    }

    public String getLugardedestino() {
        return lugardedestino;
    }

    public void setLugardedestino(String lugardedestino) {
        this.lugardedestino = lugardedestino;
    }

    public Date getFechadesalida() {
        return fechadesalida;
    }

    public void setFechadesalida(Date fechadesalida) {
        this.fechadesalida = fechadesalida;
    }

    public Date getFechaderegreso() {
        return fechaderegreso;
    }

    public void setFechaderegreso(Date fechaderegreso) {
        this.fechaderegreso = fechaderegreso;
    }

    public String getTipodevuelo() {
        return tipodevuelo;
    }

    public void setTipodevuelo(String tipodevuelo) {
        this.tipodevuelo = tipodevuelo;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
}
