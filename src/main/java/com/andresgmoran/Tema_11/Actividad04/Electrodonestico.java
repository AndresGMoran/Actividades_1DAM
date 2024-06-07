package com.andresgmoran.Tema_11.Actividad04;

import java.awt.*;

public class Electrodonestico implements ElectrodomesticoI {
    private double precio_base;
    private Color color;
    private char consumo_energetico;
    private final double peso;

    public Electrodonestico(double precio_base, Color color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }
    public Electrodonestico() {
        this(ElectrodomesticoI.PRECIO_BASE, ElectrodomesticoI.COLOR, ElectrodomesticoI.CONSUMO_ENERGETICO, ElectrodomesticoI.PESO);
    }
    public Electrodonestico(double precio_base, double peso) {
        this(precio_base, ElectrodomesticoI.COLOR, ElectrodomesticoI.CONSUMO_ENERGETICO, peso);
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public Color getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void comprobarConsumoEnergetico(char letra){
        if(letra >= 'A' && letra <= 'F'){
            this.consumo_energetico = letra;
        } else {
            this.consumo_energetico = ElectrodomesticoI.CONSUMO_ENERGETICO;
        }

    }

    @Override
    public void comprobarColor(Color color){
        if(color != null){
            this.color = color;
        } else {
            this.color = ElectrodomesticoI.COLOR;
        }
    }

    @Override
    public double precioFinal(){
        double precioFinal = precio_base;
        switch (this.consumo_energetico){
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        if(this.peso >= 0 && this.peso < 19){
            precioFinal += 10;
        } else if(this.peso >= 20 && this.peso < 49){
            precioFinal += 50;
        } else if(this.peso >= 50 && this.peso < 79){
            precioFinal += 80;
        } else if(this.peso >= 80){
            precioFinal += 100;
        }
        return precioFinal;
    }
}
