package com.andresgmoran.Tema_07.Actividad07Clase;


import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
   public static CentroMedico centroMedico;
   public static ConsoleMenuLib consoleMenu;
   public static ConsoleMenuLib consoleGenero;
   public static ConsoleMenuLib consoleConsultas;
    public static void main(String[] args) {
       centroMedico = new CentroMedico(500,1000);

        System.out.println(centroMedico);

        consoleMenu = new ConsoleMenuLib("URGENCIAS");
        consoleMenu.addOption(" Nuevo paciente");
        consoleMenu.addOption(" Atender paciente");
        ConsoleMenuLib consultas = consoleMenu.addOption(" Consultas");
        consoleMenu.addOption(" Alta medica");

        Paciente.Genero[] generos = Paciente.Genero.values();
        consoleGenero = new ConsoleMenuLib("Opciones");
        for (int i = 0; i < generos.length; i++) {
            consoleGenero.addOption( generos[i].toString());
        }

        consoleConsultas = new ConsoleMenuLib("Consultas");
        consoleConsultas.addOption(" Por sip");
        consoleConsultas.addOption(" Por fechas");
        consoleConsultas.addOption(" Estadisticas");
        consoleConsultas.addOption(" Mostrar historico mensual");
        consoleConsultas.addOption(" AltaMedica");


        int opcion;
        do{
            opcion = consoleMenu.showMenu();
            switch(opcion){
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    atenderPaciente();
                    break;
                case 3:
                    consultas();
                    break;
                case 4:
                   altaMedica();
                    break;
                case 5:
                    System.out.println("Xao");
                    break;
            }
        }while (opcion != 5);

    }
    public static void nuevoPaciente() {
        String sip;
        sip = IOLib.solicitarString("Sip", 4, 12);

        Paciente paciente = centroMedico.buscarPacientePorSip(sip);
        if (paciente == null) {
            System.out.printf("No existe ningun paciente con el sip %s.", sip);
            String nombre = IOLib.solicitarString("Nombre: ", 2, 30);

            int opcionGenero = consoleGenero.showMenu();
            Paciente.Genero genero = Paciente.Genero.values()[opcionGenero - 1];

            Date fechaNacimiento = IOLib.solicitarFechaDate("Fecha nacimiento [dd/MM/yyyy]: ", new SimpleDateFormat("dd/MM/yyyy"));

            paciente = centroMedico.nuevoPaciente(sip, nombre, genero, fechaNacimiento);
            if (paciente == null) {
                System.err.println("No se puede añadir el paciente");
            } else {
                System.out.println("Paciente: añadido: " + paciente);
            }
        }

        String sintomalogia = IOLib.solicitarString("Sintomalogia: ", 4, 50);
        if (centroMedico.entradaPaciente(paciente, sintomalogia)) {
            System.out.println("Entradada del paciente registrada correctamente");
        } else {
            System.err.println("No se pudo registrar la entradad del paciente");
        }
        System.out.println(centroMedico);
    }
    public static void atenderPaciente(){
        String sip = IOLib.solicitarString("Sip: ",4,12);
        Paciente paciente = centroMedico.buscarPacienteEnEspera(sip);
        if(paciente == null) {
            System.out.println("No existe ningun paciente en espera con ese sip");
            return;
        }
        System.out.println("Constantes vitales");
        double temperatura = IOLib.solicitarDouble("Temperatura: ",34,45);
        double ppm = IOLib.solicitarDouble("Pulsaciones por minuto: ",30,250);
        double tensionSistolica = IOLib.solicitarDouble("Tension sistolica: ",40,200);
        double tensionDiastolica = IOLib.solicitarDouble("Tension sistolica: ",40,200);
        if(centroMedico.atenderPaciente(sip,temperatura,ppm,tensionSistolica,tensionDiastolica)){
            System.out.println("El paciente a sido atendido correctamente");
        }else{
            System.err.println("No se pudo atender al paciente");
        }
    }
    public static void consultas(){
        int opcion = consoleConsultas.showMenu();

        switch (opcion){
            case 1:
                String sip = IOLib.solicitarString("Sip",5,12);
                System.out.println(centroMedico.buscarPacientePorSip(sip));
                break;
            case 2:
                Date fechaInical = IOLib.solicitarFechaDate("Dime la fecha de incio: ", new SimpleDateFormat("dd/MM/yyyy"));
                Date fechaFinal = IOLib.solicitarFechaDate("Dime la fecha de incio: ", new SimpleDateFormat("dd/MM/yyyy"));
                System.out.println(centroMedico.buscarPorFecha(fechaInical,fechaFinal));
            case 3:
                System.out.println(centroMedico.estadisticas());
            case 4:
                Atencion[] historialAtenciones = centroMedico.obtenerHistorial();
                System.out.println(Arrays.toString(historialAtenciones));

                historialAtenciones[0].setconstantesVitales(-1000,-1000,-1000,-1000);
                System.out.println(historialAtenciones[0]);

                historialAtenciones = centroMedico.obtenerHistorial();
                System.out.println(historialAtenciones[0]);
            case 5:
                sip = IOLib.solicitarString("Sip: ",4,12);

        }
    }
    public static void altaMedica() {
        String sip;
        int i = 1;
        boolean validado;
        int opcion;
        Atencion atencionPaciente;
        System.out.println("Sip: ");
        sip = scanner.nextLine();
        atencionPaciente = centroMedico.obtenerRegistroAtencionPaciente(sip);
        if (atencionPaciente != null) {
            do {
                System.out.println("*****************");
                System.out.println("** MOTIVO ALTA **");
                System.out.println("*****************");
                for (Atencion.MotivoAlta motivoAlta : Atencion.MotivoAlta.values()) {
                    System.out.println(i + ". " + motivoAlta);
                    i++;
                }
                System.out.print("\nElija un motivo: ");
                opcion = Integer.parseInt(scanner.nextLine());
                validado = opcion >= 1 && opcion <= Atencion.MotivoAlta.values().length;
                if (!validado) {
                    System.out.println("Elija una opción del menú");
                }
            } while (!validado);
            if (atencionPaciente.darAlta(Atencion.MotivoAlta.fromInteger(opcion-1))) {
                System.out.println("El paciente ha sido de alta correctamente");
            } else {
                System.out.println("No se ha podido dar de alta al paciente");
            }
        } else {
            System.out.println("No se ha encontrado el paciente con sip " + sip);
        }
    }


}
