package com.andresgmoran.Tema_07.Actividad07Practica;

import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static CentroMedico centroMedico = new CentroMedico();
    public static ConsoleMenuLib menuPrincipal = new ConsoleMenuLib(" URGENCIAS ");

    public static void main(String[] args) {
        menuPrincipal.addOption(" Nuevo paciente");
        menuPrincipal.addOption(" Atender paciente");
        menuPrincipal.addOption(" Consultas");
        menuPrincipal.addOption(" Alta medica");
        menuPrincipal();
        System.out.println(centroMedico);
    }
    private static void menuPrincipal(){
        int opcion;
        do {
            opcion = menuPrincipal.showMenu();
            switch (opcion){
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
                case 0:
                    System.exit(0);
            }
        }while (opcion != 0);
    }
    private static void nuevoPaciente(){
        String sip = IOLib.solicitarString("Dime el sip: ", 2,12);
        String nombre = IOLib.solicitarString("Dime el nombre completo: ",2,25);
        System.out.println("""
                1. Hombre
                2. Mujer
                3. Otro""");
        int sexo = IOLib.solicitarInteger("Elige una opcion: " , 1,1);
        Paciente.Sexo sexoSeleccionado = Paciente.Sexo.values()[sexo];
        Date fechaNacmiento = IOLib.solicitarFechaDate("Dime la fecha de nacimiento:", new SimpleDateFormat("dd/MM/yyyy"));
        Date horaDeEntrada = new Date();
        String sintomologia = IOLib.solicitarString("Dime la sintomologia: ", 2,20);

        Paciente paciente = new Paciente(sip,nombre,sexoSeleccionado,fechaNacmiento,horaDeEntrada,sintomologia, new Atencion());
        centroMedico.nuevoPaciente(paciente);
    }
    private static void atenderPaciente(){
        System.out.println("atender");
    }
    private static void consultas(){
        System.out.println("consultas");
    }
    private static void altaMedica(){
        System.out.println("alta");
    }
}
