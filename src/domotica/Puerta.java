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
public class Puerta {

    //Atributos
    private boolean estado;
    private int retardo; // en segundos

    // Constructor parametrizado
    public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }

    // Constructor por defecto
    public Puerta() {
        this.estado = true;
    }

    // Getters y setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    // toString
    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }

    // Metodo para ver el estado de la puerta, si es true esta abierta y si no, pues esta cerrada
    public static String estado(Puerta aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La puerta está abierta";
        } else {
            est = "La puerta está cerrada";
        }

        return est;
    }

    // Metodo para subir la puerta, donde si ya esta bajada, la sube, y sino pues nos dice que estaba subida
    public static void subirPuerta(Puerta aux) {
        if (aux.isEstado() == false) {
            aux.setEstado(true);
        } else {
            System.out.println("La puerta ya está subida");
        }
    }
    
    // Metodo para bajar la puerta, donde si ya esta subida, la baja, y sino pues nos dice que estaba bajada
    public static void bajarPuerta(Puerta aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        } else {
            System.out.println("La puerta ya está bajada");
        }
    }

}
