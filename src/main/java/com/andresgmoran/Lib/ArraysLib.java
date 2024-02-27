package com.andresgmoran.Lib;

import java.util.Random;
import java.util.Scanner;

public class ArraysLib {
    public static Scanner lector = new Scanner(System.in);
    public static Random rnd = new Random();
    /**
     * Solictar datos array
     * @param array es donde se almacena los datos solicitados
     * @return el array rellenado con los datos que insertado el usuario
     */
    public static int[] solicitarDatosArray(int[] array){
        for(int i = 0; i < array.length; i++){ //Recorremos la array
            System.out.printf("Dime el numero [%d]\n", i);
            array[i] = Integer.parseInt(lector.nextLine());
        }
        return array;
    }

    /**
     * Metodo para imprimir arrays
     * @param array es el array a imprimir
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length;i++){ //Recorremos la array
            System.out.printf("%d ",array[i]);
        }
    }

    /**
     * Rellenar array de numeros aleatorios
     * @param length es el tamaño de la array
     * @param min es el dato minimo
     * @param max es el dato maximo
     * @return el array rellenado con los numeros aleatorios
     */
    public static int[] arrayAleatorio(int length, int min, int max){
        if(length < 1) //Si el tamaño indicado es 0 o menor devolvemos null
            return null;
        if (min > max) //Si el min es mayor que el max devolvemos null
            return  null;
        int[] resultado = new int[length];
        for(int i = 0; i < resultado.length; i++){
            resultado[i] = rnd.nextInt(max - min +1) + min;
        }
        return resultado;
    }

    /**
     * Convertir un array a un String
     * @param array el array que queremos pasar a String
     * @param numDecimales el numero de decimales que queremos que tengan los numeros de la array
     * @return el constructor con los numeros a String
     */
    public String arrayToString(double[] array, int numDecimales){
        StringBuilder sb = new StringBuilder();
        String format = "%." + numDecimales + "f";
        for(int i = 0; i < array.length; i++){
            sb.append(String.format(format, array[i]));
        }
        return sb.toString();
    }
}
