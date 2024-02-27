package com.andresgmoran.Tema_03.Actividad07;

import java.util.Scanner;
public class Actividad07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double CUOTA_BASE = 500;
        int edad;
        System.out.println("Dime la edad: ");
        edad = Integer.parseInt(lector.nextLine());

        boolean socios;
        double precioFinal;
        double descuento;
        if (edad > 65) {
            descuento = (CUOTA_BASE * 50) / 100;
            precioFinal = CUOTA_BASE - descuento;
            System.out.println(precioFinal);
        }else if (edad < 18){
            System.out.println("Sus padres son socios: ");
            socios = Boolean.parseBoolean(lector.nextLine());
            if (socios) {
                descuento = (CUOTA_BASE * 35) / 100;
                precioFinal = CUOTA_BASE - descuento;
                System.out.println(precioFinal);
            }else if (!socios) {
                descuento = (CUOTA_BASE * 25) / 100;
                precioFinal = CUOTA_BASE - descuento;
                System.out.println(precioFinal);
            }
        }
    }
}
