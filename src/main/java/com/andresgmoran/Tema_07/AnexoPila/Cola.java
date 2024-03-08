/*
package com.andresgmoran.Tema_07.AnexoPila;

import com.andresgmoran.Tema_07.AnexoPila.Actividad01.DynamicArray;

import java.util.Objects;

public class Cola {
    private DynamicArray data;
    public Cola(int inicalCapacity){
        data = new DynamicArray(inicalCapacity);
    }
    public int size(){
        return data.size();
    }
    public boolean add(double value){
       return data.add(value);
    }
    public double remove(){
        if (isEmpty())
            return Double.POSITIVE_INFINITY;
        return data.remove(0);
    }
    public double peek(){
        if (isEmpty())
            return Double.POSITIVE_INFINITY;
        return data.get(0);
    }
    public boolean isEmpty(){
        return data.size() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cola cola = (Cola) o;

        return Objects.equals(data, cola.data);
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "data=" + data +
                '}';
    }
}
*/
