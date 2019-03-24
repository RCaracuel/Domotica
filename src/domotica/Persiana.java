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

    // Atributos
    private EstadoPersiana estado;
    private int largo; // cm
    private int ancho; // cm

    // Constructor por defecto
    public Persiana() {
        this.estado = EstadoPersiana.MITAD;

    }

    // Getters y setters
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

    // Metodo para ver el estado de la persiana, segun cada caso nos saltará si esta subida, bajada o por la mitad
    public static String estado(Persiana aux) {

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

    // Metodo para subir la persiana, donde comprueba que si esta bajada, que la suba y si ya está subida nos dice que lo está
    public static void subirPersiana(Persiana aux) {
        if (aux.getEstado() == EstadoPersiana.BAJADA) {
            aux.setEstado(EstadoPersiana.SUBIDA);
        } else {
            System.out.println("La persiana ya está subida");
        }
    }

    // Metodo para bajar la persiana, donde comprueba que si esta subida, que la baje y si ya está bajada nos dice que lo está
    public static void bajarPersiana(Persiana aux) {
        if (aux.getEstado() == EstadoPersiana.SUBIDA) {
            aux.setEstado(EstadoPersiana.BAJADA);
        } else {
            System.out.println("La persiana ya está bajada");
        }
    }

    // Get del estado de la persiana
    boolean getEstado(EstadoPersiana estadoPersiana) {
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "Persiana{" + "estado=" + estado + ", largo=" + largo + ", ancho=" + ancho + '}';
    }

}
