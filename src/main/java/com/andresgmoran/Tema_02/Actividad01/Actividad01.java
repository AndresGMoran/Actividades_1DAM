package com.andresgmoran.Tema_02.Actividad01;

import java.util.Scanner;
public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String name = scanner.nextLine();
        System.out.println("Dime que dia naciste: ");
        int dayBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime que mes naciste: ");
        int monthBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime que año naciste: ");
        int yearBirth = Integer.parseInt(scanner.nextLine());

        System.out.println("Nombre: " + name);
        System.out.printf("Fecha nacimiento: %02d/%02d/%02d", dayBirth,monthBirth,yearBirth);


    }
}
