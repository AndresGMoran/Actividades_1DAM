package com.andresgmoran.Tema_11.Actividad06;

import com.andresgmoran.Lib.Calculos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Socio {
    private final String nif;
    private final String nombre;
    private final Date fechaNacimiento;
    private final String poblacion;
    private List<Alquiler> alquileres;

    public Socio(String nif, String nombre, Date fechaNacimiento, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.poblacion = poblacion;
        alquileres = new ArrayList<>();
    }

}
