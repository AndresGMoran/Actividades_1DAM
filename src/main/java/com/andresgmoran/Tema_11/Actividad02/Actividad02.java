package com.andresgmoran.Tema_11.Actividad02;

import com.andresgmoran.Tema_11.Actividad01.Punto;

import java.util.ArrayList;
import java.util.List;

public class Actividad02 {
    public Actividad02() {
        List<Punto> puntos = new ArrayList<Punto>();
        puntos.add(new Punto(0,0));puntos.add(new Punto(2,0));puntos.add(new Punto(2,2));puntos.add(new Punto(0,2));
        Poligono poligono = new Poligono(puntos);
        System.out.println(poligono);
        System.out.println(poligono.perimetro());
        poligono.traslada(4,3);
        System.out.println(poligono);
    }
}
