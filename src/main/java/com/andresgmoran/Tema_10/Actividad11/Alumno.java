package com.andresgmoran.Tema_10.Actividad11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {
    public static int idAutoIncremental = 0;
    private final int id;
    private final String nombre;
    private final String nia;
    private final Grupo grupo;
    private final List<Asignatura> asignaturas;

    public Alumno(String nombre, String nia, Grupo grupo) {
        idAutoIncremental++;
        this.id = idAutoIncremental;
        this.nombre = nombre;
        this.nia = nia;
        this.grupo = grupo;
        asignaturas = new ArrayList<>();
    }

    /**
     * Metodo para añadir asignatur.
     * @param asignaturaAAnyadir la asignatura a añadir
     * @return el alumno con la asignatura añadida.
     */
    public Alumno anyadirAsignatura(Asignatura asignaturaAAnyadir){
        if (asignaturas.isEmpty()){
            asignaturas.add(asignaturaAAnyadir);
            return this;
        }else{
            for (Asignatura asignatura : asignaturas) {
                if (asignaturaAAnyadir.getNombre().equals(asignatura.getNombre())){
                    return null;
                }else {
                    asignaturas.add(asignaturaAAnyadir);
                    return this;
                }
            }
        }
        return null;
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

    public String getNia() {
        return nia;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;
        return id == alumno.id && nombre.equals(alumno.nombre) && nia.equals(alumno.nia) && grupo.equals(alumno.grupo) && asignaturas.equals(alumno.asignaturas);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + nia.hashCode();
        result = 31 * result + grupo.hashCode();
        result = 31 * result + asignaturas.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nia='" + nia + '\'' +
                ", grupo=" + grupo +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
