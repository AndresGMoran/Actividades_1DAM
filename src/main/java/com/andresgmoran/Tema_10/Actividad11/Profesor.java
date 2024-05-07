package com.andresgmoran.Tema_10.Actividad11;

public class Profesor {
    private final String dni;
    private final String nombre;
    private final double sueldo;

    public Profesor(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profesor profesor = (Profesor) o;
        return Double.compare(sueldo, profesor.sueldo) == 0 && dni.equals(profesor.dni) && nombre.equals(profesor.nombre);
    }

    @Override
    public int hashCode() {
        int result = dni.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + Double.hashCode(sueldo);
        return result;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
