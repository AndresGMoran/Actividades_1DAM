package com.andresgmoran.Tema_10.Actividad05;

import java.util.Date;

public class Paciente {
    private int id;
    private static int autoId = 0;
    private String nombre;
    private Date fechaNacimiento;
    public enum Sexo{
        M,F
    };
    private Sexo sexo;
    private double altura;
    private double peso;

    public Paciente(String nombre, Date fechaNacimiento, Sexo sexo, double altura, double peso) {
        this.id = autoId++;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        if (id != paciente.id) return false;
        if (Double.compare(altura, paciente.altura) != 0) return false;
        if (Double.compare(peso, paciente.peso) != 0) return false;
        if (!nombre.equals(paciente.nombre)) return false;
        if (!fechaNacimiento.equals(paciente.fechaNacimiento)) return false;
        return sexo == paciente.sexo;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + fechaNacimiento.hashCode();
        result = 31 * result + sexo.hashCode();
        temp = Double.doubleToLongBits(altura);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
