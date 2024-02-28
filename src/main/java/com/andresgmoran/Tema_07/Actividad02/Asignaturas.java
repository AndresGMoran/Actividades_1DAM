package com.andresgmoran.Tema_07.Actividad02;

public class Asignaturas {
    private final String nombre;
    private final int codigo;
    private final int curso;

    public Asignaturas(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", curso=" + curso +
                '}';
    }
}
