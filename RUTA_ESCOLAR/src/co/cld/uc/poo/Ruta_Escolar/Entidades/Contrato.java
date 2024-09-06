/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.cld.uc.poo.Ruta_Escolar.Entidades;

import java.util.Date;

/**
 *
 * @author nadir
 */
public class Contrato {
    private Date fechaInicio;
    private Date fechaFin;
    private String modalidad; // "sólo mañana", "sólo mediodía", "sólo tarde", etc.
    private Niño niño;
    private Recorrido recorrido;

    public Contrato() {
    }

    public Contrato(Date fechaInicio, Date fechaFin, String modalidad, Niño niño, Recorrido recorrido) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modalidad = modalidad;
        this.niño = niño;
        this.recorrido = recorrido;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Niño getNiño() {
        return niño;
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    @Override
    public String toString() {
        return "Contrato{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", modalidad=" + modalidad + ", ni\u00f1o=" + niño + ", recorrido=" + recorrido + '}';
    }
    
}
