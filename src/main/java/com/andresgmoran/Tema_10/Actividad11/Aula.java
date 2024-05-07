package com.andresgmoran.Tema_10.Actividad11;

public class Aula {
    public static int idAutoIncrement = 0;
    private final int id;
    private final double metrosCuadrados;

    public Aula(double metrosCuadrados) {
        idAutoIncrement++;
        this.id = idAutoIncrement;
        this.metrosCuadrados = metrosCuadrados;
    }

    public static int getIdAutoIncrement() {
        return idAutoIncrement;
    }

    public int getId() {
        return id;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aula aula = (Aula) o;
        return id == aula.id && Double.compare(metrosCuadrados, aula.metrosCuadrados) == 0;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Double.hashCode(metrosCuadrados);
        return result;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
