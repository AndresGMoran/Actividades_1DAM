package com.andresgmoran.Tema_02.Actividad03;

import java.util.Scanner;
public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el precio del producto [EN €UROS]: ");
        double precioIncial = Double.parseDouble(scanner.nextLine());
        System.out.println("Dime el descuento a aplicar: ");
        double descuento = Double.parseDouble(scanner.nextLine());
        double resultado = (precioIncial * descuento)/100;

        System.out.println("Resultado: " + resultado);
    }
}
