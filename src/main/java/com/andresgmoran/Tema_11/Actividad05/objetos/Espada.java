package com.andresgmoran.Tema_11.Actividad05.objetos;

public class Espada extends Objeto{
    public Espada(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + "Espada{}";
    }
}
