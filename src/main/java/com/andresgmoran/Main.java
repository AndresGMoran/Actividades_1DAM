package com.andresgmoran;

import com.andresgmoran.Lib.ArraysLib;
import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Tema_07.AnexoPila.Actividad01.DynamicArray;
import com.andresgmoran.Tema_07.AnexoPila.Pila;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        Random rnd = new Random();

        if (dynamicArray.set(0,100))
            System.out.println("Deberia fallar");

        for (int i = 0; i < 5;i++){
            dynamicArray.add(rnd.nextDouble() * 1000);
        }

        System.out.println("Array original: ");
        System.out.println(dynamicArray);

        System.out.println();
        System.out.println("Array con eliminacion 1: ");
        dynamicArray.remove(3);
        System.out.println(dynamicArray);

        System.out.println();
        System.out.println("Cambiar un elemento: ");
        dynamicArray.set(2,3);
        System.out.println(dynamicArray);

        System.out.println();
        System.out.println("Array con eliminacion 2: ");
        dynamicArray.removeWithValue(3);
        System.out.println(dynamicArray);







    }
}