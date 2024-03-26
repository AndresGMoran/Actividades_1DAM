package com.andresgmoran.Tema_08.Descifrar;

import java.util.Base64;
import java.util.Random;

public class Encriptacion {
    public static final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static final String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static String encriptar(String mensaje, long semilla){
        Random rnd = new Random(semilla);
        StringBuilder sb = new StringBuilder(mensaje.length());
        mensaje = convertirABase64(mensaje);
        for (int i = 0; i < mensaje.length() -2; i++){
            char c = mensaje.charAt(i);
            int pos = caracteres.indexOf(c);
            if (pos < 0){
                System.err.println("Error: No se ha encontrado el caracter" + c);
                return null;
            }
            int llave = rnd.nextInt(1, caracteres.length() +1);
            int offset = Math.floorMod(pos + llave, caracteres.length());
            sb.append(caracteres.charAt(offset));

        }
        return sb.toString();
    }
    public static String desencriptar(String mensaje, long semilla){
        Random rnd = new Random(semilla);
        StringBuilder sb = new StringBuilder(mensaje.length());
        for (int i = 0; i < mensaje.length() -2; i++){
            char c = mensaje.charAt(i);
            int pos = caracteres.indexOf(c);
            if (pos < 0){
                System.err.println("Error: No se ha encontrado el caracter" + c);
                return null;
            }
            int llave = rnd.nextInt(1, caracteres.length() +1);
            int offset = Math.floorMod(pos - llave, caracteres.length());
            sb.append(caracteres.charAt(offset));

        }
        return decodificarBase64(sb.toString());
    }
    private static String convertirABase64(String mensaje){
        byte[] bytesMensaje = mensaje.getBytes();
        byte[] mensajeEnBase64 = Base64.getEncoder().encode(bytesMensaje);
        return new String(mensajeEnBase64);
    }
    public static String decodificarBase64(String mensajeBase64) {
        byte[] bytesEnBase64 = mensajeBase64.getBytes();
        byte[] bytesDecodificados = Base64.getDecoder().decode(bytesEnBase64);
        return new String(bytesDecodificados);
    }
}
