package com.andresgmoran.Tema_10.Actividad07;

import java.util.HashMap;
import java.util.Map;

public class Cambio {
    private final Map<String,Double> dinero;

    public Cambio() {
        dinero = new HashMap<>();
        dinero.put("USD", 1.0); // Dólar estadounidense
        dinero.put("GBP", 0.72); // Libra esterlina
        dinero.put("INR", 75.25); // Rupia india
        dinero.put("AUD", 1.28); // Dólar australiano
        dinero.put("CAD", 1.23); // Dólar canadiense
        dinero.put("ARS", 97.40); // Peso argentino
        dinero.put("BOB", 7.50); // Boliviano boliviano
        dinero.put("CLP", 791.64); // Peso chileno
        dinero.put("VEZ", 13500000.0); // Bolívar venezolano
        dinero.put("CRC", 629.53); // Colón costarricense
        dinero.put("CUP", 26.5); // Peso cubano
        dinero.put("DOP", 56.65); // Peso dominicano
        dinero.put("MXN", 21.02); // Peso mexicano
    }
    public double calculo(double cantidad, String key){
        return cantidad*dinero.get(key);
    }
}
