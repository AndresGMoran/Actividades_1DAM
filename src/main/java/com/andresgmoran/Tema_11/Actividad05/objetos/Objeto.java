package com.andresgmoran.Tema_11.Actividad05.objetos;

public class Objeto {
    private String name;
    public Objeto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "name='" + name + '\'' +
                '}';
    }
}
