package com.andresmorantema_07.Actividad05;


import com.andresmorantema_07.Actividad04.Punto;

public class Principal {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        Circunferencia circulo2 = new Circunferencia(6,14.4,5);
        Circunferencia circulo3 = new Circunferencia(3,12,23);
        Circunferencia circulo4 = new Circunferencia(new Punto(4,5),6);

        circulo.imprimirDatos();
        System.out.println("El area del circulo 1 es " + circulo.area() + " y el perimetro es " + circulo.perimetro() + "\n");
        circulo2.imprimirDatos();
        System.out.println("El area del circulo 2 es " + circulo2.area() + " y el perimetro es " + circulo2.perimetro() + "\n");
        circulo3.imprimirDatos();
        System.out.println("El area del circulo 3 es " + circulo3.area() + " y el perimetro es " + circulo3.perimetro() + "\n");
        circulo4.imprimirDatos();
        System.out.println("El area del circulo 4 es " + circulo4.area() + " y el perimetro es " + circulo4.perimetro() + "\n");
    }

}
