package com.andresgmoran.Tema_07.Actividad03;

import com.andresgmoran.Lib.Calculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class CentroEducativo {
    private final String nombre;
    private ArrayList<Estudiante> estudiantes;

    public CentroEducativo(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
    }

    /**
     * Metodo para añadir un nuevo estudiante al centro educativo
     *
     * @param estudiante Estudiante a añadir
     * @return Estudiante añadido
     */
    public Estudiante nuevoEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return estudiante;
    }

    /**
     * Metodo para dar de baja un estudiante del centro educativo
     *
     * @param estudiante Estudiante a dar de baja
     * @return Estudiante dado de baja
     */
    public Estudiante bajaEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNia().equals(estudiante.getNia())) {
                estudiantes.remove(i);
                return estudiante;
            }
        }
        return null;
    }

    /**
     * Metodo para buscar un estudiante por su nia
     *
     * @param nia Nia del estudiante a buscar
     * @return Estudiante encontrado
     */
    public Estudiante buscarNia(String nia) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNia().equals(nia)) {
                return estudiantes.get(i);
            }
        }
        return null;
    }

    public ArrayList<Estudiante> buscarGrupo(int grupo) {
        ArrayList<Estudiante> estudiantesGrupo = new ArrayList<>();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getGrupo() == grupo) {
                estudiantesGrupo.add(estudiantes.get(i));
            }
        }
        return estudiantesGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
