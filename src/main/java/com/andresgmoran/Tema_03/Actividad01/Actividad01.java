package com.andresgmoran.Tema_03.Actividad01;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int num = Integer.parseInt(scanner.nextLine());

        if(num%2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
