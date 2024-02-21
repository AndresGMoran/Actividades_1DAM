package com.andresgmoran;

import com.andresgmoran.Lib.ArraysLib;
import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Tema_07.AnexoPila.Actividad01.DynamicArray;
import com.andresgmoran.Tema_07.AnexoPila.Pila;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add(45);
        dynamicArray.add(35);
        dynamicArray.add(57);
        dynamicArray.add(67);
        dynamicArray.add(20);
        System.out.println("Array original: ");
        dynamicArray.imprimirArray();
        System.out.println();
        System.out.println(dynamicArray.remove(2));
        System.out.println("Array con eliminacion: ");
        double num = dynamicArray.get(0);
        double num1 = dynamicArray.get(1);
        double num2 = dynamicArray.get(2);
        double num3 = dynamicArray.get(3);
        double num4 = dynamicArray.get(4);

        dynamicArray.imprimirArray();
        System.out.println("Array añadiendo: ");

        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.imprimirArray();

        System.out.println(dynamicArray.removePorValue(100));
        System.out.println();
        dynamicArray.imprimirArray();



    }
}