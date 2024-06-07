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
    public void nuevoAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
}
