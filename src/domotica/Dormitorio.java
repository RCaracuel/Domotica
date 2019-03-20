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
public class Dormitorio extends Habitacion {
    
    private Orientacion ori;
   
    public Dormitorio(Orientacion ori, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.ori = ori;
    }

    public Dormitorio() {
        super();
        this.ori=this.ori.SUR;
    }

    @Override
    public String toString() {
        return "Dormitorio{" + "ori=" + ori + '}';
    }
}
