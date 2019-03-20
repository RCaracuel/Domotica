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
public class Habitacion extends Estancia {
    
    private Luz luz;
    private Persiana persiana;
    private Camara camara;

      public Habitacion(Luz luz, Persiana persiana, Camara camara, int m2) {
        super(m2);
        this.luz = luz;
        this.persiana = persiana;
        this.camara = camara;
    }

    public Habitacion() {
        super();
        this.camara = new Camara();
        this.luz = new Luz();
        this.persiana = new Persiana();
    }

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "luz=" + luz + ", persiana=" + persiana + ", camara=" + camara + '}';
    }
    
}
