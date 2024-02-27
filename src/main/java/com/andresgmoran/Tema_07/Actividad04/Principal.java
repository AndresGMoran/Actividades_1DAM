package com.andresgmoran.Tema_07.Actividad04;

public class Principal {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,6);
        Punto p2 = new Punto(2,8);
        System.out.println("La distancia es de: " + p1.distancia(p2));

        p1.imprimirPunto();
        p2.imprimirPunto();

    }
}
