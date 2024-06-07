package com.andresgmoran.Tema_11.Actividad05.objetos;

public class Madera extends ObjetoApilable{
    public Madera(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + "Madera{}";
    }
}
