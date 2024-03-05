package com.andresgmoran.Tema_07.Actividad07Practica;

import java.util.Arrays;
import java.util.Date;

public class Paciente {
    private final String sip;
    private final String nombre;
    public enum Sexo{
        HOMBRE,MUJER,OTRO
    };
    private final Sexo sexo;
    private final Date fechaDeNacimiento;
    private final Date horaEntrada;
    private final String Sintomologia;
    private final Atencion atencion;

    public Paciente(String sip, String nombre, Sexo sexo, Date fechaDeNacimiento, Date horaEntrada, String sintomologia, Atencion atencion) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.horaEntrada = horaEntrada;
        this.Sintomologia = sintomologia;
        this.atencion = atencion;
    }

    public String getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public String getSintomologia() {
        return Sintomologia;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", horaEntrada=" + horaEntrada +
                ", Sintomologia='" + Sintomologia + '\'' +
                ", atencion=" + atencion +
                '}';
    }
}
