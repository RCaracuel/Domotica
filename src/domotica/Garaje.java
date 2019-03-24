/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author rafa
 */
// La clase garaje es un subtipo o subclase de estancia. Garaje extiende a estancia o garaje hereda de estancia
public class Garaje extends Estancia {

    // Atributos
    private int capacidadVehiculos;
    private Puerta puertaAutomatica;

    // Los constructores son los unicos metodos que no se heredan
    // Constructor parametrizado
    public Garaje(int capacidadVehiculos, Puerta puertaAutomatica, int m2) {
        // Llamada al constructor de la clase padre
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puertaAutomatica = puertaAutomatica;
    }

    // Constructor por defecto
    public Garaje() {
        super(); // Crea la estancia con m2=0
        this.capacidadVehiculos = 0;
        this.puertaAutomatica = new Puerta();
    }

    // Getters y setters
    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuertaAutomatica() {
        return puertaAutomatica;
    }

    public void setPuertaAutomatica(Puerta puertaAutomatica) {
        this.puertaAutomatica = puertaAutomatica;
    }

    // Ejemplo de acceso a metodo heredado usando el puntero super, que apunta a la clase padre de la clase
    // en la que estoy
    // toString
    @Override
    public String toString() {
        return super.toString() + "\nGaraje{" + "capacidadVehiculos=" + capacidadVehiculos + ",\n" + puertaAutomatica + '}';
    }

}
