/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalTime;

/**
 *
 * @author rafa
 */
public class Camara {

    // Atributos
    private boolean estado;
    private String ip; // Direccion IP de la camara

    // Constructor parametrizado
    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    // Constructor por defecto
    public Camara() {
        this.estado = false;
        this.ip="93.23.45.10";
    }

    // Getter y setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    // Metodo para comprobar el estaod de la camara
    public static String estado(Camara aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La camara está encendida";
        } else {
            est = "La camara está apagada";
        }

        return est;
    }

    // Metodo para encender la camara en el que se exponen las condiciones supuestas en el proyecto
    public static void encenderCamara(Camara aux) {
        // Creacion de las 3 horas y de 1 actual para poder ir haciendo las condiciones
        LocalTime x = LocalTime.of(20, 00);
        LocalTime y = LocalTime.of(8, 00);
        LocalTime z = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        Salon tmp;
        Dormitorio tmp2;

        // Condiciones para el salon
        if (ahora.isAfter(x) && ahora.isBefore(y)) {
            tmp.getLuz().setEstado(true);
            tmp.getPersiana().setEstado(EstadoPersiana.SUBIDA);
        } else if (ahora.isAfter(y) && ahora.isBefore(z)
                && tmp.getPersiana().getEstado(EstadoPersiana.BAJADA)) {
            tmp.getLuz().setEstado(true);
        }

        // Condiciones para el dormitorio
        if (ahora.isAfter(x) && ahora.isBefore(y)) {
            tmp2.getLuz().setEstado(true);
            tmp2.getPersiana().setEstado(EstadoPersiana.SUBIDA);

        } else if (ahora.isAfter(y) && ahora.isBefore(z)
                && tmp2.getPersiana().getEstado(EstadoPersiana.BAJADA)) {
            tmp2.getLuz().setEstado(true);
        }
    }

    // Metodo para apagar la camara
    public static void apagarCamara(Camara aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Camara{" + "estado=" + estado + ", ip=" + ip + '}';
    }

}
