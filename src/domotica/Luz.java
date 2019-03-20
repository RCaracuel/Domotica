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
public class Luz {

    private boolean estado;
    private double consumo;

    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }

    public Luz() {
        this.estado=false;
    }
    
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static String estado(Luz aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La luz está encendida";
        } else {
            est = "La luz está apagada";
        }

        return est;
    }

    public static void encenderLuz(Luz aux) {
        if (aux.isEstado() == false) {
            aux.setEstado(true);
        }else{
            System.out.println("La luz ya está encendida");
        }
    }

    public static void apagarLuz(Luz aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        }else{
            System.out.println("La luz ya está apagada");
        }
    }

    @Override
    public String toString() {
        return "Luz{" + "estado=" + estado + ", consumo=" + consumo + '}';
    }

}
