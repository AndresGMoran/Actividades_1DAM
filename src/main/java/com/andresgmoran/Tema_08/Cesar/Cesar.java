package com.andresgmoran.Tema_08.Cesar;

import java.util.Random;

public class Cesar {
    private static final String abecedario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encriptar(String mensaje, int llave){
        StringBuilder sb = new StringBuilder(mensaje.length());
        for (int i = 0; i < mensaje.length(); i++){
            char c = mensaje.charAt(i);
            int pos = abecedario.indexOf(c);
            if (pos < 0){
                System.err.println("Error: No se ha encontrado el caracter" + c);
                return null;
            }
            int offset = Math.floorMod(pos + llave, abecedario.length());
            sb.append(abecedario.charAt(offset));

        }
        return sb.toString();
    }
    public static String desencriptar(String mensaje, int llave){
        StringBuilder sb = new StringBuilder(mensaje.length());
        for (int i = 0; i < mensaje.length(); i++){
            char c = mensaje.charAt(i);
            int pos = abecedario.indexOf(c);
            if (pos < 0){
                System.err.println("Error: No se ha encontrado el caracter" + c);
                return null;
            }
            int offset = Math.floorMod(pos - llave, abecedario.length());
            sb.append(abecedario.charAt(offset));

        }
        return sb.toString();
    }
}
