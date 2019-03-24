/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author Rosa
 */
public class Main {

    public static void main(String[] args) {

        // Creamos la centralita por defecto
        Centralita tmp = new Centralita();
        // Creamos el usuario
        Usuario nuevo;
        // Contador
        int contador = 1;
        // Hacemos un bucle donde el nuevo usuario le haremos el Vista.login() y el contador ira sumando, si este contador
        // llega a mas de 5 veces y el usuario no es igual al que ya tenemos se cerrará
        do {
            nuevo = Vista.login();
            contador++;

        } while (!(nuevo.equals(tmp.getUsu())) && contador <= 5);

        // Si el usuario es el correcto se ejecutara el menu
        if (tmp.comprobacionUsuario(nuevo)) {
            Centralita.ejecutarOrden(Vista.menu());
        // Si no pues nos saltará este mensaje y se apagará
        } else {
            System.out.println("El usuario o clave es incorrecto");
        }

    }
}
