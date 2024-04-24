package com.andresgmoran.Tema_10.Actividad05;

import com.andresgmoran.Lib.Calculos;
import com.andresgmoran.Lib.IOLib;
import net.datafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class CentroMedico {
    private Paciente[]  pacientes;
    private int numPacientes;
    private int[] pacientesmajorMenor;
    private int[] numPacientesPorSexo;

    public CentroMedico() {
        pacientes = new Paciente[10];
        numPacientes= 0;
        for (int i = 0; i < pacientes.length;i++){
            pacientes[i] = datosRandom();
        }
    }

    /**
     * Metodo para generar datos aleatorios.
     * @return paciente con datos aleatorios.
     */
    private Paciente datosRandom(){
        Faker faker = new Faker();
        Random rnd = new Random();
        String nombre = faker.name().fullName();
        Date fechaNacimiento = faker.date().birthday();
        int sexoEscogido = rnd.nextInt(0,2);
        Paciente.Sexo sexo = Paciente.Sexo.values()[sexoEscogido];
        double altura = faker.number().randomDouble(2,1,2);
        double peso = faker.number().randomDouble(10,50,100);
         return nuevoPacinete(nombre,fechaNacimiento,sexo,altura,peso);

    }

    /**
     * Metodo para crear un nuevo paciente.
     * @param nombre del paciente.
     * @param fechaNacimiento del paciente.
     * @param sexo del paciente.
     * @param altura del paciente.
     * @param peso del paciente.
     * @return paciente creado.
     */
    public Paciente nuevoPacinete(String nombre, Date fechaNacimiento, Paciente.Sexo sexo, double altura, double peso){
        Paciente paciente = new Paciente(nombre,fechaNacimiento,sexo,altura,peso);
        pacientes[numPacientes] = paciente;
        numPacientes++;
        return paciente;
    }

    /**
     * Metodo para sacar el paciente mas pequeño y el mas mayor.
     * @param pacientes lista de pacientes.
     * @return lista con la edad del paciente menor y mayor.
     */
    public int[] majorMenor(Paciente[] pacientes){
        pacientesmajorMenor = new int[2];
        int edadMayor = 0;
        int edadMenor = 0;
        for (int i = 0; i < pacientes.length;i++){
            edadMayor = Calculos.calcularEdad(pacientes[i].getFechaNacimiento());
            for (int j = 1; j < pacientes.length -1;j++){
                edadMenor = Calculos.calcularEdad(pacientes[j].getFechaNacimiento());
                if (edadMayor > edadMenor){
                    pacientesmajorMenor[0] = edadMenor;
                    pacientesmajorMenor[1] = edadMayor;
                }else{
                    pacientesmajorMenor[0] = edadMayor;
                    pacientesmajorMenor[1] = edadMenor;
                }
            }
        }
        return pacientesmajorMenor;
    }

    /**
     * Metodo para contar la cantidad de hombres(M) y mujeres(F)
     * @param pacientes lista de pacientes.
     * @return lista con la cantidad de hombres y mujeres.
     */
    public int[] contadorSexo(Paciente[] pacientes){
        numPacientesPorSexo = new int[2];
        int contM = 0;
        int contF = 0;
        for (int i = 0; i < pacientes.length;i++){
            if(pacientes[i].getSexo().equals(Paciente.Sexo.M)){
                contM++;
                numPacientesPorSexo[0] = contM;
            }else if (pacientes[i].getSexo().equals(Paciente.Sexo.F)){
                contF++;
                numPacientesPorSexo[1] = contF;
            }
        }
        return numPacientesPorSexo;
    }

    /**
     * Metodo para sacar tipo de peso segun IMC
     * @param paciente
     * @return el tipo de peso en String.
     */
    public String tipoIMC(Paciente paciente){
        double IMC = calcularIMC(paciente);
        if (IMC < 18.5){
            return "Peso insuficiente";
        } else if (IMC >= 18.5 && IMC <= 24.9 ) {
            return "Peso noraml";
        } else if (IMC >= 25 && IMC <= 26.9) {
            return "Sobrepeso grado |";
        } else if (IMC >= 27 && IMC <= 29.9) {
            return "Sobrepeso grado ||";
        } else if (IMC >29.9 ) {
            return "Sobrepeso grado |||";
        }
        return null;
    }

    /**
     * Metodo para calcular IMC.
     * @param paciente a calcular IMC.
     * @return resultado de la operacion.
     */
    private double calcularIMC(Paciente paciente){
        return paciente.getPeso() / (paciente.getAltura()*paciente.getAltura());
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public int[] getPacientesmajorMenor() {
        return pacientesmajorMenor;
    }

    public void setPacientesmajorMenor(int[] pacientesmajorMenor) {
        this.pacientesmajorMenor = pacientesmajorMenor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentroMedico that = (CentroMedico) o;

        if (numPacientes != that.numPacientes) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(pacientes, that.pacientes)) return false;
        return Arrays.equals(pacientesmajorMenor, that.pacientesmajorMenor);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(pacientes);
        result = 31 * result + numPacientes;
        result = 31 * result + Arrays.hashCode(pacientesmajorMenor);
        return result;
    }

    @Override
    public String toString() {
        return "CentroMedico{" +
                "pacientes=" + Arrays.toString(pacientes) +
                ", numPacientes=" + numPacientes +
                ", pacientesmajorMenor=" + Arrays.toString(pacientesmajorMenor) +
                '}';
    }
}
