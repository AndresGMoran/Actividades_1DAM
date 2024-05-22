package com.andresgmoran.Tema_11.Actividad03;

import java.util.Arrays;

public abstract class Coche {
    private String matricula;
    private int velocidadActual;
    private int marchaActual;
    private final int[] marchas;

    public Coche(String matricula, int numMarchas) {
        this.matricula = matricula;
        velocidadActual = 0;
        marchaActual = 0;
        marchas = new int[numMarchas];
        for (int i= 0;i < numMarchas;i++){
            marchas[i] = i+1;
        }
    }
    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidadAFrenar);
    public abstract void cambiarMarcha(int marcha);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public int[] getMarchas() {
        return marchas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", marchas=" + Arrays.toString(marchas) +
                '}';
    }
}
