package com.andresgmoran;

import com.andresgmoran.Tema_10.Actividad01.Actividad01;
import com.andresgmoran.Tema_10.Actividad02.ArrayListEstadisticas;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Casa", "Lugar donde dormir y protegerse de los zombies y esqueletos.");
        diccionario.put("Pîco", "Objeto con una vida limitada que sirve para picar minerales y piedra");
        diccionario.put("Espada", "Objeto para matar a todo lo que se mueva");

        for (Map.Entry e : diccionario.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        Set<String> claves = diccionario.keySet();
        System.out.println(claves);
    }
}