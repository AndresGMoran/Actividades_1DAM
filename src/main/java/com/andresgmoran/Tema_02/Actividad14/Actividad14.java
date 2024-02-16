package com.andresgmoran.Tema_02.Actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el radio de la circunferencia: ");
        double radio = Double.parseDouble(scanner.nextLine());

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);

        System.out.println("La longitud de la circunferencia es: " + longitud + " y el area es: " + area);
    }
}
