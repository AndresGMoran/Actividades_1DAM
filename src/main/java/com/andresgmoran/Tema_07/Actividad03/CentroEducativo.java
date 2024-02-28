package com.andresgmoran.Tema_07.Actividad03;

import com.andresgmoran.Lib.Calculos;

import java.util.Arrays;
import java.util.Date;

public class CentroEducativo {
    private final String nombre;
    private Estudiante[] estudiantes;
    private int numEstudiantes;

    public CentroEducativo(String nombre, int capacidadCentro) {
        this.nombre = nombre;
        estudiantes = new Estudiante[capacidadCentro];
        numEstudiantes = 0;
    }
    public Estudiante nuevoEstudiante(Estudiante estudiante){
        for (int i = 0; i <= numEstudiantes;i++){
            estudiantes[numEstudiantes] = estudiante;
        }
        numEstudiantes++;
        return estudiante;
    }
    public Estudiante bajaEstudiante(Estudiante estudiante){
        for (int i = 0; i < numEstudiantes;i++){
            if (estudiante.equals(estudiantes[i])){
                estudiantes[i] = null;
                moverIzquierda(i);

                return estudiante;
            }
        }
        return null;
    }
    public Estudiante buscarNia(String nia){
        for (int i = 0; i < numEstudiantes; i++){
            if(estudiantes[i].getNia().equals(nia))
                return estudiantes[i];
        }
        return null;
    }
    public Estudiante[] buscarGrupo(int grupo) {
        Estudiante[] estudiantesPorGrupo = new Estudiante[estudiantes.length];
        int numEstudiantesPorGrupo = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getGrupo() == grupo) {
                for (int j = 0; j <= numEstudiantesPorGrupo; j++) {
                    estudiantesPorGrupo[numEstudiantesPorGrupo] = estudiantes[i];
                }
                numEstudiantesPorGrupo++;
            }
        }
        if (numEstudiantesPorGrupo != 0)
            return estudiantesPorGrupo;
        return null;
    }
    public Estudiante[] buscarPorEdad(int edad){
        Estudiante[] estudiantesPorEdad = new Estudiante[numEstudiantes];
        int numEstudiantesPorEdad = 0;
        for (int i = 0; i < numEstudiantes;i++){
            int edadEstudiante = Calculos.calcularEdad(estudiantes[i].getFechaNacimiento());
            if (edadEstudiante == edad) {
                for (int j = 0; j <= numEstudiantesPorEdad; j++){
                    estudiantesPorEdad[numEstudiantesPorEdad] = estudiantes[i];
                }
                numEstudiantesPorEdad++;
            }
        }
        if (numEstudiantesPorEdad != 0)
            return estudiantesPorEdad;
        return null;
    }
    public Estudiante[] buscarPorApellido(String apellido){
        Estudiante[] estudiantesApellido = new Estudiante[numEstudiantes];
        int numEstudiantesApellido = 0;
        for (int i = 0; i < numEstudiantes; i++){
            String primerApellido = estudiantes[i].getApellidos().trim().substring(0, estudiantes[i].getApellidos().indexOf(" "));
            if (apellido.equals(primerApellido)){
                for (int j = 0; j <= numEstudiantesApellido;j++){
                    estudiantesApellido[numEstudiantesApellido] = estudiantes[i];
                }
                numEstudiantesApellido++;
            }
        }
        if (numEstudiantesApellido != 0)
            return estudiantesApellido;
        return null;
    }

    private void moverIzquierda(int indice){
        for (int i = indice ; i < numEstudiantes;i++){
            estudiantes[i] = estudiantes[i + 1];
        }
        numEstudiantes--;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + Arrays.toString(estudiantes) +
                '}';
    }
}
