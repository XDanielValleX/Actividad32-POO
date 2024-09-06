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
public class Asistente extends Usuario {
    private String carnet;
    private List<Minibus> minibuses;

    public Asistente() {
    }

    public Asistente(String carnet, List<Minibus> minibuses) {
        this.carnet = carnet;
        this.minibuses = minibuses;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public List<Minibus> getMinibuses() {
        return minibuses;
    }

    @Override
    public String toString() {
        return "Asistente{" + "carnet=" + carnet + ", minibuses=" + minibuses + '}';
    }
    
}
