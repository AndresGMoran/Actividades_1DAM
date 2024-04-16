package com.andresgmoran.Tema_09.Actividad07;

public class Actividad07 {
    public void mostrarCadenasArray(String[] cadenas){
        for (int i = 0; i < cadenas.length;i++){
            try {
                System.out.println(cadenas[i].charAt(0));
            }catch (NullPointerException npe){
                System.out.println("Excepcion");
            }
        }
    }
}
