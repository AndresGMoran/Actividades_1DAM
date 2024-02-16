package com.andresmorantema_07.Actividad05;


import com.andresmorantema_07.Actividad04.Punto;

public class Circunferencia {
    private Punto centro;
    private double radio;

    public Circunferencia(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Circunferencia(double x, double y, double radio){
        this(new Punto(x,y),radio);
    }
    public Circunferencia(){
        this(new Punto(),1);
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double distancia(Punto p){
        return p.distancia(centro);
    }
    public double area(){
        return Math.PI * Math.pow(radio,2);
    }
    public double perimetro(){
        return 2 * Math.PI * this.radio;
    }
    public void imprimirDatos(){
        System.out.printf("El radio es: %.1f",radio);

        if(centro.getX() == 0 && centro.getY() == 0)
            System.out.println("Esta en el centro");
        else {
            System.out.println("Punto: ");
            centro.imprimirPunto();
        }
    }

    @Override
    public String toString() {
        return "Circunferencia{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}
