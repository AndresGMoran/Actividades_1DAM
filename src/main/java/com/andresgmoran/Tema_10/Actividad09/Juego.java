package com.andresgmoran.Tema_10.Actividad09;

import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_10.Actividad08.Diccionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {
    private List<Integer> puntuaciones;
    private DiccionarioAc09 diccionario;
    private Random rnd;

    public Juego(DiccionarioAc09 diccionario) {
        rnd = new Random();
        this.diccionario = diccionario;
        puntuaciones = new ArrayList<>();
        boolean acierto = true;
        do {
            String palabra = generarRandom();
            int contPuntos = 0;
            String palabraUsuario = IOLib.solicitarString("Adivina la palabrea de esta definicion: " + generarRandom(), 2, 40);
            if (palabraUsuario.equals(palabra)) {
                System.out.println("Correcto");
                contPuntos++;
            } else {
                System.out.println("Perdiste");
                acierto = false;
            }
        }while (acierto);
    }

    /**
     * Metodo para seleccionar una palabra aleatoria del diccionario
     * @return la palabra aleatoria.
     */
    private String generarRandom(){
        int palabraRandom = rnd.nextInt(0, diccionario.palabras().length);
        return diccionario.palabras()[palabraRandom];
    }

}
