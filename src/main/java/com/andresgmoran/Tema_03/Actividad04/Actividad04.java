package com.andresgmoran.Tema_03.Actividad04;

import java.util.Scanner;
public class Actividad04 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime un numero:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime otro numero: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 < num2)
            System.out.printf("%d,%d", num1,num2);
        else
            System.out.printf("%d,%d", num2,num1);

    }
}
