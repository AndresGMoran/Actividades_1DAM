package com.andresgmoran.Tema_10.Actividad03;

import java.util.ArrayList;

public class Pila<T> implements IPila<T> {
    ArrayList<T> lista;

    public Pila(ArrayList<T> lista) {
        this.lista = new ArrayList<>();
    }

    @Override
    public T push(T e) {
        lista.add(e);
        return e;
    }

    @Override
    public T pop() {
        T e = top();
        lista.remove(lista.size()-1);
        return e;
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public T top() {
        return lista.get(lista.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
