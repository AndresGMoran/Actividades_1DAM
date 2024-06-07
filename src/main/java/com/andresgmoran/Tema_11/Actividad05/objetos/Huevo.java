package com.andresgmoran.Tema_11.Actividad05.objetos;

public class Huevo extends ObjetoApilable{
    public Huevo(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + "Huevo{}";
    }
}
