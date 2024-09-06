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
public class Empresa {
    private String nombre;
    private List<Minibus> minibuses;
    private List<Chofer> choferes;
    private List<Asistente> asistentes;
    private List<Contrato> contratos;

    public Empresa() {
    }

    public Empresa(String nombre, List<Minibus> minibuses, List<Chofer> choferes, List<Asistente> asistentes, List<Contrato> contratos) {
        this.nombre = nombre;
        this.minibuses = minibuses;
        this.choferes = choferes;
        this.asistentes = asistentes;
        this.contratos = contratos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Minibus> getMinibuses() {
        return minibuses;
    }

    public void setMinibuses(List<Minibus> minibuses) {
        this.minibuses = minibuses;
    }

    public List<Chofer> getChoferes() {
        return choferes;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", minibuses=" + minibuses + ", choferes=" + choferes + ", asistentes=" + asistentes + ", contratos=" + contratos + '}';
    }
    
}
