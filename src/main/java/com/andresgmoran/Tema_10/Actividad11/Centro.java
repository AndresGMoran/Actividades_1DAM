package com.andresgmoran.Tema_10.Actividad11;

import java.util.ArrayList;
import java.util.List;

public class Centro {
    private final List<Alumno> alumnos;
    private final List<Asignatura> asignaturas;
    private final List<Grupo> grupos;
    private final List<Aula> aulas;
    private final List<Profesor> profesores;
    public Centro() {
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        grupos = new ArrayList<>();
        aulas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    /**
     * Metodo para dar de alta un nuevo alumno
     * @param nombre del alumno
     * @param nia del alumno
     * @param grupo del alumno
     * @return true si se dio de alta correctamente o false si no.
     */
    public Alumno altaAlumno(String nombre, String nia, Grupo grupo){
        if (alumnos.isEmpty()){
            Alumno alumno  = new Alumno(nombre, nia, grupo);
            alumnos.add(alumno);
            return alumno;
        }else {
            for (Alumno alumno : alumnos) {
                if (nia.equals(alumno.getNia())){
                    return null;
                }else{
                    Alumno alumno1 = new Alumno(nombre, nia, grupo);
                    alumnos.add(alumno1);
                    return alumno1;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para añadir una asignatura al alumno
     * @param nia del alumno al que queremos añadir la asignatura
     * @param asignatura a añadir
     * @return el alumno al que se le a añadido la asignatura.
     */
    public Alumno anyadirAsignaturaAAlumno(String nia, Asignatura asignatura){
        if (alumnos.isEmpty()){
            return null;
        } else {
            for (Alumno alumno : alumnos){
                if (alumno.getNia().equals(nia)){
                    alumno.anyadirAsignatura(asignatura);
                    return alumno;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para dar de alta una nueva asignatura.
     * @param nombre de la asignatura.
     * @param profesor de la asignatura.
     * @return true si se dio de la alta correctamente y false si no.
     */
    public Asignatura altaAsignatura(String nombre, Profesor profesor){
        if (asignaturas.isEmpty()){
            Asignatura asignatura = new Asignatura(nombre, profesor);
            asignaturas.add(asignatura);
            return asignatura;
        }else{
            for (Asignatura asignatura : asignaturas) {
                if (nombre.equals(asignatura.getNombre())){
                    return null;
                }else {
                    Asignatura asignatura1 = new Asignatura(nombre,profesor);
                    asignaturas.add(asignatura1);
                    return asignatura1;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para sacar una asignatura por su id
     * @param asignaturaElegida el id de la asignatura que queremos sacar
     * @return la asignatura que hemos encontrado con el id.
     */
    public Asignatura getAsignaura(int asignaturaElegida){
        if (asignaturas.isEmpty()){
            return null;
        }else {
            for (Asignatura asignatura : asignaturas) {
                if (asignaturaElegida == asignatura.getId()) {
                    return asignatura;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para dar de alta un nuevo grupo.
     * @param nombre del grupo.
     * @param aula del grupo.
     * @return true si de dio de alta correctamente y false si no.
     */
    public Grupo altaGrupo(String nombre, Aula aula){
        if (grupos.isEmpty()){
            Grupo grupo = new Grupo(nombre,aula);
            grupos.add(grupo);
            return grupo;
        }else {
            for(Grupo grupoo : grupos){
                if (nombre.equals(grupoo.getNombre())){
                    return null;
                }else {
                    Grupo grupo = new Grupo(nombre,aula);
                    grupos.add(grupo);
                    return grupo;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para comprobar si existe el grupo o no.
     * @param nombre del grupo a buscar.
     * @return true si existe o false si no.
     */
    public boolean comprobarGrupo(String nombre){
        if (grupos.isEmpty()){
            return false;
        }
        for(Grupo grupo : grupos){
            if (nombre.equals(grupo.getNombre())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para sacar grupo por nombre.
     * @param nombre del grupo a buscar.
     * @return el grupo que a encontrado.
     */
    public Grupo getGrupoPorNombre(String nombre){
        if (grupos.isEmpty()){
            return null;
        }else {
            for (Grupo grupo : grupos) {
                if (grupo.getNombre().equals(nombre)) {
                    return grupo;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para dar de alta un nuevo aula
     * @param metrosCuadrados del aula
     * @return true si se a dado de alta correctamente.
     */
    public Aula altaAula(double metrosCuadrados){
        Aula aula = new Aula(metrosCuadrados);
        aulas.add(aula);
        return aula;
    }

    /**
     * Metodo para sacar aula por id.
     * @param aulaElegido aula a sacar.
     * @return el aula encontrado.
     */
    public Aula getAula(int aulaElegido){
        if (aulas.isEmpty()){
            return null;
        }else {
            for (Aula aula : aulas) {
                if (aulaElegido == aula.getId()) {
                    return aula;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para dar de alta un nuevo profesor.
     * @param dni del profesor.
     * @param nombre del profesor.
     * @param sueldo del profesor.
     * @return true si se dio de alta correctamente y false si no.
     */
    public Profesor altaProfesor(String dni, String nombre, double sueldo){
        if (profesores.isEmpty()){
            Profesor profesor = new Profesor(dni, nombre, sueldo);
            profesores.add(profesor);
            return profesor;
        }else {
            for (Profesor profesor : profesores){
                if (dni.equals(profesor.getDni())){
                    return null;
                } else {
                    Profesor profesor1 = new Profesor(dni,nombre,sueldo);
                    profesores.add(profesor1);
                    return profesor1;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para sacar profesor por su dni
     * @param dni del profesor que buscamos
     * @return el profesor con el dni que buscamos.
     */
    public Profesor getProfesor(String dni){
        if (profesores.isEmpty()){
            return null;
        }else {
            for (Profesor profesor : profesores) {
                if (profesor.getDni().equals(dni)) {
                    return profesor;
                }
            }
        }
        return null;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
