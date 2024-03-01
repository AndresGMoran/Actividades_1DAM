package com.andresgmoran.Tema_07.Actividad06;

import java.util.Date;

public class Bicicleta {
    private final int numReferencia;
    private final String marca;
    private final String modelo;
    private final double peso;
    private final double tamanyoRuedas;
    private final boolean motor;
    private final Date fechaFabricacion;
    private final double precio;
    private int stock;

    public Bicicleta(int numReferencia, String marca, String modelo, double peso, double tamanyoRuedas, boolean motor, Date fechaFabricacion, double precio, int stock) {
        this.numReferencia = numReferencia;
        this.modelo = marca;
        this.marca = modelo;
        this.peso = peso;
        this.tamanyoRuedas = tamanyoRuedas;
        this.motor = motor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanyoRuedas() {
        return tamanyoRuedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicicleta bicicleta = (Bicicleta) o;

        if (numReferencia != bicicleta.numReferencia) return false;
        if (Double.compare(peso, bicicleta.peso) != 0) return false;
        if (Double.compare(tamanyoRuedas, bicicleta.tamanyoRuedas) != 0) return false;
        if (motor != bicicleta.motor) return false;
        if (Double.compare(precio, bicicleta.precio) != 0) return false;
        if (stock != bicicleta.stock) return false;
        if (!marca.equals(bicicleta.marca)) return false;
        if (!modelo.equals(bicicleta.modelo)) return false;
        return fechaFabricacion.equals(bicicleta.fechaFabricacion);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numReferencia;
        result = 31 * result + marca.hashCode();
        result = 31 * result + modelo.hashCode();
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tamanyoRuedas);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (motor ? 1 : 0);
        result = 31 * result + fechaFabricacion.hashCode();
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stock;
        return result;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numReferencia=" + numReferencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", tamanyoRuedas=" + tamanyoRuedas +
                ", motor=" + motor +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
