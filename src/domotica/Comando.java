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
public enum Comando {

    // Los tipos ENUM tienen dos características fundamentales:
    // 1.- El constructor es privado
    // 2.- Solo pueden instanciarse con un tipo de objeto concreto
    APAGAR_SISTEMA(0, "Apagar sistema"),
    CONSULTAR_HORA(1, "Consulta la hora del sistema"),
    MODIFICAR_HORA(2, "Modifica la hora de la centralita"),
    CONSULTAR_FECHA(3, "Consulta la fecha del sistema"),
    MODIFICAR_FECHA(4, "Modifica la fecha de la centralita"),
    CONSULTAR_ESTADO_PUERTA_GAR(5, "Consulta el estado de la puerta"),
    ABRIR_PUERTA_GAR(6, "Abre la puerta del garaje"),
    CERRAR_PUERTA_GAR(7, "Cierra la puerta del garaje"),
    CONSULTAR_ESTADO_PERSIANA_DOR(8, "Consulta el estado de la persiana"),
    SUBIR_PERSIANA_DOR(9, "Sube persiana"),
    BAJAR_PERSIANA_DOR(10, "Baja persiana"),
    CONSULTAR_ESTADO_LUZ_DOR(11, "Consulta el estado de la luz"),
    ENCENDER_LUZ_DOR(12, "Enciende la luz"),
    APAGAR_LUZ_DOR(13, "Apaga la luz"),
    CONSULTAR_ESTADO_CAMARA_DOR(14, "Consulta el estado de la camara"),
    ENCENDER_CAMARA_DOR(15, "Enciende la camara"),
    APAGAR_CAMARA_DOR(16, "Apaga la camara"),
    VOLVER_MENU(17, "Vuelve al menu"),
    ESTADO_GENERAL(18, "Consultar estado"),
    CONSULTAR_ESTADO_PERSIANA_SAL(19, "Consulta el estado de la persiana"),
    SUBIR_PERSIANA_SAL(20, "Sube persiana"),
    BAJAR_PERSIANA_SAL(21, "Baja persiana"),
    CONSULTAR_ESTADO_LUZ_SAL(22, "Consulta el estado de la luz"),
    ENCENDER_LUZ_SAL(23, "Enciende la luz"),
    APAGAR_LUZ_SAL_MANUAL(24, "Apaga la luz de forma manual"),
    APAGAR_LUZ_GENERAL(28,"Apaga la luz de todas las estancias"),
    APAGADO_ECO(29,"Apaga las luces que detecte encendidas entre las 8a.m y s p.m"),
    CONSULTAR_ESTADO_CAMARA_SAL(25, "Consulta el estado de la camara"),
    ENCENDER_CAMARA_SAL(26, "Enciende la camara"),
    APAGAR_CAMARA_SAL(27, "Apaga la camara");

    private int codigo;

    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;

    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
