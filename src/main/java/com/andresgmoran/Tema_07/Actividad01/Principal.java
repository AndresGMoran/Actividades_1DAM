package com.andresgmoran.Tema_07.Actividad01;

public class Principal {
    public static void main(String[] args){
        Coche coche1 = new Coche("Renault Clio", "Rojo", true,"4565QTFE",2005, Coche.tipo.FAMILIAR, Coche.seguro.TODO_RIESGO);
        Coche coche2 = new Coche();
        System.out.println(coche1);
        System.out.println(coche2);

    }
}
