package com.andresgmoran.Tema_11.Actividad03;

import com.andresgmoran.Lib.IOLib;

public class Actividad03 {
    private Coche coche;
    public Actividad03() {
        int tipoCoche = IOLib.solicitarInteger("Dime el tipo de coche: [1. Manual  2. Automatico]",1,2);
        String matricula = IOLib.solicitarString("Dime la matricula: ",8,8);
        int numMarchas = IOLib.solicitarInteger("Cunatas marchas tiene: ",5,6);
        if (tipoCoche == 1){
            coche = new CocheCambioManual(matricula, numMarchas);
            coche.acelerar(60);
            coche.cambiarMarcha(3);
        } else {
            coche = new CocheCambioAutomatico(matricula, numMarchas);
            coche.acelerar(60);
        }
        System.out.println(coche);
    }
}
