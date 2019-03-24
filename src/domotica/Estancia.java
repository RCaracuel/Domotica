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
public class Estancia {
    
    // Atributos
    private int m2;

    // Constructor por defecto
    public Estancia() {
        m2 = 0;
    }

    // Constructor parametrizado
    public Estancia(int m2) {
        this.m2 = m2;
    }

    // Getters y setters
    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    // toString
    @Override
    public String toString() {
        return "Estancia{" + "m2=" + m2 + '}';
    }
    
    
    
    
}
