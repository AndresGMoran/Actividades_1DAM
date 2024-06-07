package com.andresgmoran.Tema_11.Actividad04;

import java.awt.*;

public class Television extends Electrodonestico{
    private final int resolucion;
    private final boolean smart;

    public Television(double precio_base, Color color, char consumo_energetico, double peso, int resolucion, boolean smart) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.smart = smart;
    }
    public Television(int resolucion, boolean smart) {
        this.resolucion = resolucion;
        this.smart = smart;
    }
    public Television(double precio_base, double peso) {
        super(20, peso);
        this.resolucion = 20;
        this.smart = false;
    }

    public Television() {
        this(20, false);
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal *= 0.3;
        }
        if (smart) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", smart=" + smart +
                '}';
    }
}
