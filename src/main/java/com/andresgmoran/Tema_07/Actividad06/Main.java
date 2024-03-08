package com.andresgmoran.Tema_07.Actividad06;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.awt.desktop.AboutEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Tienda tienda = new Tienda();
    public static ConsoleMenuLib menuPrincipal = new ConsoleMenuLib("Gestion Bicicletas");
    public static ConsoleMenuLib menuConsultas = new ConsoleMenuLib("Consultas");

    public static void main(String[] args) {
        boolean salir = false;
        menuPrincipal.addOption("Nueva bicicleta");
        menuPrincipal.addOption("Vender bicicleta");
        menuPrincipal.addOption("Consultas");
        menuPrincipal.addOption("Ver stock");
        do{
            int valor = menuPrincipal.showMenu();
            switch (valor) {
                case 1:
                    comprarBici();
                    break;
                case 2:
                    venderBici();
                    break;
                case 3:
                    consultaBici();
                    break;
                case 4:
                    mostarStock();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Fuera de rango");
                    break;
            }
        }while(!salir);
    }

    /**Metodo para mostrar subMenu de consutla */
    private static void consultaBici(){
        boolean salir = false;
        menuConsultas.addOption("Por referencia");
        menuConsultas.addOption("Por marca");
        menuConsultas.addOption("Por modelo");

        do{
            int valor = menuConsultas.showMenu();
            switch (valor) {
                case 1:
                    consRef();
                    break;
                case 2:
                    consMarc();
                    break;
                case 3:
                    consMod();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Fuera de rango");
                    break;
            }

        }while(!salir);
    }

    /**Buscar una bici por Referencia */
    private static void consRef(){
        String referencia = String.valueOf(IOLib.solicitarString("INgresa la referencia",1,300));
        Bicicleta biciCopia = tienda.obtenerBicisRef(referencia);
        if (biciCopia == null)
            System.out.println("No existe esa bici");
        else
            System.out.println(biciCopia.toString());

    }

    /**Buscar una bici por Marca */
    private static void consMarc(){
        String marca = IOLib.solicitarString("Ingresa la marca de la bici",1,20);
        Bicicleta[] bicidMar = tienda.obtenerBicisMarca(marca);
        if (bicidMar == null)
            System.out.println("No se ha encontrado");
        else{
            for (Bicicleta bicicleta : bicidMar) {
                System.out.println(bicicleta.toString());
            }
        }
    }
    /**Buscar una bici por Modelo */
    private static void consMod(){
        String modelo = IOLib.solicitarString("Ingresa el modelo de la bici",1,20);
        Bicicleta[] bicidMod = tienda.obtenerBicisModelo(modelo);
        if (bicidMod == null)
            System.out.println("No se ha encontrado");
        else{
            for (Bicicleta bicicleta : bicidMod) {
                System.out.println(bicicleta.toString());
            }
        }
    }

    /*** Metodo para comprarBicis */
    private static void comprarBici(){
        String marca =IOLib.solicitarString("Ingrese el numero de la marca",1,20);
        String modelo = IOLib.solicitarString("Pedir modelo de la marca",1,20);
        double peso = IOLib.solicitarDouble("Ingresa el peso de la bici",1,500);
        double tamanyoRuedas = IOLib.solicitarDouble("Ingresa el tamaño de la rueda",1,30);
        boolean motor = IOLib.solicitarBoolean("La bici tine motor?",4,5);
        String fehca = IOLib.solicitarString("Ingrese la fecha de la fabricacion",1,20);

        tienda.comprarBici(marca, modelo, peso, tamanyoRuedas, motor, fehca);
    }

    /** Metodo para vender las bicis */
    private static void venderBici(){
        String referencai = String.valueOf(IOLib.solicitarString("Ingrese el numero de referencia",1,200));
        int result = tienda.venderBici(referencai);
        if (result > -1)
            System.out.println("Bici " + referencai + "ha sido vendida");
        else if(result == -1)
            System.out.println("No hay Stock");
        else
            System.out.println("La referencia " + referencai + " no existe");

    }


    /** Metodo para mostar el stock de las bicis. */
    private static void mostarStock(){
        Bicicleta[] sotck = tienda.obtenerStock();
        if (sotck == null) {
            System.out.println("No hay stock");
        }
        else{
            for (Bicicleta bicicleta : sotck) {
                System.out.println(bicicleta.toString());
            }
        }
    }
}
