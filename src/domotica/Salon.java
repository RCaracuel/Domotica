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
public class Salon extends Habitacion {

    // Atributos
    private boolean terraza;

    // Constructor parametrizado
    public Salon(boolean terraza, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.terraza = terraza;
    }

    // Constructor por defecto
    public Salon() {
    }

    // Getters y setters
    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    // toString
    @Override
    public String toString() {
        return "Salon{" + "terraza=" + terraza + '}';
    }

}
