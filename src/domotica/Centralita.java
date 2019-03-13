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
    private static Usuario usu = new Usuario("Rafa", "1234");
    private LocalDate fechaInstalacion;
    private String identificador;

    public static boolean comprobacionUsuario() {

        return usu.equals(Vista.login());

    }
}
