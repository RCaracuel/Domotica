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
       
       
    
      
       Centralita tmp= new Centralita();
       Usuario nuevo;
       int contador=1;
        do {
            
           nuevo= Vista.login(); 
           
            
           contador++;
            
        } while (!(nuevo.equals(tmp.getUsu()))&&contador<=5);
        
        if(tmp.comprobacionUsuario(nuevo)){
            Vista.menu();
        }else{
            System.out.println("El usuario o clave es incorrecto");
        }

       //Garaje g1=new Garaje();
       //System.out.println(g1);
       
       //Garaje g2=new Garaje(2,new Puerta(),50);
       //System.out.println(g2);
       
    }
}
