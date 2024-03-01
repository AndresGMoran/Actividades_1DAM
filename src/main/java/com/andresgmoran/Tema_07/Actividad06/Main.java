package com.andresgmoran.Tema_07.Actividad06;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Tienda tienda = new Tienda("Ciclismo",20);
    public static ConsoleMenuLib menuPrincipal = new ConsoleMenuLib("GESTION DE BICICLETAS");

    public static void main(String[] args) {
        menuPrincipal.addOption(" Añadir bicicleta");
        menuPrincipal.addOption(" Vender bicicleta");
        menuPrincipal.addOption(" Consultar bicicleta");
        menuPrincipal.addOption(" Mostar stock");
        menuPrincipal();

    }

    private static void menuPrincipal() {
        int opcion;
        do {
            opcion = menuPrincipal.showMenu();
            switch (opcion) {
                case 1:
                    anyadirBicicleta();
                    break;
                case 2:
                    venderBicicleta();
                    break;
                case 3:
                    //consultarBicicleta();
                    break;
                case 4:
                    //mostrarStock();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (opcion != 0);
    }
    private static void anyadirBicicleta(){
        int numReferencia = IOLib.solicitarInteger("Dime el numero de referencia: ", 2,50000);
        String marca = IOLib.solicitarString("Dime la marca: ", 2,20);
        String modelo = IOLib.solicitarString("Dime el modelo: ", 2,20);
        double peso = IOLib.solicitarDouble("Dime el peso: ",1,3);
        double tamanyoRuedas = IOLib.solicitarDouble("Dime el tamaño de ruedas: ", 2,30);
        boolean motor = IOLib.solicitarBoolean("Tiene motor [Si: True, No: False]",4,4);
        Date fechaFabricacion = IOLib.solicitarFechaDate("Dime la fecha de creacion [dd/MM/yyyy]: ", new SimpleDateFormat("dd/MM/yyyy"));
        double precio = IOLib.solicitarDouble("Dime el precio: ", 1,50000);
        int stock = IOLib.solicitarInteger("Dime cuanto hay de stock: ",1,50000);

        Bicicleta bicicleta = new Bicicleta(numReferencia,marca,modelo,peso,tamanyoRuedas,motor,fechaFabricacion,precio,stock);
        System.out.println(tienda.nuevaBicicleta(bicicleta));
        System.out.println();
        tienda.imprimirBicicletas();
    }
    private static void venderBicicleta(){
        int numReferencia = IOLib.solicitarInteger("Dime el numero de referencia: ",2,50000);
        tienda.venderBicicleta(numReferencia);
    }
}
