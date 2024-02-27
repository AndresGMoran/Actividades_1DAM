package com.andresgmoran.Tema_07.Actividad01;

import java.util.Date;

public class Coche {
    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    public enum TipoCoche{
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    };
    private TipoCoche tipoCoche;
    private Date anyoFabricacion;
    public enum Seguro{
        TERCEROS, TODO_RIESGO
    }
    private Seguro seguro;

    public Coche(String modelo, String color, boolean metalizado, String matricula, Date anyoFabricacion, Seguro seguro, TipoCoche tipoCoche) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.seguro = seguro;
        this.tipoCoche = tipoCoche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                '}';
    }
}
