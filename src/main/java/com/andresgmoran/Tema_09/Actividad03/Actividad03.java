package com.andresgmoran.Tema_09.Actividad03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad03 {
    private final Scanner lector = new Scanner(System.in);
    ArrayList<Integer> nums;
    public Actividad03(){
         nums = new ArrayList<>();
    }
    public void solicitarNums(){
        while (true){
            try{
                System.out.println("Dime un numero: ");
                nums.add(Integer.parseInt(lector.nextLine()));
            } catch (NumberFormatException nfe) {
                System.out.println("Numero invalido introducido");
                break;
            }
        }
        if (!nums.isEmpty()) {
            int mayor = nums.get(0);
            for (int i : nums){
                if (i > mayor)
                    mayor = i;
            }
            System.out.println("El numero mas grande es: " + mayor);
        } else {
            System.out.println("No se han introducido numeros");
        }
    }
}
