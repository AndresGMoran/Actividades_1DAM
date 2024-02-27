package com.andresgmoran.Tema_07.AnexoPila;

public class PilaDouble {
    private double[] datos;
    private int tope;

    public PilaDouble(int capacidadIncial){
        datos = new double[capacidadIncial];
        tope = -1;
    }
    public void push(double elemento){
       if (isFull()){
           ampliarArray();
       }

       datos[++tope] = elemento;
    }
    public Double pop(){
        if (!isEmpty()) {
            return datos[tope--];
        }
        return Double.POSITIVE_INFINITY;
    }
    public int size(){
        return tope + 1;
    }
    private void ampliarArray(){
        double[] nuevoArray = new double[datos.length *2];
        for (int i = 0; i < datos.length; i++){
            nuevoArray[i] = datos[i];
        }
        datos = nuevoArray;
    }
    private boolean isFull(){
        return tope == datos.length -1;
    }
    public boolean isEmpty(){
        return tope == -1;
    }

}
