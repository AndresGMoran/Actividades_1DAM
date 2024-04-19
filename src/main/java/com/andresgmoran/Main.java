package com.andresgmoran;

import com.andresgmoran.Tema_10.Actividad01.Actividad01;
import com.andresgmoran.Tema_10.Actividad02.ArrayListEstadisticas;

import java.util.Random;

public class Main {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        ArrayListEstadisticas numeros = new ArrayListEstadisticas();
        for (int i = 0; i < 50;i++){
            numeros.add(rnd.nextDouble());
        }
        System.out.println(numeros);
        System.out.println(numeros.moda());
    }
}