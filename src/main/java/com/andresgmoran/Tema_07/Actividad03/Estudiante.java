package com.andresgmoran.Tema_07.Actividad03;

import java.util.Date;

public class Estudiante {
    private final String nia;
    private final String nombre;
    private final String apellidos;
    private final Date fechaNacimiento;
    private final int grupo;
    private final String numTelefono;

    public Estudiante(String nia, String nombre, String apellidos, Date fechaNacimiento, int grupo, String numTelefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.numTelefono = numTelefono;
    }
    public String getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrupo() {
        return grupo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "sip='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", grupo=" + grupo +
                ", numTelefono='" + numTelefono + '\'' +
                '}';
    }
}
