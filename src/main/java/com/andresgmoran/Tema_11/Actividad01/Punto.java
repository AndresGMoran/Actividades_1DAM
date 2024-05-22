package com.andresgmoran.Tema_11.Actividad01;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto() {
        this(0, 0);
    }

    /**
     * Metodo para calcular la distancia entre un punto y otro.
     * @param p el punto del otro extremo.
     * @return la distancia entre punto y el punto p.
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
