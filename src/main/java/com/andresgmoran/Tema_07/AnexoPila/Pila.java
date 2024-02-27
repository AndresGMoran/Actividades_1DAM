package com.andresgmoran.Tema_07.AnexoPila;

public class Pila<T> {
    private Object[] datos;
    private int tope;

    public Pila(int capacidadIncial){
        datos = new Object[capacidadIncial];
        tope = -1;
    }
    public void push(T elemento){
       if (isFull()){
           ampliarArray();
       }
       datos[++tope] = elemento;
    }
    public T pop(){
        if (!isEmpty()) {
            return (T) datos[tope--];
        }
        return null;
    }
    public int size(){
        return tope + 1;
    }
    private void ampliarArray(){
        Object[] nuevoArray = new Object[datos.length *2];
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
