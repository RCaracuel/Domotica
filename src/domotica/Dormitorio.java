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
    
    // Atributos
    private Orientacion ori;
   
    // Constructor parametrizado, donde ademas se llama al constructor de la clase padre
    public Dormitorio(Orientacion ori, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.ori = ori;
    }

    // Constructor por defecto
    public Dormitorio() {
        super();
        this.ori=this.ori.SUR;
    }

    // toString
    @Override
    public String toString() {
        return "Dormitorio{" + "ori=" + ori + '}';
    }
}
