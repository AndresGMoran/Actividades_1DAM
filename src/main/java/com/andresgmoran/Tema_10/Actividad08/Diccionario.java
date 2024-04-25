package com.andresgmoran.Tema_10.Actividad08;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Diccionario {
    Map<String,String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    /**
     * Metodo para añadir un apalabra nueva
     * @param palabra nueva
     * @param significado de la palabra
     * @return true si se a añadido.
     */
    public boolean anyadirPalabra(String palabra, String significado){
        diccionario.put(palabra, significado);
        return true;
    }

    /**
     * Metodo para modificar palabra
     * @param palabra a modificar.
     * @param significado a modificar.
     * @throws NoSuchElementException elemento no existe.
     */
    public void modificarPalabra(String palabra, String significado) throws NoSuchElementException {
        if (diccionario.containsKey(palabra)) {
            diccionario.replace(palabra, significado);
        } else {
            throw new NoSuchElementException("No existe esa palabara");
        }
    }

    /**
     * Metodo para eliminar palabra
     * @param palabra a eliminar
     * @throws NoSuchElementException elemento no existe
     */
    public void eliminarPalabra(String palabra) throws NoSuchElementException{
        if (diccionario.containsKey(palabra)) {
            diccionario.remove(palabra);
        } else {
            throw new NoSuchElementException("No existe esa palabra");
        }
    }

    /**
     * Metodo para consultar la descripcion de una palabra
     * @param palabra a consultar
     * @return descripcion de la palabra
     * @throws NoSuchElementException elemento no existe
     */
    public String consultarPalabra(String palabra) throws NoSuchElementException{
        if (diccionario.containsKey(palabra)) {
            return diccionario.get(palabra);
        } else {
            throw new NoSuchElementException("No existe esa palabra");
        }
    }
}
