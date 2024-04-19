package com.andresgmoran.Tema_10.Actividad01;

import java.util.ArrayList;

public class Actividad01 {
    public Actividad01() {
    }
    public ArrayList<Integer> ordenParImpar(int[] array){
        ArrayList<Integer> numsOrdenados = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++){
            numsOrdenados.add(0);
        }
        int indexPares = 0;
        int indexImpares = array.length - 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                numsOrdenados.set(indexPares++, array[i]);
            } else {
                numsOrdenados.set(indexImpares--, array[i]);
            }
        }
        return numsOrdenados;
    }
}
