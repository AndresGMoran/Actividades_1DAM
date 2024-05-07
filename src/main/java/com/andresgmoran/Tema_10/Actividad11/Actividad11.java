package com.andresgmoran.Tema_10.Actividad11;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.util.Scanner;

public class Actividad11 {
    private final ConsoleMenuLib menu = new ConsoleMenuLib("Gestion Centro");
    private final Centro centro = new Centro();

    public Actividad11() {
        menu.addOption(" Alta alumno");
        menu.addOption(" Alta asignatura");
        menu.addOption(" Alta grupo");
        menu.addOption(" Alta aula");
        menu.addOption(" Alta profesor");
        menuPrincipal();
    }

    /**
     * Menu principal del programa.
     */
    private void menuPrincipal(){
        int opcion;
        do {
            opcion = menu.showMenu();
            switch (opcion){
                case 0:
                    System.out.println("Exit...");
                    break;
                case 1:
                    Alumno alumno = nuevoAlumno();
                    if (alumno == null){
                        System.out.println("No se creo el alumno");
                    }else {
                        System.out.println(alumno);
                    }
                    break;
                case 2:
                    Asignatura asignatura = nuevaAsignatura();
                    if (asignatura == null){
                        System.out.println("No se creo la asignatura");
                    }else {
                        System.out.println(asignatura);
                    }
                    break;
                case 3:
                    Grupo grupo = nuevoGrupo();
                    if (grupo == null){
                        System.out.println("No se creo el grupo");
                    }else {
                        System.out.println(grupo);
                    }
                    break;
                case 4:
                    nuevoAula();
                    break;
                case 5:
                    nuevoProfesor();
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
            System.out.println(centro.getAlumnos());
            System.out.println(centro.getAsignaturas());
            System.out.println(centro.getGrupos());
            System.out.println(centro.getAulas());
            System.out.println(centro.getProfesores());
        }while (opcion != 0);
    }

    /**
     * Metodo para crear nuevo alumno.
     * @return el alumno creado.
     */
    private Alumno nuevoAlumno(){
        Alumno alumno;
        String nombre = IOLib.solicitarString("Dime el nombre del alumno: ", 3,30);
        String nia = IOLib.solicitarString("Dime el nia del alumno: ", 8,8);
        String nombreGrupo = IOLib.solicitarString("Dime el grupo: ",3,30);

        System.out.println(nombreGrupo);
        new Scanner(System.in).nextLine();

        if (!centro.comprobarGrupo(nombreGrupo)){
            System.out.println("Grupo no encontrado, debes crearlo");
            alumno = centro.altaAlumno(nombre,nia,nuevoGrupo());
        } else {
            alumno = centro.altaAlumno(nombre,nia,centro.getGrupoPorNombre(nombreGrupo));
        }
        ConsoleMenuLib menuAsignatura = new ConsoleMenuLib("Opciones asignaturas");
        menuAsignatura.addOption(" Asignaturas ya existente");
        menuAsignatura.addOption(" Nueva asignatura");

        int opcion;
        boolean continuar;
        do {
            opcion = menuAsignatura.showMenu();
            switch (opcion) {
                case 0:
                    menuPrincipal();
                    break;
                case 1:
                    if (centro.getAsignaturas().isEmpty()) {
                        System.out.println("No existen asignaturas");
                        break;
                    } else {
                        System.out.println(centro.getAsignaturas());
                        int idAsignatura = IOLib.solicitarInteger("Dime la asignatura que eliges: ", 1, centro.getAsignaturas().size());
                        centro.anyadirAsignaturaAAlumno(nia, centro.getAsignaura(idAsignatura));
                    }
                case 2:
                    centro.anyadirAsignaturaAAlumno(nia, nuevaAsignatura());
                default:
                    System.out.println("Opcion no disponible");
            }
            continuar = IOLib.solicitarBoolean("¿Quieres añadir otra asignatura?[s/n]","s","n");
        }while (!continuar);

        if (alumno != null){
            return alumno;
        }
        return null;
    }

    /**
     * Metodo para crear nueva asignatura.
     * @return asignatura creada.
     */
    private Asignatura nuevaAsignatura(){
        String nombre = IOLib.solicitarString("Dime el nombre del asignatura: ", 3,30);

        ConsoleMenuLib menuProfesor = new ConsoleMenuLib("Opciones profesores");
        menuProfesor.addOption(" Profesores ya existente");
        menuProfesor.addOption(" Nuevo profesor");

        int opcion = menuProfesor.showMenu();
        switch (opcion) {
            case 0:
                menuPrincipal();
                break;
            case 1:
                if (centro.getProfesores().isEmpty()){
                    System.out.println("No existen profesores");
                    break;
                }else {
                    System.out.println(centro.getProfesores());
                    String dniProfesorElegido = IOLib.solicitarString("Dime el dni: ",8,8);
                    return centro.altaAsignatura(nombre, centro.getProfesor(dniProfesorElegido));
                }
            case 2:
                return centro.altaAsignatura(nombre, nuevoProfesor());
            default:
                System.out.println("Opcion no disponible");
        }
        return null;
    }

    /**
     * Metodo para crear nuevo grupo
     * @return el grupo creado
     */
    private Grupo nuevoGrupo(){
        String nombre = IOLib.solicitarString("Dime el nombre del grupo: ", 3,30);

        ConsoleMenuLib menu = new ConsoleMenuLib("Opciones aulas");
        menu.addOption(" Aula ya existente");
        menu.addOption(" Nuevo aula");

        int opcion = menu.showMenu();
        switch (opcion) {
            case 0:
                menuPrincipal();
                break;
            case 1:
                if (centro.getAulas().isEmpty()){
                    System.out.println("No existen aulas");
                    break;
                }else {
                    System.out.println(centro.getAulas());
                    int aulaElegido = IOLib.solicitarInteger("Dime el aula que quieres: ", 1, centro.getAulas().size());
                    return centro.altaGrupo(nombre, centro.getAula(aulaElegido));
                }
            case 2:
                return centro.altaGrupo(nombre, nuevoAula());
            default:
                System.out.println("Opcion no disponible");
        }
        return null;
    }

    /**
     * Metodo para crear nuevo aula
     * @return el aula creado
     */
    private Aula nuevoAula(){
        double metrosCuadrados = IOLib.solicitarDouble("Dime los metros cuadrados del aula: ",2,30);
        return centro.altaAula(metrosCuadrados);

    }

    /**
     * Metodo para crear nuevo profesor.
     * @return el profesor creado.
     */
    private Profesor nuevoProfesor(){
        String dni = IOLib.solicitarString("Dime el dni del profesor: ",8,8);
        String nombre = IOLib.solicitarString("Dime el nombre del profesor: ",3,30);
        double sueldo = IOLib.solicitarDouble("Dime el sueldo del profesor: ",3,10000);
        return centro.altaProfesor(dni,nombre,sueldo);
    }
}
