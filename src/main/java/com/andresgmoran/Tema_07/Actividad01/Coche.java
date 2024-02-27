package com.andresgmoran.Tema_07.Actividad01;
import net.datafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class Coche {
    public enum tipo {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO;
    }

    public enum seguro {
        TERCEROS, TODO_RIESGO;
    }

    private final String modelo;
    private final String color;
    private final boolean  metalizado;
    private final String matricula;
    private final int anyoFabricacion;
    private  tipo tipo;
    private seguro seguro;
    private Random rnd;

    //Builder coche
    public Coche(String modelo, String color, boolean metalizado, String matricula, int anyoFabricacion, tipo tipo, seguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.tipo = tipo;
        this.seguro = seguro;
    }

    //Builder coche con parametros
    public Coche(){
        Random rnd = new Random();
        Faker faker = new Faker(new Locale("es","ES"));

        this.modelo= faker.vehicle().makeAndModel() ;
        this.color = faker.vehicle().color();
        this.metalizado = rnd.nextBoolean();
        this.matricula = faker.vehicle().licensePlate();
        this.anyoFabricacion = rnd.nextInt(1990,2024+1);

        int seleccionTipo = rnd.nextInt(tipo.values().length);
        this.tipo = tipo.values()[seleccionTipo];

        int seleccionSeguro = rnd.nextInt(seguro.values().length);
        this.seguro = seguro.values()[seleccionSeguro];
    }

    @Override
    public String toString() {
        return "Coche{" +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                ", tipo=" + tipo +
                ", seguro=" + seguro +
                '}';
    }
}
