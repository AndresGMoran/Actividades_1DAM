package com.andresgmoran.Tema_09.Actividad06;

public class Actividad06 {
    public Actividad06() {
    }
    public void dividirEntreArray(int num, int[] divisores){
            for (int i = 0; i < divisores.length; i++) {
                try {
                    if(divisores[i] != 0) {
                        int resultado = num / divisores[i];
                        System.out.println(num + "/" + divisores[i] + "= " + resultado);
                    } else{
                        System.out.println("Excepcion no producida, no se acepta el 0 como divisor");
                    }
                } catch (ArithmeticException ae){
                    System.out.println("Excepecion producida, dividiendo entre 0");
            }
        }
    }
}
