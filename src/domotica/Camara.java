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
public class Camara {

    private boolean estado;
    private String ip; // Direccion IP de la camara

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
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
}
