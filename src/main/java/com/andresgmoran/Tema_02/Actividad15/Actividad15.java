package com.andresgmoran.Tema_02.Actividad15;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cantidad de grados centigrados: ");
        double temperaturaGC = Double.parseDouble(scanner.nextLine());

        double temperaturaGK = 273.15 + temperaturaGC;
        double temperaturaGF = temperaturaGC * (9/5) + 32;

        System.out.println("Grados Kelvin: 273.15 + " + temperaturaGC + " = " + temperaturaGK );
        System.out.println("Grados Fahrenheit: " + temperaturaGC + " * (9/5) + 32 = " + temperaturaGF);
    }
}
