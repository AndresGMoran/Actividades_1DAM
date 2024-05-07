package com.andresgmoran.Tema_10.Actividad11;

public class Grupo {
    public static int idAutoIncrement = 0;
    private final int id;
    private final String nombre;
    private final Aula aula;

    public Grupo(String nombre, Aula aula) {
        idAutoIncrement++;
        this.id = idAutoIncrement;
        this.nombre = nombre;
        this.aula = aula;
    }

    public static int getIdAutoIncrement() {
        return idAutoIncrement;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Aula getAula() {
        return aula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grupo grupo = (Grupo) o;
        return id == grupo.id && nombre.equals(grupo.nombre) && aula.equals(grupo.aula);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + aula.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aula=" + aula +
                '}';
    }
}
