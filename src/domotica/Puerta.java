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
    
    private boolean estado;
    private int retardo; // en segundos

   public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }

    public Puerta() {
    }

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

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }

    public static String estado(Puerta aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La puerta está abierta";
        } else {
            est = "La puerta está cerrada";
        }

        return est;
    }

    public static void subirPuerta(Puerta aux) {
        if (aux.isEstado() == false) {
            aux.setEstado(true);
        }else{
            System.out.println("La puerta ya está subida");
        }
    }

    public static void bajarPuerta(Puerta aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        }else{
            System.out.println("La puerta ya está bajada");
        }
    }
    
    
}
