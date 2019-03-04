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

//    static Scanner teclado = new Scanner(System.in);
//
//    private static int opcion;
//
//    public static void menu() {
//
//        do {
//            System.out.println("MENÚ");
//            System.out.println("-------------");
//            System.out.println("Opción 1.Reloj del sistema");
//            System.out.println("Opción 2.Puerta del garaje");
//            System.out.println("Opción 3.Persianas");
//            System.out.println("Opción 4.Iluminación");
//            System.out.println("Opción 5.Vigilancia");
//            System.out.println("Opción 6.Estado general de la vivienda");
//            System.out.println("0 para apagar Sistema");
//            System.out.println("---------------");
//            System.out.println("Elija una opción:");
//            opcion = teclado.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("Ha elegido Reloj del sistema");
//                    break;
//                case 2:
//                    System.out.println("Ha elegigo puerta del garaje");
//                    break;
//                case 3:
//                    System.out.println("Ha elegido persianas");
//                    break;
//                case 4:
//                    System.out.println("Ha elegido persianas");
//                    break;
//                case 5:
//                    System.out.println("Ha elegido vigilancia");
//                    break;
//                case 6:
//                    System.out.println("Ha elegido estado general de la vivienda");
//                    break;
//                case 0:
//                    System.out.println("Ha elegido apagar el sistema.");
//                    break;
//            }
//            System.out.println();
//        } while (opcion != 0);
//
//    }

    private static Scanner teclado = new Scanner (System.in);
    
    public static Usuario login(){
        
    }
    
    public static Comando menuu() {
        System.out.println("Bienvenido a la centralita");
        System.out.println("--------------------------");
        
        System.out.println("Que es lo que es compae?");
        System.out.println("1.- Reloj del sistema");
        System.out.println("\t1.1- Consultar hora");
        System.out.println("\t1.1- Consultar fecha");
        System.out.println("\t1.1- Cambiar hora");
        System.out.println("\t1.1- Cambiar fecha");
        System.out.println("2.- Puerta de garaje");
                 System.out.println("2.1- Consultar estado");
                 System.out.println("2.2- Abrir puerta");
                 System.out.println("2.3- Cerrar puerta");
        System.out.println("3.-Estancia");
                System.out.println("\t3.1-Salon");
                    System.out.println("\t3.1.1- Consultar estado");
                    System.out.println("\t3.1.2- Subir persiana");
                    System.out.println("\t3.1.3- Bajar persiana");
                    System.out.println("\t3.1.4- Encender luz");
                    System.out.println("\t3.1.5- Apagar luz");
                    System.out.println("\t3.1.6- Encender camara");
                    System.out.println("\t3.1.7- Apagar camara");
                System.out.println("\t3.2-Dormitorio");
                    System.out.println("\t3.2.1- Consultar estado");
                    System.out.println("\t3.2.2- Subir persiana");
                    System.out.println("\t3.2.3- Bajar persiana");
                    System.out.println("\t3.2.4- Encender luz");
                    System.out.println("\t3.2.5- Apagar luz");
                    System.out.println("\t3.2.6- Encender camara");
                    System.out.println("\t3.2.7- Apagar camara");
        System.out.println("4.-Estado general");
        System.out.println("5.-Apagar sistema");
  
       
        

    }
}
