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
public class Apoderado extends Usuario {
    private String direccion;
    private List<Contrato> contratos;

    public Apoderado() {
    }

    public Apoderado(String direccion, List<Contrato> contratos) {
        this.direccion = direccion;
        this.contratos = contratos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Apoderado{" + "direccion=" + direccion + ", contratos=" + contratos + '}';
    }
    
    
}
