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
public class Luz {

    // Atributos
    private boolean estado;
    private double consumo;

    // Constructor parametrizado
    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }

    // Constructor por defecto
    public Luz() {
        this.estado=false;
    }
    
    
    // Getters y setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Metodo para ver el estado de la luz, si es true nos dice que está encendida y si es false, que está apagada
    public static String estado(Luz aux) {
        String est = "";
        if (aux.isEstado() == true) {
            est = "La luz está encendida";
        } else {
            est = "La luz está apagada";
        }

        return est;
    }

    // Metodo para encender la luz, donde si está apagada, la enciende, si no ya nos dice que estaba encendida
    public static void encenderLuz(Luz aux) {
        if (aux.isEstado() == false) {
            aux.setEstado(true);
        }else{
            System.out.println("La luz ya está encendida");
        }
    }

    // Metodo para apagar la luz, donde si está encendida, la apaga, si no ya nos dice que estaba apagada
    public static void apagarLuz(Luz aux) {
        if (aux.isEstado() == true) {
            aux.setEstado(false);
        }else{
            System.out.println("La luz ya está apagada");
        }
    }

    // Metodo para apagar en modo eco donde hacemos las condiciones supeustas en el proyecto
    public static void apagadoEco(){
        // Creacion de las 2 horas
        LocalTime uno= LocalTime.of(8, 00);
        LocalTime dos= LocalTime.of(18, 00);
        // Condicion
        if(Centralita.getReloj().isAfter(uno)&&Centralita.getReloj().isBefore(dos)){
           
            Centralita.ejecutarOrden(Comando.APAGAR_LUZ_GENERAL);
            
        }else{
            System.out.println("No se encuentra en el rango de hora correcto para el apagado eco");
        }
    }
    
    // toString
    @Override
    public String toString() {
        return "Luz{" + "estado=" + estado + ", consumo=" + consumo + '}';
    }

}
