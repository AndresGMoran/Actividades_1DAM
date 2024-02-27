package com.andresgmoran.Tema_02.Actividad08;

import java.util.Scanner;
public class Actividad08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        int diasVida = edad * 365;
        System.out.println("Días de vida: " + diasVida);
    }
}
