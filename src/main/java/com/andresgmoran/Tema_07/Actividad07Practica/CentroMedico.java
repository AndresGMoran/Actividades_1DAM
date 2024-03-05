package com.andresgmoran.Tema_07.Actividad07Practica;
import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import net.datafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class CentroMedico {
    private final int NUM_MAX_PACIENTES = 80;
    private final int NUM_MAX_ATENCIONES = 40;
    private Paciente[] pacientes;
    private int numPacientes;
    private Atencion[] atenciones;
    private int numAtenciones;

    public CentroMedico() {
        pacientes = new Paciente[NUM_MAX_PACIENTES];
        numPacientes = 0;
        atenciones = new Atencion[NUM_MAX_ATENCIONES];
        numAtenciones = 0;
        if (Config.DEBUG)
            datosAleatorios();
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    private void datosAleatorios(){
        Faker faker = new Faker();
        Random rnd = new Random();
        String sip;
        String nombre;
        int sexo;
        Paciente.Sexo sexoSeleccionado;
        Date fechaNacmiento;
        Date horaDeEntrada;
        String sintomologia;
        for (int i = 0; i < pacientes.length;i++) {
            sip = faker.sip().toString();
            nombre = faker.name().fullName();
            sexo = rnd.nextInt(Paciente.Sexo.values().length);
            sexoSeleccionado = Paciente.Sexo.values()[sexo];
            fechaNacmiento = faker.date().birthday();
            horaDeEntrada = faker.date().birthday();
            sintomologia = faker.medical().symptoms();

            pacientes[numPacientes] = new Paciente(sip,nombre,sexoSeleccionado,fechaNacmiento,horaDeEntrada,sintomologia, new Atencion());
            numPacientes++;
        }

    }
    public Paciente nuevoPaciente(Paciente paciente){
        if (buscarPorNia(paciente) == null)
            return null;

        pacientes[numPacientes] = paciente;
        numPacientes++;

        return paciente;
    }
    public Paciente atenderPaciente(Paciente paciente){
        if (comprobarPreRev(paciente) == null)
            return null;
        atenciones[numAtenciones] = new Atencion();
        return paciente;
    }
    private Paciente comprobarPreRev(Paciente paciente){
        if (paciente.getAtencion() == null){
            return paciente;
        }
        return null;
    }
    private Paciente buscarPorNia(Paciente paciente){
        for (int i = 0; i <numPacientes; i++) {
            if (paciente.getSip().equals(pacientes[i].getSip())) {
                return pacientes[i];
            }
        }
        return null;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "CentroMedico{" +
                "pacientes=" + Arrays.toString(pacientes) +
                '}';
    }
}
