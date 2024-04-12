package com.andresgmoran.Tema_09.Actividad05;

public class Alumno {
    private final String nombre;
    private final int edad;
    private final double altura;

    public Alumno(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
