package com.andresgmoran.Tema_10.Actividad11;

public class Asignatura {
    public static int idAutoIncremental = 0;
    private final int id;
    private final String nombre;
    private final Profesor profesor;

    public Asignatura(String nombre, Profesor profesor) {
        idAutoIncremental++;
        this.id = idAutoIncremental;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public static int getIdAutoIncremental() {
        return idAutoIncremental;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asignatura that = (Asignatura) o;
        return id == that.id && nombre.equals(that.nombre) && profesor.equals(that.profesor);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + profesor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
