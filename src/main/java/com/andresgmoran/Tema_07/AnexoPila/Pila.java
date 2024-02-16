package com.andresgmoran.Tema_07.AnexoPila;

public class Pila {
    private String[] datos;
    private int tope;

    public Pila(int capacidadIncial){
        datos = new String[capacidadIncial];
        tope = -1;
    }
    public void push(String elemento){
       if (isFull()){
           ampliarArray();
       }
       datos[++tope] = elemento;
    }
    public String pop(){
        if (isEmpty()) {
            return datos[tope--];
        }
        return null;
    }
    public int size(){
        return tope + 1;
    }
    private void ampliarArray(){
        String[] nuevoArray = new String[datos.length *2];
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
