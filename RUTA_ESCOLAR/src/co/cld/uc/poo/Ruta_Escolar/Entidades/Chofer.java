/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.cld.uc.poo.Ruta_Escolar.Entidades;

import java.util.List;

/**
 *
 * @author nadir
 */
public class Chofer extends Usuario {
    private String licenciaConducir;
    private List<Minibus> minibuses;

    public Chofer() {
    }

    public Chofer(String licenciaConducir, List<Minibus> minibuses) {
        this.licenciaConducir = licenciaConducir;
        this.minibuses = minibuses;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public List<Minibus> getMinibuses() {
        return minibuses;
    }

    @Override
    public String toString() {
        return "Chofer{" + "licenciaConducir=" + licenciaConducir + ", minibuses=" + minibuses + '}';
    }
    
}
