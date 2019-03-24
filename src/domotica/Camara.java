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

    private boolean estado;
    private String ip; // Direccion IP de la camara

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    public Camara() {
        this.estado = false;
    }

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

    public static String estado(Camara aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La camara está encendida";
        } else {
            est = "La camara está apagada";
        }

        return est;
    }

    public static void encenderCamara(Camara aux) {
        LocalTime x = LocalTime.of(20, 00);
        LocalTime y = LocalTime.of(8, 00);
        LocalTime z = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        Salon tmp;
        Dormitorio tmp2;

        if (ahora.isAfter(x) && ahora.isBefore(y)) {
            tmp.getLuz().setEstado(true);
            tmp.getPersiana().setEstado(EstadoPersiana.SUBIDA);
        } else if (ahora.isAfter(y) && ahora.isBefore(z)
                && tmp.getPersiana().getEstado(EstadoPersiana.BAJADA)) {
            tmp.getLuz().setEstado(true);
        }

        if (ahora.isAfter(x) && ahora.isBefore(y)) {
            tmp2.getLuz().setEstado(true);
            tmp2.getPersiana().setEstado(EstadoPersiana.SUBIDA);

        } else if (ahora.isAfter(y) && ahora.isBefore(z)
                && tmp2.getPersiana().getEstado(EstadoPersiana.BAJADA)) {
            tmp2.getLuz().setEstado(true);
        }
    }

    public static void apagarCamara(Camara aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        }
    }

    @Override
    public String toString() {
        return "Camara{" + "estado=" + estado + ", ip=" + ip + '}';
    }

}
