/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;

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
    private int identificador=00000;

    public Centralita() {
        this.garaje = new Garaje();
        this.salon = new Salon();
        this.dormitorio = new Dormitorio();
        this.usu = new Usuario("Rosa","123");
        this.fechaInstalacion =LocalDate.now();
        this.identificador++;
    }
 
    public  boolean comprobacionUsuario(Usuario aux) {

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

    
   
    
}
