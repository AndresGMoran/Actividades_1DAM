package com.andresgmoran.Tema_09.Actividad01;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad01 {
    private  Scanner lector;
    public ArrayList<Integer> nums;

    public Actividad01() {
        lector =  new Scanner(System.in);
        nums = new ArrayList<>();
    }

    public void solicitarNumeros(){
        int num = 0;
        while (num >= 0) {
            try {
                System.out.println("Dime numero");
                num = Integer.parseInt(lector.nextLine());
                if (num >= 0)
                    nums.add(num);
            } catch (NumberFormatException nfe) {
                System.out.println("Solo se aceptan numeros");
            }
        }
        System.out.println("Numeros: " + nums);
    }
}
