package com.andresgmoran.Tema_07.AnexoPila.Actividad01;

import java.util.Arrays;

public class DynamicArray {
    private double[] arr;
    private int size;

    public DynamicArray(int capacidadInicial) {
        this.arr = new double[capacidadInicial];
        this.size = 0;
    }
    public DynamicArray() {
        this(10);
    }
    public boolean add(double valor){
        if(size >= arr.length)
            arr = aumentarTamanyo();
        arr[size] = valor;
        size++;

        return true;
    }
    public boolean add(int index, double value){
        if(size >= arr.length)
            arr = aumentarTamanyo();
        moveRight(index);
        arr[index] = value;

        return true;

    }
    public double remove(int index){
        arr[index] = 0;
        for (int i = index; i < size;i++){
            arr[i] = arr[i + 1];
        }
        size--;
        return arr[index];
    }
    public double removePorValue(double value){
        int index;
        double encontrado = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                encontrado = remove(i);
                break;
            }
        }
        return encontrado;
    }
    public double get(int indice){
        return arr[indice];
    }
    private void moveRight(int index){
        for (int i = size; i > index;i--){
            arr[i] = arr[i - 1];
        }
        size++;
    }
    private double[] aumentarTamanyo(){
        double[] nuevoArr = new double[size*2];
        System.arraycopy(arr, 0, nuevoArr, 0, arr.length);
        /*for (int i = 0; i <= arr.length; i++){
            arr[i] = nuevoArr[i];
        }*/
        return nuevoArr;

    }
    public void imprimirArray(){
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
