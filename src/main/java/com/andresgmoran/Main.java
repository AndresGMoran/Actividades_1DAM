package com.andresgmoran;

import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_10.Actividad01.Actividad01;
import com.andresgmoran.Tema_10.Actividad02.ArrayListEstadisticas;
import com.andresgmoran.Tema_10.Actividad05.CentroMedico;
import com.andresgmoran.Tema_10.Actividad05.Paciente;

import javax.swing.text.html.parser.Entity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static CentroMedico centroMedico = new CentroMedico();
    public static void main(String[] args) {
        // Edad mayor y menor.
        int[] edadesPacientes = centroMedico.majorMenor(centroMedico.getPacientes());
        System.out.println("Paciente MAYOR edad: " + edadesPacientes[1] + " años");
        System.out.println("Paciente MENOR edad: " + edadesPacientes[0] + " años");

        System.out.println();
        //Cantidad de hombres y mujeres.
        int[] numPacientesPorSexo = centroMedico.contadorSexo(centroMedico.getPacientes());
        System.out.println("Cantidad de pacientes por sexo: ");
        System.out.println("Hombres: " + numPacientesPorSexo[0] + "\t Mujeres: " + numPacientesPorSexo[1]);

        System.out.println();
        // Tipo de peso segun IMC.
        for (int i = 0; i < centroMedico.getPacientes().length;i++){
            System.out.println("Paciente numero " + i + ": " + centroMedico.tipoIMC(centroMedico.getPacientes()[i]));
        }
    }

    /**
     * Metodo para solicitar datos y crear el paciente.
     */
    private static void nuevoPaciente(){
        String nombre = IOLib.solicitarString("Dime el nombre del paciente: ", 2,40);
        Date fechaNacimiento = IOLib.solicitarFechaDate("Dime la fehca de nacimineto del paciente: ", new SimpleDateFormat("dd/MM/yyyy"));
        int sexoEscogido = IOLib.solicitarInteger("Dime el sexo [1. Masculino 2. Femenino",1,2);
        Paciente.Sexo sexo = Paciente.Sexo.values()[sexoEscogido];
        double altura = IOLib.solicitarDouble("Dime la altura [En metros]",1,4);
        double peso = IOLib.solicitarDouble("Dime el peso [En kg]",1,200);
        centroMedico.nuevoPacinete(nombre,fechaNacimiento,sexo,altura,peso);
    }
}