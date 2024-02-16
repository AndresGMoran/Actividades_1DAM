package com.andresmorantema_07.Actividad04;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto(){
        this(0,0);
    }
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }
    public void imprimirPunto(){
        System.out.printf("(%.1f,%.1f)",this.x,this.y);
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
}
