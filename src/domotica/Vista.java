/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;
import java.util.Scanner;
/**
 *
 * @author Rosa
 */
public class Vista {
    
    static Scanner teclado= new Scanner(System.in);
    
    private static int opcion;
    
    
    public static void menu(){
        
        
        do{
        System.out.println("MENÚ");
        System.out.println("-------------");
        System.out.println("Opción 1.Reloj del sistema");
        System.out.println("Opción 2.Puerta del garaje");
        System.out.println("Opción 3.Persianas");
        System.out.println("Opción 4.Iluminación");
        System.out.println("Opción 5.Vigilancia");
        System.out.println("Opción 6.Estado general de la vivienda");
        System.out.println("0 para apagar Sistema");
            System.out.println("---------------");
            System.out.println("Elija una opción:");
          opcion=teclado.nextInt();
          
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido Reloj del sistema");
                    break;
                case 2:
                    System.out.println("Ha elegigo puerta del garaje");
                    break;
                case 3:
                    System.out.println("Ha elegido persianas");
                    break;
                case 4:
                    System.out.println("Ha elegido persianas");
                    break;
                case 5:
                    System.out.println("Ha elegido vigilancia");
                    break;
                case 6:
                    System.out.println("Ha elegido estado general de la vivienda");
                    break;
                case 0:
                    System.out.println("Ha elegido apagar el sistema.");
                    break;
            }
            System.out.println();
        }while(opcion!=0);
        
        
        
    }
}
