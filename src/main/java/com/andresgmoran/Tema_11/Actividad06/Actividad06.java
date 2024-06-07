package com.andresgmoran.Tema_11.Actividad06;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Actividad06 {
    private VideoClub videoClub = new VideoClub();
    private ConsoleMenuLib menu = new ConsoleMenuLib("VideoClub");
    private ConsoleMenuLib menuAltas = new ConsoleMenuLib("Altas");
    private ConsoleMenuLib menuFormatoMultimedia = new ConsoleMenuLib("Formatos");

    public Actividad06() {
        menu.addOption("Altas");

        menuAltas.addOption("Alta de una nueva pelicula");
        menuAltas.addOption("Alta de un nuevo videojuego");
        menuAltas.addOption("Alta de un nuevo socio");

        menuFormatoMultimedia.addOption(Formato.CD.toString());
        menuFormatoMultimedia.addOption(Formato.DVD.toString());
        menuFormatoMultimedia.addOption(Formato.BLU_RAY.toString());
        menuFormatoMultimedia.addOption(Formato.ARCHIVO.toString());

        menuPrincipal();
    }
    private void menuPrincipal(){
        int opcion = 0;
        do {
            opcion = menu.showMenu();
            switch (opcion) {
                case 1:
                    menuAltas();
                    break;
                case 2:

            }
        }while (opcion  != 0);
    }
    private void menuAltas(){
        int opcion = menuAltas.showMenu();
        switch (opcion){
            case 1:
                addPelicula();
                break;
            case 2:
                addVideojuego();
                break;
            case 3:
                addSocio();
        }

    }
    private void addPelicula(){
        String titulo = IOLib.solicitarString("Dime el titulo de la pelicula", 3, 20);
        String autor = IOLib.solicitarString("Dime el autor de la pelicula",3,20);
        Formato formato = null;
        int opcion = menuFormatoMultimedia.showMenu();
        switch (opcion){
            case 1:
                formato = Formato.CD;
                break;
            case 2:
                formato = Formato.DVD;
                break;
            case 3:
                formato = Formato.BLU_RAY;
                break;
            case 4:
                formato = Formato.ARCHIVO;
        }
        int anyo = IOLib.solicitarInteger("Dime el año de la pelicula: ", 100, 2030);
        int duracion = IOLib.solicitarInteger("Dime la duracion en minutos: ", 1,300);
        String actorPrincipal = IOLib.solicitarString("Dime el actor principal: ", 3,20);
        String actrizPrincipal = IOLib.solicitarString("Dime la actriz principal: ", 3,20);
        System.out.println(videoClub.addPelicula(titulo,autor,formato,anyo, duracion, actorPrincipal, actrizPrincipal));
    }
    private void addVideojuego(){
        String titulo = IOLib.solicitarString("Dime el titulo de la pelicula", 3, 20);
        String autor = IOLib.solicitarString("Dime el autor de la pelicula",3,20);
        Formato formato = null;
        int opcion = menuFormatoMultimedia.showMenu();
        switch (opcion){
            case 1:
                formato = Formato.CD;
                break;
            case 2:
                formato = Formato.DVD;
                break;
            case 3:
                formato = Formato.BLU_RAY;
                break;
            case 4:
                formato = Formato.ARCHIVO;
        }
        int anyo = IOLib.solicitarInteger("Dime el año de la pelicula: ", 100, 2030);
        String plataforma = IOLib.solicitarString("Dime la plataforma en la que esta: ", 3, 20);
        System.out.println(videoClub.addVideojuego(titulo,autor,formato,anyo, plataforma));
    }
    private void addSocio(){
        String nif = IOLib.solicitarString("Dime tu nif", 8,8);
        String nombre = IOLib.solicitarString("Dime el nombre: ", 3,20);
        Date fechaNacimineto = IOLib.solicitarFechaDate("Dime la fecha de nacimiento: ", new SimpleDateFormat("dd/MM/yyyy"));
        String poblacion = IOLib.solicitarString("Dime la poblacion: ", 3,20);
        System.out.println(videoClub.addSocio(nif, nombre, fechaNacimineto, poblacion));
    }
    private void alquilerMultimedia(){

    }
}
