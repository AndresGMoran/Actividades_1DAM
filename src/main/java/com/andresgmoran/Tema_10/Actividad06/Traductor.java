package com.andresgmoran.Tema_10.Actividad06;

import java.util.HashMap;
import java.util.Map;

public class Traductor {
    private final Map<String, String> palabras;

    public Traductor() {
        this.palabras = new HashMap<>();
    }
    public String nuevaPalabra(String palabraIngles, String palabraValenciano){
        palabras.put(palabraIngles, palabraValenciano);
        return palabraValenciano;
    }
    public String traducirPalabra(String palabra){
        return palabras.get(palabra);
    }
}