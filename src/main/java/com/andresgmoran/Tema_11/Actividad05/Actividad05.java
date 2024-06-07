package com.andresgmoran.Tema_11.Actividad05;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_11.Actividad05.objetos.*;

public class Actividad05 {
    private Inventario inventario = new Inventario();

    private Objeto madera;
    private Objeto piedra;
    private Objeto huevo;
    private Objeto perla;
    private Objeto pico;
    private Objeto espada;
    private ConsoleMenuLib menu = new ConsoleMenuLib("Inventario");
    private ConsoleMenuLib menuObjetos = new ConsoleMenuLib("Objetos");
    public Actividad05(){
        madera = new Madera("madera");
        piedra = new Piedra("piedra");
        huevo = new Huevo("huevo");
        perla = new Perla("perla");
        pico = new Pico("pico");
        espada = new Espada("espada");

        menu.addOption("Añadir al iventario");
        menu.addOption("Eliminar del inventario");
        menu.addOption("Mostrar inventario");

        menuObjetos.addOption("Madera");
        menuObjetos.addOption("Piedra");
        menuObjetos.addOption("Huevo");
        menuObjetos.addOption("Perla");
        menuObjetos.addOption("Pico");
        menuObjetos.addOption("Espada");
        menu();
    }
    private void menu(){
        int opcion = 1;
        while(opcion != 0){
            opcion = menu.showMenu();
            switch (opcion){
                case 1:
                    anyadir();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    System.out.println(inventario);
            }
        }
    }
    private Objeto menuObjetos(){
        int opcion = 1;
        while (opcion != 0){
            opcion  = menuObjetos.showMenu();
            switch (opcion){
                case 1:
                  return madera;
                  case 2:
                    return piedra;
                case 3:
                    return huevo;
                case 4:
                    return perla;
                case 5:
                    return pico;
                case 6:
                    return espada;
            }
        }
        return null;
    }
    private void anyadir(){
        Objeto objeto = menuObjetos();
        inventario.nuevoObjeto(objeto);
    }
    private void eliminar(){
        Objeto objeto = menuObjetos();
        inventario.eliminarObjeto(objeto);
    }
}
