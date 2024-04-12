package com.andresgmoran;

import com.andresgmoran.Tema_09.Actividad01.Actividad01;
import com.andresgmoran.Tema_09.Actividad02.Actividad02;
import com.andresgmoran.Tema_09.Actividad03.Actividad03;
import com.andresgmoran.Tema_09.Actividad05.Actividad05;

public class Main {
    public static void main(String[] args) {
        Actividad05 actividad05 = new Actividad05();
        actividad05.crearAlumno(); // primer alumno
        actividad05.crearAlumno(); // segundo alumno
        actividad05.alumnoMayor();
    }
}