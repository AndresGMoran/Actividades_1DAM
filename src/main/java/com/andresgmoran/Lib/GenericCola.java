package com.andresgmoran.Lib;

import java.util.ArrayList;

public class GenericCola<T> {
    ArrayList<T> cola = new ArrayList<>();

    public int size(){
        return cola.size();
    }

    public boolean add(T value){
        return cola.add(value);

    }

    public T remove(){
        if (cola.isEmpty()) {
            return null;
        }
        return cola.remove(0);
    }

    public T peek(){
        if (cola.isEmpty()) {
            return null;
        }
        return cola.get(0);
    }

    @Override
    public String toString() {
        return "Cola [cola=" + cola + "]";
    }

}
