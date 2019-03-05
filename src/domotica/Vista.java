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

    
    static Scanner teclado = new Scanner(System.in);
//    
//    public static Usuario login(){
//        
//        return ;
//    }
    private static int opcion;

    public static Comando menu() {

        do {
            System.out.println("MENÚ");
            System.out.println("-------------");
            System.out.println("Opción 1.Reloj del sistema");
            System.out.println("Opción 2.Puerta del garaje");
            System.out.println("Opción 3.Estancia");
            System.out.println("Opción 4.Estado general");
            System.out.println("0 para apagar Sistema");
            System.out.println("---------------");
            System.out.println("Elija una opción:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido Reloj del sistema. Elija una opción:");
                    System.out.println("1- Consultar hora");
                    System.out.println("2- Consultar fecha");
                    System.out.println("3- Cambiar hora");
                    System.out.println("4- Cambiar fecha");
                    System.out.println("0-Volver al menú");
                    opcion = teclado.nextInt();

                    switch (opcion) {
                        case 0:
                            
                            return Comando.VOLVER_MENU;
                            
                           
                        case 1:
                           return Comando.CONSULTAR_HORA;
                        case 2:
                           return Comando.CONSULTAR_FECHA;
                        case 3:
                            return Comando.MODIFICAR_HORA;
                        case 4:
                            return Comando.MODIFICAR_FECHA;

                    }
                    break;
                case 2:
                    System.out.println("Ha elegigo puerta del garaje. Elija una opción:");
                    System.out.println("1- Consultar estado");
                    System.out.println("2- Abrir puerta");
                    System.out.println("3- Cerrar puerta");
                    System.out.println("0-Volver al menú");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 0: 
                            
                            return Comando.VOLVER_MENU;
                        case 1:

                            return Comando.CONSULTAR_ESTADO_PUERTA_GAR;
                        case 2:
                            return Comando.ABRIR_PUERTA_GAR;
                        case 3:
                           return Comando.CERRAR_PUERTA_GAR;
                    }
                    break;
                case 3:
                    System.out.println("Ha elegido estancia. Elija una opción");
                    System.out.println("1-Salón");
                    System.out.println("2-Dormitorio");
                    System.out.println("0-Volver al menú");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 0:
                            return Comando.VOLVER_MENU;
                            
                        case 1:
                            System.out.println("Ha elegido salón. Elija una opción:");
                            System.out.println("1- Consultar estado persiana");
                            System.out.println("2- Subir persiana");
                            System.out.println("3- Bajar persiana");
                            System.out.println("4-Consultar estado de luz");
                            System.out.println("5- Encender luz");
                            System.out.println("6- Apagar luz");
                            System.out.println("7-Consultar estado cámara");
                            System.out.println("8- Encender camara");
                            System.out.println("9- Apagar camara");
                            System.out.println("0-Volver al menú");
                            opcion=teclado.nextInt();
                            switch (opcion) {
                                case 0:
                                    return Comando.VOLVER_MENU;
                                case 1:
                                   return Comando.CONSULTAR_ESTADO_PERSIANA_SAL;
                                   
                                case 2:
                                   return Comando.SUBIR_PERSIANA_SAL;
                                case 3:
                                    return Comando.BAJAR_PERSIANA_SAL;
                                case 4:
                                    return Comando.CONSULTAR_ESTADO_LUZ_SAL;
                                case 5:
                                    return Comando.ENCENDER_LUZ_SAL;
                                case 6:
                                   return Comando.APAGAR_LUZ_SAL;
                                case 7:
                                   return Comando.CONSULTAR_ESTADO_CAMARA_SAL;
                                case 8:
                                    return Comando.ENCENDER_CAMARA_SAL;
                                case 9:
                                    return Comando.APAGAR_CAMARA_SAL;
                            }
                            break;
                        case 2:
                            System.out.println("Ha elegido dormitorio. Elija una opción:");
                            System.out.println("Ha elegido salón. Elija una opción:");
                            System.out.println("1- Consultar estado persiana");
                            System.out.println("2- Subir persiana");
                            System.out.println("3- Bajar persiana");
                            System.out.println("4-Consultar estado de luz");
                            System.out.println("5- Encender luz");
                            System.out.println("6- Apagar luz");
                            System.out.println("7-Consultar estado cámara");
                            System.out.println("8- Encender camara");
                            System.out.println("9- Apagar camara");
                            System.out.println("0-Volver al menú");
                            opcion=teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                  return Comando.CONSULTAR_ESTADO_PERSIANA_DOR;
                                case 2:
                                   return Comando.SUBIR_PERSIANA_DOR;
                                case 3:
                                    return Comando.BAJAR_PERSIANA_DOR;
                                case 4:
                                    return Comando.CONSULTAR_ESTADO_LUZ_DOR;
                                case 5:
                                    return Comando.ENCENDER_LUZ_DOR;
                                case 6:
                                    return Comando.APAGAR_LUZ_DOR;
                                case 7:
                                    return Comando.CONSULTAR_ESTADO_CAMARA_DOR;
                                case 8:
                                    return Comando.ENCENDER_CAMARA_DOR;
                                case 9:
                                    return Comando.APAGAR_CAMARA_DOR;
                                case 0:
                                    return Comando.VOLVER_MENU;
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ha elegido estado general");
                    return Comando.ESTADO_GENERAL;

                case 0:
                    System.out.println("Ha elegido apagar el sistema.");
                    return Comando.APAGAR_SISTEMA;
            }
            System.out.println();
        } while (opcion != 0);
        return null;

    }
}
