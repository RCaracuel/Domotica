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
    
    private static EstadoPersiana estado;
    private int largo; // cm
    private int ancho; // cm

    public EstadoPersiana getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersiana estado) {
        this.estado = estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public static String estado(Persiana aux){
        
        switch (aux.getEstado()) {
            case SUBIDA:
                return "La persiana está subida";
          
            case BAJADA:
                return "La persiana está bajada";
            case MITAD:
                return "La persiana está a la mitad";
          
        }
        
        return "Error";
    }
}
