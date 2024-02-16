package com.andresgmoran.Tema_03.Actividad02;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime otro numero: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if(num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
        else if(num1 < num2)
            System.out.println(num1 + " es menor que " + num2);
        else
            System.out.println("Los numeros son iguales");
    }
}
