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
public class Salon extends Habitacion {

    private boolean terraza;



    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }




    public void setPersiana(Persiana persiana) {
        persiana = persiana;
    }
    
    public void setEstado(EstadoPersiana aux){
        setEstado(aux);
    }
    

}
