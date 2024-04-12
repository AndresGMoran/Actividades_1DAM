package com.andresgmoran.Tema_09.Actividad02;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad02 {
    private Scanner lector;
    private int cont;
    private ArrayList<Double> nums;
    public Actividad02() {
        lector = new Scanner(System.in);
        cont = 0;
        nums = new ArrayList<>();
    }
    public void solicitarNums(){
        double num = 0;
        for (int i = 0; i < 10; i++){
            try {
                System.out.println("Dime un numero");
                num = Double.parseDouble(lector.nextLine());
                nums.add(num);
            }catch (NumberFormatException nfe){
                System.out.println("Solo se permiten numeros");
                cont++;
            }
        }
        double mayor = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > mayor) {
                mayor = nums.get(i);
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La excepcion se produjo: " + cont);
    }
}
