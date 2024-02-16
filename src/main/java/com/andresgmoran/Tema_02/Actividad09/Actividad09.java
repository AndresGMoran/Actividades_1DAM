package com.andresgmoran.Tema_02.Actividad09;

public class Actividad09 {
    private enum Color{
        BLUE,RED,YELLOW
    }

    public static void main(String[] args) {
        Color color = Actividad09.Color.RED;
        System.out.println("El color es: " + color);
    }
}
