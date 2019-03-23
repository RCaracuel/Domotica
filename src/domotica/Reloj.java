/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author rafa
 */
public class Reloj {
    
    static LocalTime hora;
    static LocalDate fecha;

    public Reloj(LocalTime hora, LocalDate fecha) {
        this.hora = LocalTime.now();
        this.fecha=LocalDate.now();
    }
    public Reloj(){
        this.hora = LocalTime.now();
        this.fecha=LocalDate.now();
    }
    
    
    public static void mostrarHora(){
        LocalTime hora = LocalTime.now();
        System.out.println(hora);
    }
    
    public static void mostrarFecha(){
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
    }


    public static void setHora(LocalTime aux) {
        hora = aux;
    }
    
   
   public static void setFecha(LocalDate aux){
       fecha=aux;
   } 

}
