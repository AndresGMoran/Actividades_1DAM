package com.andresgmoran;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_10.Actividad08.Diccionario;

public class Main {
    public static ConsoleMenuLib menu = new ConsoleMenuLib("Menu Principal");

    public static Diccionario diccionario = new Diccionario();
    public static void main(String[] args) {
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
