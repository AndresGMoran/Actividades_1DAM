package com.andresgmoran.Tema_07.Actividad01;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Coche coche = new Coche("Peugoet","Rojo",true,"56789WUDF",new Date(2012,9,9), Coche.Seguro.TERCEROS, Coche.TipoCoche.FAMILIAR );
        System.out.println(coche);
    }
}
