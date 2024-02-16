package com.andresgmoran.Tema_07.Actividad07;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Center {
    private int MAX_PACIENTS = 40;
    private String name;

    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Pacient[] pacients = new Pacient[100];
    private MedicalAttencion[] medicalAttencion = new MedicalAttencion[MAX_PACIENTS];
    private MedicalAttencion[][] history = new MedicalAttencion[31][MAX_PACIENTS];
    private int indexPacient;
    private int indexMedicalAttencion;

    public void registerPacient(Pacient p){
        pacients[indexPacient] = p;
        indexPacient++;
    }
}
