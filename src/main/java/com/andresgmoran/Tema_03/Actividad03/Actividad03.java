package com.andresgmoran.Tema_03.Actividad03;

import java.util.Scanner;
public class Actividad03 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime tu edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        if (edad >= 18)
            System.out.println("Mayor de edad");
        else
            System.out.println("Menor de edad");
    }
}
