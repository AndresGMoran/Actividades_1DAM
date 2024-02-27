package com.andresgmoran.Tema_03.Actividad05;

import com.andresgmoran.Tema_03.Actividad04.Actividad04;

import java.util.Scanner;
public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una nota: ");
        double nota = Double.parseDouble(scanner.nextLine());

        if(nota >= 0 && nota < 5)
            System.out.println("Insuficiente");
        else if (nota >= 5 && nota < 6)
            System.out.println("Suficiente");
        else if (nota >= 6 && nota < 7)
            System.out.println("Bien");
        else if (nota >= 7 && nota < 9)
            System.out.println("Notable");
        else if (nota >= 9 && nota <= 10)
            System.out.println("Sobresaliente");
        else if (nota < 0 || nota > 10)
            System.err.println("ERROR");

        }
    }

