/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Centralita {

    private static Garaje garaje;
    private static Salon salon;
    private static Dormitorio dormitorio;
    private static Usuario usu;
    private static LocalDate fechaInstalacion;
    private int identificador = 00000;

    public Centralita() {
        garaje = new Garaje();
        salon = new Salon();
        dormitorio = new Dormitorio();
        usu = new Usuario("Rosa", "123");
        fechaInstalacion = LocalDate.now();
        identificador++;
    }

    public boolean comprobacionUsuario(Usuario aux) {

        return usu.equals(aux);

    }

    public Estancia getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        garaje = garaje;
    }

    public Estancia getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        salon = salon;
    }

    public Estancia getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(Dormitorio dormitorio) {
        dormitorio = dormitorio;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        usu = usu;
    }

    public LocalDate getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(LocalDate fechaInstalacion) {
        fechaInstalacion = fechaInstalacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        identificador = identificador;
    }

    public static void ejecutarOrden(Comando aux) {
        Scanner teclado = new Scanner(System.in);
        switch (aux) {
            case VOLVER_MENU:
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case CONSULTAR_HORA:
                Reloj.mostrarHora();
                break;
            case CONSULTAR_FECHA:
                Reloj.mostrarFecha();
                break;
            case MODIFICAR_HORA:
                System.out.println("Introduzca hora:");
                int hora = teclado.nextInt();
                System.out.println("Introduzca minutos");
                int minutos = teclado.nextInt();
                Reloj.setHora(LocalTime.of(hora, minutos));
                break;
            case MODIFICAR_FECHA:
                System.out.println("Introduzca mes en número");
                int mes = teclado.nextInt();
                System.out.println("Introduzca año");
                int anio = teclado.nextInt();
                System.out.println("Introduzca día ");
                int dia = teclado.nextInt();
                Reloj.setFecha(LocalDate.of(anio, mes, dia));
                break;
            case CONSULTAR_ESTADO_PERSIANA_SAL:
                Persiana.estado(salon.getPersiana());
                break;

            case SUBIR_PERSIANA_SAL:
                Persiana.subirPersiana(salon.getPersiana());
                System.out.println("La persiana se ha subido");
                break;

            case BAJAR_PERSIANA_SAL:
                Persiana.bajarPersiana(salon.getPersiana());
                System.out.println("La persiana se ha bajado");
                break;
            case CONSULTAR_ESTADO_LUZ_SAL:
                Luz.estado(salon.getLuz());
                break;
            case ENCENDER_LUZ_SAL:
                Luz.encenderLuz(salon.getLuz());
                System.out.println("La luz se ha encendido");
                break;
            case APAGAR_LUZ_SAL:
                Luz.apagarLuz(salon.getLuz());
                System.out.println("La luz se ha apagado");
                break;

            case CONSULTAR_ESTADO_CAMARA_SAL:
                Camara.estado(salon.getCamara());
                break;

            case ENCENDER_CAMARA_SAL:
                Camara.encenderCamara(salon.getCamara());
                System.out.println("La camara se ha encendido");
                break;
            case APAGAR_CAMARA_SAL:
                Camara.apagarCamara(salon.getCamara());
                System.out.println("La camara se ha apagado");
                break;
        }
    }

}
