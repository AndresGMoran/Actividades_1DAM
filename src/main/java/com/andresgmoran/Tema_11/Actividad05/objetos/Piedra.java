package com.andresgmoran.Tema_11.Actividad05.objetos;

public class Piedra extends ObjetoApilable{
    public Piedra(String name){
        super(name);

    }

    @Override
    public String toString() {
        return super.toString() + "Piedra{}";
    }
}
