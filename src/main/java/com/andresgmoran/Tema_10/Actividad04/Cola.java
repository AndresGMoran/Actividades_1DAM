package com.andresgmoran.Tema_10.Actividad04;

import java.util.ArrayList;

public class Cola<T> implements ICola<T>{
    private ArrayList<T> cola;

    public Cola(ArrayList<T> cola) {
        this.cola = new ArrayList<>();
    }

    @Override
    public boolean add(T e) {
        return cola.add(e);
    }

    @Override
    public T remove() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.remove(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public T peek() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.get(0);
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }
}
