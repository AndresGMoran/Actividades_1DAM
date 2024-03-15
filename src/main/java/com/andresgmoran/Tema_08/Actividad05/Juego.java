package com.andresgmoran.Tema_08.Actividad05;

import java.util.Random;

public class Juego {
    private static final int MAX_ATTEMPTS = 5;
    public int numIntentos = MAX_ATTEMPTS;
    public int numAdivinar;

    public Juego() {
        crearNuevoJuego();
    }

    public void crearNuevoJuego() {
        numIntentos = MAX_ATTEMPTS;
        numAdivinar = new Random().nextInt(101);
    }
    public int intentoAdivinar(int opcion) {
        if (opcion == numAdivinar) {
            return 0; // Gano
        } else {
            numIntentos--;
            if (numIntentos == 0) {
                return -1; // Perdio
            } else {
                return 1; // El juego continua
            }
        }
    }
}
