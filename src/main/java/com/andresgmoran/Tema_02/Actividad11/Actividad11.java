package com.andresgmoran.Tema_02.Actividad11;

import java.util.Scanner;
public class Actividad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el minuendo: ");
        double minuendo = Double.parseDouble(scanner.nextLine());
        System.out.println("Dime el sustraendo: ");
        double sustraendo = Double.parseDouble(scanner.nextLine());

        double resultado = minuendo - sustraendo;
        System.out.println(minuendo + " - " + sustraendo + " = " + resultado);
    }
}
