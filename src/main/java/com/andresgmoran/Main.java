package com.andresgmoran;

import com.andresgmoran.Lib.ArraysLib;
import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_07.AnexoPila.Actividad01.DynamicArray;
import com.andresgmoran.Tema_07.AnexoPila.Actividad05.NotacionPolacaInversa;
import com.andresgmoran.Tema_07.AnexoPila.Cola;
import com.andresgmoran.Tema_07.AnexoPila.Pila;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NotacionPolacaInversa notacionPolacaInversa = new NotacionPolacaInversa("12 3 -");
        System.out.println(notacionPolacaInversa.parse());
        /*Random rnd = new Random();
        Cola cola = new Cola(5);
        for (int i = 0;i <= 10; i++){
            cola.add(rnd.nextDouble() * 10);
        }
        System.out.println(cola);
        for (int i = 0; i <= 10; i++){
            if (rnd.nextBoolean()) {
                cola.add(rnd.nextDouble() * 10);
            }else {
                double res = cola.remove();
            }
        }
        System.out.println(cola);*/
    }
}