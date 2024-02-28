package com.andresgmoran.Lib;

import java.util.Date;

public class Calculos {
    public static int calcularEdad(Date fecha){
        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - fecha.getTime(); //Calcular la diferencia en milisegundos
        long msEnUnAnio = 1000L * 60 * 60 * 24 * 365; //Milisegundos en un año
        int edad = Math.round((float) diferencia /msEnUnAnio);
        return edad;
    }
}
