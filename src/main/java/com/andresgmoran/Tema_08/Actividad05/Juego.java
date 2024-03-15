package com.andresgmoran.Tema_08.Actividad05;

import java.util.Random;

public class Juego {
    private static final int MAX_ATTEMPTS = 5;
    public int numIntentos = MAX_ATTEMPTS;
    public int numAdivinar;

    public Juego() {
        crearNuevoJuego();
    }

    /**
     * Metodo para crear un nuevo juego(Poniendo los intentos devuelta a 5 y creando otro num random).
     */
    public void crearNuevoJuego() {
        numIntentos = MAX_ATTEMPTS;
        numAdivinar = new Random().nextInt(101);
    }

    /**
     * Metodo en el que se definen las distintas opcion a la hora de jugar
     * @param opcion el numero que el usuario a insertado
     * @return 0 si a ganado, -1 si el numero de intentos ya llegado a 0 y 1 si aun tiene intentos.
     */
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
