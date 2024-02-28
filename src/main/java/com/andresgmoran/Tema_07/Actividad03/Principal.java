package com.andresgmoran.Tema_07.Actividad03;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static CentroEducativo centroEducativo = new CentroEducativo("IES La Mar",10);
    public static ConsoleMenuLib menu = new ConsoleMenuLib("GESTION ALUMNOS");
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        menu.addOption(" Nuevo alumno");
        menu.addOption(" Baja alumno");
        menu.addOption(" Consultas");
        menuPrincipal();
    }
    private static void menuPrincipal(){
        int opcion;
        do {
            opcion = menu.showMenu();
            switch (opcion) {
                case 1:
                    nuevoAlumno();
                    break;
                case 2:
                    bajaAlumno();
                    break;
                case 3:
                    consultas();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (opcion != 0);
    }
    private static void nuevoAlumno(){
        String nia = IOLib.solicitarString("Dime el nia: ",1,12);
        if (centroEducativo.buscarNia(nia) != null) {
            System.out.println("Estudiante ya existe");
        }else{
            String nombre = IOLib.solicitarString("Dime el nombre: ",1,12);
            String apellidos = IOLib.solicitarString("Dime los apellidos: ",2,25);
            Date fechaNacmiento = IOLib.solicitarFechaDate("Dime la fecha nacimiento [dd/MM/yyyy]: ", new SimpleDateFormat("dd/MM/yyyy"));
            int grupo = IOLib.solicitarInteger("A grupo pertenece: ",1,6);
            String numTelefono = IOLib.solicitarString("Dime el numero de contacto: ",1,12);
            Estudiante estudiante = new Estudiante(nia,nombre,apellidos,fechaNacmiento,grupo,numTelefono);
            System.out.println("Estudiante creado: " + centroEducativo.nuevoEstudiante(estudiante));
        }
    }
    private static void bajaAlumno(){
        String nia = IOLib.solicitarString("Dime el nia: ", 1,12);
        System.out.println("Alumno eliminiado: " + centroEducativo.bajaEstudiante(centroEducativo.buscarNia(nia)));
    }
    private static void consultas(){
        ConsoleMenuLib consultasMenu = new ConsoleMenuLib("CONSULTAS");
        consultasMenu.addOption(" Por grupo");
        consultasMenu.addOption(" Por edad");
        consultasMenu.addOption(" Por nia");
        consultasMenu.addOption(" Por apellidos");
        int opcion;
        do {
            opcion = consultasMenu.showMenu();
            switch (opcion){
                case 1:
                    int grupo = IOLib.solicitarInteger("Dime el grupo: ", 1,6);
                    for (int i = 0; i < centroEducativo.buscarGrupo(grupo).length;i++){
                        System.out.println(centroEducativo.buscarGrupo(grupo)[i]);
                    }
                    break;
                case 2:
                    int edad = IOLib.solicitarInteger("Dime la edad: ", 1,3);
                    for (int i = 0; i < centroEducativo.buscarPorEdad(edad).length;i++){
                        System.out.println(centroEducativo.buscarPorEdad(edad)[i]);
                    }

                    break;
                case 3:
                    String nia = IOLib.solicitarString("Dime el nia: ",1,12);
                    System.out.println(centroEducativo.buscarNia(nia));
                    break;
                case 4:
                    String apellido = IOLib.solicitarString("Dime el apellido: ",2,25);
                    for (int i = 0; i < centroEducativo.buscarPorApellido(apellido).length;i++){
                        System.out.println(centroEducativo.buscarPorApellido(apellido)[i]);
                    }
                    break;
                case 0:
                    menuPrincipal();
            }
        }while (opcion != 0);

    }
}
