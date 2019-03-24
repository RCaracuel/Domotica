/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author rafa
 */
public class Reloj {

    // Atributos
    public static LocalTime hora;
    public static LocalDate fecha;

    // Constructor parametrizado
    public Reloj(LocalTime hora, LocalDate fecha) {

        this.hora = LocalTime.now();
        this.fecha = LocalDate.now();
    }

    // Constructor por defecto
    public Reloj() {
        this.hora = LocalTime.now();
        this.fecha = LocalDate.now();
    }

    // Metodo para mostrar la hora
    public static void mostrarHora() {
        LocalTime hora = LocalTime.now();
        System.out.println(hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
    }

    // Metodo para mostrar la fecha
    public static void mostrarFecha() {
        LocalDate fecha = LocalDate.now();
        Month mesActual = LocalDate.now().getMonth();
        String mesEspaniol = mesActual.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(fecha.getDayOfMonth() + " de " + mesEspaniol + " de " + fecha.getYear());
    }

    // Metodo para establecer una hora
    public static void setHora(LocalTime aux) {
        hora = aux;
    }

    // Metodo para establecer una fecha
    public static void setFecha(LocalDate aux) {
        fecha = aux;
    }

}
