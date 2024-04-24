package com.andresgmoran;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_10.Actividad01.Actividad01;
import com.andresgmoran.Tema_10.Actividad02.ArrayListEstadisticas;
import com.andresgmoran.Tema_10.Actividad05.CentroMedico;
import com.andresgmoran.Tema_10.Actividad05.Paciente;
import com.andresgmoran.Tema_10.Actividad06.Traductor;

import javax.swing.text.html.parser.Entity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static ConsoleMenuLib menu = new ConsoleMenuLib("Menu Principal");
    public static Traductor traductor = new Traductor();
    public static void main(String[] args) {
        menu.addOption(" Introducir parejas de palabras");
        menu.addOption(" Traducir");
        int opcion;
        do {
            opcion = menu.showMenu();
            switch (opcion) {
                case 1:
                    int numPalabras = IOLib.solicitarInteger("Dime cuantas palabras quieres añadir: ",1,10);
                    for (int i = 0; i < numPalabras;i++){
                        String palabraIngles = IOLib.solicitarString("Dime la palabra en ingles: ", 2, 30);
                        String palabraValencia = IOLib.solicitarString("Dime la palabra en valenciano: ", 2, 30);
                        traductor.nuevaPalabra(palabraIngles, palabraValencia);
                    }
                    break;
                case 2:
                    String palabraATraducir = IOLib.solicitarString("Dime la palabra que quieres traducir: ", 2, 30);
                    System.out.println(traductor.traducirPalabra(palabraATraducir));
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        }while (opcion != 0);
    }
}
