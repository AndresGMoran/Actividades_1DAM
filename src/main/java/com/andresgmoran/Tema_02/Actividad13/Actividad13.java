package com.andresgmoran.Tema_02.Actividad13;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cantidad de segundos: ");
        double segundos = Double.parseDouble(scanner.nextLine());

        double minutos = segundos * 60;
        double horas = minutos * 60;
        double dias = horas * 24;
        System.out.println(segundos + " segundos son: " + minutos + " minutos, " + horas + " horas y " + dias + " dias");
    }
}
