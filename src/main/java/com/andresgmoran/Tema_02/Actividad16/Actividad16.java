package com.andresgmoran.Tema_02.Actividad16;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cantidad de euros: ");
        double euros = Double.parseDouble(scanner.nextLine());

        double dolares = euros * 1.08;
        double libras = euros * 0.85;

        System.out.println("Dolares: " + dolares);
        System.out.println("Libras: " + libras);
    }
}
