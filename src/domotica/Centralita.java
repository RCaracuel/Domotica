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

    private Estancia garaje;
    private Estancia salon;
    private Estancia dormitorio;
    private Usuario usu;
    private LocalDate fechaInstalacion;
    private int identificador = 00000;

    public Centralita() {
        this.garaje = new Garaje();
        this.salon = new Salon();
        this.dormitorio = new Dormitorio();
        this.usu = new Usuario("Rosa", "123");
        this.fechaInstalacion = LocalDate.now();
        this.identificador++;
    }

    public boolean comprobacionUsuario(Usuario aux) {

        return this.usu.equals(aux);

    }

    public Estancia getGaraje() {
        return garaje;
    }

    public void setGaraje(Estancia garaje) {
        this.garaje = garaje;
    }

    public Estancia getSalon() {
        return salon;
    }

    public void setSalon(Estancia salon) {
        this.salon = salon;
    }

    public Estancia getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(Estancia dormitorio) {
        this.dormitorio = dormitorio;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public LocalDate getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(LocalDate fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
                int mes=teclado.nextInt();
                System.out.println("Introduzca año");
                int anio=teclado.nextInt();
                System.out.println("Introduzca día ");
                int dia= teclado.nextInt();
                Reloj.setFecha(LocalDate.of(anio, mes, dia));
                break;
            case CONSULTAR_ESTADO_PERSIANA_SAL:
                break;
                
        }
    }

}
