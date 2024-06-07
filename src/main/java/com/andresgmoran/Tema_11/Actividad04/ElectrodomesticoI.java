package com.andresgmoran.Tema_11.Actividad04;

import java.awt.*;

public interface ElectrodomesticoI {
    public static final double PRECIO_BASE = 100;
    public static final Color COLOR = Color.WHITE;
    public static final char CONSUMO_ENERGETICO = 'F';
    public static final double PESO = 5;

    void comprobarConsumoEnergetico(char letra);
    void comprobarColor(Color color);
    double precioFinal();
}
