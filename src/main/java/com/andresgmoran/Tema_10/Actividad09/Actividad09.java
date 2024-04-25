package com.andresgmoran.Tema_10.Actividad09;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

public class Actividad09 {
    private ConsoleMenuLib menu;
    private DiccionarioAc09 diccionario;
    private Juego juego;

    public Actividad09() {
        diccionario = new DiccionarioAc09();

        menu = new ConsoleMenuLib("Juego diccionario");
        menu.addOption(" Añadir palabra");
        menu.addOption(" Modificar palabra");
        menu.addOption(" Eliminar palabra");
        menu.addOption(" Consultar palabra");
        menu.addOption(" Mostrar diccionario");
        menu.addOption(" Jugar");
        menu.addOption(" Mejores puntuaciones");

        int opcion;
        do {
            opcion = menu.showMenu();
            switch (opcion){
                case 1:
                    String palabra = IOLib.solicitarString("Dime la palabra: ", 2,30);
                    String significado = IOLib.solicitarString("Dime el significado: ", 2,30);
                    diccionario.anyadirPalabra(palabra,significado);
                    break;
                case 2:
                    String palabraM = IOLib.solicitarString("Dime la palabra: ", 2,30);
                    String significadoM = IOLib.solicitarString("Dime el significado: ", 2,30);
                    diccionario.modificarPalabra(palabraM,significadoM);
                    break;
                case 3:
                    String palabraE = IOLib.solicitarString("Dime la palabra a eliminar: ", 2,30);
                    diccionario.eliminarPalabra(palabraE);
                    break;
                case 4:
                    String palabraC = IOLib.solicitarString("Dime la palabra a consultar: ", 2,30);
                    diccionario.consultarPalabra(palabraC);
                    break;
                case 5:
                    System.out.println(diccionario);
                    break;
                case 6:
                    juego = new Juego(diccionario);
                    break;
            }
        }while (opcion != 0);
    }
}
