package com.andresgmoran.Tema_09.Actividad05;

import com.andresgmoran.Lib.IOLib;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad05 {
    private final Scanner lector = new Scanner(System.in);
    private ArrayList<Alumno> alumnos;

    public Actividad05() {
        alumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        String nombre = IOLib.solicitarString("Dime el nombre: ", 3,15);
        int edad = IOLib.solicitarInteger("Dime la edad: ", 1, 100);
        double altura = IOLib.solicitarDouble("Dime la altura", 0,3);

        Alumno alumno = new Alumno(nombre,edad,altura);
        alumnos.add(alumno);
        System.out.println("Alumno nuevo creado correctamnete: " + alumno);
    }
    public void alumnoMayor(){
        Alumno alumnoMayor = alumnos.get(0);
        int edadMayor = alumnos.get(0).getEdad();
        for (int i = 1; i < alumnos.size();i++){
            if (alumnos.get(i).getEdad() > edadMayor){
                alumnoMayor = alumnos.get(i);
            }
        }
        System.out.println("El alumno mas mayor es: " + alumnoMayor);
    }
}
