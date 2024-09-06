/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.cld.uc.poo.Ruta_Escolar.Entidades;

/**
 *
 * @author nadir
 */
public class Minibus {
    private String color;
    private int numero;
    private String tipo; // "especial para transporte escolar"
    private Chofer chofer;
    private Asistente asistente;

    public Minibus() {
    }

    public Minibus(String color, int numero, String tipo, Chofer chofer, Asistente asistente) {
        this.color = color;
        this.numero = numero;
        this.tipo = tipo;
        this.chofer = chofer;
        this.asistente = asistente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    @Override
    public String toString() {
        return "Minibus{" + "color=" + color + ", numero=" + numero + ", tipo=" + tipo + ", chofer=" + chofer + ", asistente=" + asistente + '}';
    }
    
}