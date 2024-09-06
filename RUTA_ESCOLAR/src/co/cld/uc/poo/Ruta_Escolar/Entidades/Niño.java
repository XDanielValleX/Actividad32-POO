/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.cld.uc.poo.Ruta_Escolar.Entidades;

import java.util.Date;

/**
 *
 * @author nadir
 */
public class Niño extends Usuario {
    private String colegioOJardin;
    private Date horaRecogida;
    private Date horaDejada;
    private Apoderado apoderado;

    public Niño() {
    }

    public Niño(String colegioOJardin, Date horaRecogida, Date horaDejada, Apoderado apoderado) {
        this.colegioOJardin = colegioOJardin;
        this.horaRecogida = horaRecogida;
        this.horaDejada = horaDejada;
        this.apoderado = apoderado;
    }

    public String getColegioOJardin() {
        return colegioOJardin;
    }

    public void setColegioOJardin(String colegioOJardin) {
        this.colegioOJardin = colegioOJardin;
    }

    public Date getHoraRecogida() {
        return horaRecogida;
    }

    public void setHoraRecogida(Date horaRecogida) {
        this.horaRecogida = horaRecogida;
    }

    public Date getHoraDejada() {
        return horaDejada;
    }

    public void setHoraDejada(Date horaDejada) {
        this.horaDejada = horaDejada;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }
    
}
