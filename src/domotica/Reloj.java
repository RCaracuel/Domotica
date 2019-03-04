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
    
    public static void mostrarHora(){
        LocalTime hora = LocalTime.now();
        System.out.println(hora);
    }
    
    public static void mostrarFecha(){
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
    }
    
    
    

}
