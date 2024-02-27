package com.andresgmoran.Tema_02.Actividad12;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el dividendo: ");
        double dividendo = Double.parseDouble(scanner.nextLine());
        System.out.println("Dime el divisor: ");
        double divisor = Double.parseDouble(scanner.nextLine());

        double resultado = dividendo / divisor;
        System.out.println(dividendo + "/" + divisor + " = " + resultado);
    }
}
