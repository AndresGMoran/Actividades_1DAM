package com.andresgmoran.Tema_11.Actividad04;

import java.awt.*;

public class Lavadora extends Electrodonestico{
    private final int carga;
    public Lavadora(double precio_base, Color color, char consumo_energetico, double peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }
    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = 5;
    }
    public Lavadora() {
        this(ElectrodomesticoI.PRECIO_BASE, ElectrodomesticoI.COLOR, ElectrodomesticoI.CONSUMO_ENERGETICO, ElectrodomesticoI.PESO, 5);
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
