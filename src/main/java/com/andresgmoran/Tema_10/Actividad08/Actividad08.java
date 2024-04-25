package com.andresgmoran.Tema_10.Actividad08;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

public class Actividad08 {
    public ConsoleMenuLib menu = new ConsoleMenuLib("Menu Principal");

    public  Diccionario diccionario = new Diccionario();
    public Actividad08() {
        menu.addOption(" Añadir palabra");
        menu.addOption(" Modificar palabra");
        menu.addOption(" Eliminar palabra");
        menu.addOption(" Consultar palabra");
        menu.addOption(" Mostrar diccionario");


        int opcion;
        do {
            opcion = menu.showMenu();
            switch (opcion){
                case 1:
                    String palabra = IOLib.solicitarString("Dime la palabra: ", 2,30);
                    String significado = IOLib.solicitarString("Dime el significado: ", 2,30);
                    diccionario.anyadirPalabra(palabra,significado);
                case 2:
                    String palabraM = IOLib.solicitarString("Dime la palabra: ", 2,30);
                    String significadoM = IOLib.solicitarString("Dime el significado: ", 2,30);
                    diccionario.modificarPalabra(palabraM,significadoM);
                case 3:
                    String palabraE = IOLib.solicitarString("Dime la palabra a eliminar: ", 2,30);
                    diccionario.eliminarPalabra(palabraE);
                case 4:
                    String palabraC = IOLib.solicitarString("Dime la palabra a consultar: ", 2,30);
                    diccionario.consultarPalabra(palabraC);
                case 5:
                    System.out.println(diccionario);

            }
        }while (opcion != 0);
    }
}
