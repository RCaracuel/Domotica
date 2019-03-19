/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author rafa
 */
public class Persiana {
    
    private EstadoPersianaSalon estado;
    private int largo; // cm
    private int ancho; // cm

    public EstadoPersianaSalon getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersianaSalon estado) {
        this.estado = estado;
    }
    
}
