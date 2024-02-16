package com.andresgmoran.Tema_02.Actividad05;
import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el ancho del rectangulo: ");
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime el alto del rectangulo: ");
        int alto = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto*alto) + (ancho* ancho);

        System.out.printf("El area es: %d \nEl perimetro es: %d", area, perimetro);

    }
}
