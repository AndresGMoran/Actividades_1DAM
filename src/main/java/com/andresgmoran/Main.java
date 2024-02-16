package com.andresgmoran;

import com.andresgmoran.Tema_07.AnexoPila.Pila;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //explota(5);
        Pila pila = new Pila(5);
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 60;i++){
            String dato = String.valueOf(r.nextInt(65,92));
            if (r.nextBoolean()){
                System.out.print(dato);
                pila.push(dato);
            }else{
                dato = pila.pop();
                if (dato != null)
                    sb.append(dato);
            }
        }
        System.out.println();
        System.out.println(sb.toString());
    }

   /* public static int explota(int num){
        int valor = explota(num + 1);
        return valor;
    }*/
}