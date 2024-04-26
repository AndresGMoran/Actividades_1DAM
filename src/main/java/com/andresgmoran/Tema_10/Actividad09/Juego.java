package com.andresgmoran.Tema_10.Actividad09;

import com.andresgmoran.Lib.IOLib;

import java.util.*;

public class Juego {
    private final Map<String,Integer> puntuaciones;
    private final DiccionarioAc09 diccionario;
    private final Random rnd;

    public Juego(DiccionarioAc09 diccionario) {
        rnd = new Random();
        this.diccionario = diccionario;
        puntuaciones = new HashMap<>();
    }

    /**
     * Jugada del primer usuario.
     */
    public void primeraJugada(){
        int puntuacion = jugadas();
        String nombre = IOLib.solicitarString("Dime tu nombre: ", 2,30);
        puntuaciones.put(nombre,puntuacion);
    }

    /**
     * Jugada de los usuarios despues del primero.
     */
    public void siguientesjugadas(){
        int puntuacion = jugadas();
        String nombre = null;
        for (int i = 0; i < puntuaciones.size();i++){
            if (puntuacion > valores()[i]) {
                nombre = IOLib.solicitarString("Dime tu nombre: ", 2, 30);
            }else{
                nombre = null;
            }
        }
        puntuaciones.put(nombre,puntuacion);
    }

    /**
     * Metodo que se encarga del funcionamiento del juego.
     * @return la puntuacion que a conseguido el usuario durante la jugada.
     */
    public int jugadas(){
        boolean acierto = true;
        int contPuntos = 0;
        do {
            String palabra = generarRandom();
            String palabraUsuario = IOLib.solicitarString("Adivina la palabrea de esta definicion: " + diccionario.consultarPalabra(palabra), 2, 40);
            if (palabraUsuario.equals(palabra)) {
                System.out.println("Correcto");
                contPuntos++;
            } else {
                System.out.println("Perdiste");
                acierto = false;
            }
        }while (acierto);
        return contPuntos;
    }

    /**
     * Metodo que ordena los usuarios por puntuacion de mayor a menor.
     * @return la lista con los usuarios ordenados.
     */
    public HashMap<String, Integer> ordenarPorPuntuaciones() {
        // Convertir el HashMap en una lista de Map.Entry
        List<Map.Entry<String, Integer>> list = new LinkedList<>(puntuaciones.entrySet());

        // Ordenar la lista usando un comparador personalizado
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // Crear un nuevo HashMap ordenado basado en la lista ordenada
        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    /**
     * Metodo para seleccionar una palabra aleatoria del diccionario
     * @return la palabra aleatoria.
     */
    private String generarRandom(){
        int palabraRandom = rnd.nextInt(0, diccionario.palabras().length);
        return diccionario.palabras()[palabraRandom];
    }

    /**
     * Metodo para sacar todas las puntuaciones(Integer) a un array.
     * @return el array con las puntuaciones.
     */
    private int[] valores(){
        int[] valores = new int[puntuaciones.size()];
        int numValores = 0;
        for (Map.Entry<String,Integer> entrada : puntuaciones.entrySet()) {
            Integer valorPuntuacion = entrada.getValue();
            valores[numValores] = valorPuntuacion;
            numValores++;
        }
        return valores;
    }
    public String[] nombres(){
        String[] nombres = puntuaciones.keySet().toArray(new String[0]);
        return nombres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Juego juego = (Juego) o;

        if (!puntuaciones.equals(juego.puntuaciones)) return false;
        if (!diccionario.equals(juego.diccionario)) return false;
        return rnd.equals(juego.rnd);
    }

    @Override
    public int hashCode() {
        int result = puntuaciones.hashCode();
        result = 31 * result + diccionario.hashCode();
        result = 31 * result + rnd.hashCode();
        return result;
    }

    public Map<String, Integer> getPuntuaciones() {
        return puntuaciones;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "puntuaciones=" + puntuaciones +
                ", diccionario=" + diccionario +
                ", rnd=" + rnd +
                '}';
    }
}
