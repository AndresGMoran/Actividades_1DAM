package com.andresgmoran;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_10.Actividad01.Actividad01;
import com.andresgmoran.Tema_10.Actividad02.ArrayListEstadisticas;
import com.andresgmoran.Tema_10.Actividad05.CentroMedico;
import com.andresgmoran.Tema_10.Actividad05.Paciente;
import com.andresgmoran.Tema_10.Actividad06.Traductor;
import com.andresgmoran.Tema_10.Actividad07.Cambio;

import javax.swing.text.html.parser.Entity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static ConsoleMenuLib menu = new ConsoleMenuLib("Menu Principal");

    public static Cambio cambio = new Cambio();
    public static void main(String[] args) {
        menu.addOption(" Hacer cambio de las siguientes monedas");
        menu.addOption(" USD (Dólar USA)");
        menu.addOption(" GBP (Libra esterlina)");
        menu.addOption(" INR (Rupia India)");
        menu.addOption(" AUD (Dólar Australiano)");
        menu.addOption(" (CAD (Dólar Canadiense)");
        menu.addOption(" (ARS (Peso Argentino)");
        menu.addOption(" BOB (Boliviano Boliviano)");
        menu.addOption(" CLP (Peso Chileno)");
        menu.addOption("  VEZ (Peso Colombiano)");
        menu.addOption(" CRC (Colón Costarricense)");
        menu.addOption("  CUP (Peso Cubano)");
        menu.addOption("  DOP (Peso Dominicano)");
        menu.addOption("  MXN (Peso Mexicano)");

        int opcion;
        do {
            opcion = menu.showMenu();
            String key = IOLib.solicitarString("Dime el tipo de moneda(USD): ",3,3);
            double cantidad = IOLib.solicitarInteger("Dime la cantidad en euros que quieres cambiar: ",1,100000000);
            System.out.println(cambio.calculo(cantidad,key));
        }while (opcion != 0);


    }
}
