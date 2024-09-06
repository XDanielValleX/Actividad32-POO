/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.cld.uc.poo.Ruta_Escolar.Entidades;

import java.util.List;

/**
 *
 * @author nadir
 */
public class Recorrido {
    private String barrio;
    private String colegio;
    private String jornada; // "mañana", "mediodía", "tarde"
    private List<Niño> niños;

    public Recorrido() {
    }

    public Recorrido(String barrio, String colegio, String jornada, List<Niño> niños) {
        this.barrio = barrio;
        this.colegio = colegio;
        this.jornada = jornada;
        this.niños = niños;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public List<Niño> getNiños() {
        return niños;
    }

    @Override
    public String toString() {
        return "Recorrido{" + "barrio=" + barrio + ", colegio=" + colegio + ", jornada=" + jornada + ", ni\u00f1os=" + niños + '}';
    }
    
}
