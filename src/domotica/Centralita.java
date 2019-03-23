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
    private static LocalTime reloj;
    private int identificador = 00000;

    public Centralita() {
        garaje = new Garaje();
        salon = new Salon();
        dormitorio = new Dormitorio();
        usu = new Usuario("Rosa", "123");
        fechaInstalacion = LocalDate.now();
        identificador++;
        reloj=LocalTime.now();
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

    public static LocalTime getReloj() {
        return reloj;
    }

    public static void setReloj(LocalTime reloj) {
        Centralita.reloj = reloj;
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
        String resp;
        switch (aux) {
            case VOLVER_MENU:
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case CONSULTAR_HORA:
                Reloj.mostrarHora();
                Centralita.ejecutarOrden(Vista.menu());

                break;
            case CONSULTAR_FECHA:
                Reloj.mostrarFecha();
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case MODIFICAR_HORA:
                System.out.println("Introduzca hora:");
                int hora = teclado.nextInt();
                System.out.println("Introduzca minutos");
                int minutos = teclado.nextInt();
                Reloj.setHora(LocalTime.of(hora, minutos));
                System.out.println("Hora modificada correctamente");
                Centralita.ejecutarOrden(Vista.menu());

                break;
            case MODIFICAR_FECHA:
                System.out.println("Introduzca mes en número");
                int mes = teclado.nextInt();
                System.out.println("Introduzca año");
                int anio = teclado.nextInt();
                System.out.println("Introduzca día ");
                int dia = teclado.nextInt();
                Reloj.setFecha(LocalDate.of(anio, mes, dia));
                System.out.println("Fecha modificada correctamente");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case CONSULTAR_ESTADO_PERSIANA_SAL:
                System.out.println(Persiana.estado(salon.getPersiana()));
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case SUBIR_PERSIANA_SAL:
                Persiana.subirPersiana(salon.getPersiana());
                System.out.println("La persiana se ha subido");
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case BAJAR_PERSIANA_SAL:
                Persiana.bajarPersiana(salon.getPersiana());
                System.out.println("La persiana se ha bajado");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case CONSULTAR_ESTADO_LUZ_SAL:
                System.out.println(Luz.estado(salon.getLuz()));
                System.out.println("¿Desea volver al menú principal?");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case ENCENDER_LUZ_SAL:
                Luz.encenderLuz(salon.getLuz());
                System.out.println("La luz se ha encendido");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_LUZ_SAL_MANUAL:
                Luz.apagarLuz(salon.getLuz());
                System.out.println("La luz se ha apagado");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_LUZ_GENERAL:
                Luz.apagarLuz(salon.getLuz());
                Luz.apagarLuz(dormitorio.getLuz());
                System.out.println("La orden se ha ejecutado correctamente");
                Centralita.ejecutarOrden(Vista.menu());
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGADO_ECO:
                Luz.apagadoEco();
                System.out.println("La orden se ha ejecutado correctamente");

                break;
            case CONSULTAR_ESTADO_CAMARA_SAL:
                System.out.println(Camara.estado(salon.getCamara()));
                Centralita.ejecutarOrden(Vista.menu());
                break;

            case ENCENDER_CAMARA_SAL:
                Camara.encenderCamara(salon.getCamara());
                System.out.println("La camara se ha encendido");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_CAMARA_SAL:
                Camara.apagarCamara(salon.getCamara());
                System.out.println("La camara se ha apagado");
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case CONSULTAR_ESTADO_PERSIANA_DOR:
                System.out.println(Persiana.estado(dormitorio.getPersiana()));
                Centralita.ejecutarOrden(Vista.menu());
                break;

            case SUBIR_PERSIANA_DOR:
                Persiana.subirPersiana(dormitorio.getPersiana());
                System.out.println("La persiana se ha subido");
                Centralita.ejecutarOrden(Vista.menu());
                break;

            case BAJAR_PERSIANA_DOR:
                Persiana.bajarPersiana(dormitorio.getPersiana());
                System.out.println("La persiana se ha bajado");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case CONSULTAR_ESTADO_LUZ_DOR:
                System.out.println(Luz.estado(dormitorio.getLuz()));
                Centralita.ejecutarOrden(Vista.menu());

                break;
            case ENCENDER_LUZ_DOR:
                Luz.encenderLuz(dormitorio.getLuz());
                System.out.println("La luz se ha encendido");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_LUZ_DOR:
                Luz.apagarLuz(dormitorio.getLuz());
                System.out.println("La luz se ha apagado");
                Centralita.ejecutarOrden(Vista.menu());
                break;

            case CONSULTAR_ESTADO_CAMARA_DOR:
                System.out.println(Camara.estado(dormitorio.getCamara()));
                Centralita.ejecutarOrden(Vista.menu());
                break;

            case ENCENDER_CAMARA_DOR:
                Camara.encenderCamara(dormitorio.getCamara());
                System.out.println("La camara se ha encendido");
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_CAMARA_DOR:
                Camara.apagarCamara(dormitorio.getCamara());
                System.out.println("La camara se ha apagado");
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case CONSULTAR_ESTADO_PUERTA_GAR:
                System.out.println(Puerta.estado(garaje.getPuertaAutomatica()));
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case ABRIR_PUERTA_GAR:
                Puerta.subirPuerta(garaje.getPuertaAutomatica());
                System.out.println("La puerta del garaje se ha subido");
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case CERRAR_PUERTA_GAR:
                Puerta.bajarPuerta(garaje.getPuertaAutomatica());
                System.out.println("La puerta del garaje se ha bajado");
                Centralita.ejecutarOrden(Vista.menu());

                break;

            case ESTADO_GENERAL:
                System.out.println("Estado General de la vivienda:");
                System.out.println("Hora de la centralita: ");
                Reloj.mostrarHora();
                System.out.println("Fecha de la centralita: ");
                Reloj.mostrarFecha();
                System.out.println("Cámara salón: " + Camara.estado(salon.getCamara()));
                System.out.println("Persiana salón: " + salon.getPersiana().getEstado());
                System.out.println("Luz salón: " + Luz.estado(salon.getLuz()));
                System.out.println("Cámara dormitorio: " + Camara.estado(dormitorio.getCamara()));
                System.out.println("Persiana dormitorio: " + dormitorio.getPersiana().getEstado());
                System.out.println("Luz dormitorio: " + Luz.estado(dormitorio.getLuz()));
                System.out.println("Puerta del garaje: " + Puerta.estado(garaje.getPuertaAutomatica()));
                Centralita.ejecutarOrden(Vista.menu());
                break;
            case APAGAR_SISTEMA:
                System.out.println("Apagando sistema");
                break;
        }
    }

}
