package com.andresgmoran.Tema_11.Actividad02;

import com.andresgmoran.Tema_11.Actividad01.Punto;

import java.util.List;

public class Poligono {
    private final List<Punto> puntos;

    public Poligono(List<Punto> puntos) {
        this.puntos = puntos;
    }

    /**
     * Metodo para desplazar el punto x e y
     * @param desplazamientoX cantidad de desplazamineto en x
     * @param desplazamientoY cantidad de desplazamiento en y
     */
    public void traslada(double desplazamientoX, double desplazamientoY) {
        for (Punto punto : puntos) {
            punto.setX(punto.getX() + desplazamientoX);
            punto.setY(punto.getY() - desplazamientoY);
        }
    }

    /**
     * Metodo para calcular los numeros de vertices
     * @return total de vertices.
     */
    public int numVertices(){
        return puntos.size();
    }

    /**
     * Metodo para calcular el perimetro.
     * @return el perimetro calculado.
     */
    public double perimetro(){
        double perimetro = 0;
        for (int i = 0; i < puntos.size(); i++){
            Punto puntoActual = puntos.get(i);
            Punto puntoSiguiente = puntos.get((i + 1) % numVertices());
            perimetro += puntoActual.distancia(puntoSiguiente);
        }
        return perimetro;
    }
    @Override
    public String toString() {
        return "Poligono{" +
                "puntos=" + puntos +
                '}';
    }
}
