package com.andresgmoran.Tema_07.AnexoPila.Actividad01;

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
    private void moverDerecha(int index){
        for (int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }
        size++;
    }
    public boolean add(double valor){
        if(size >= valor)
            aumentarTamaño();

    }
    public double get(int indice){
        return arr[indice];
    }
    private double[] aumentarTamaño(){
        double[] nuevoArr = new double[size*2];
        arr = nuevoArr;
        return nuevoArr;

    }
}
