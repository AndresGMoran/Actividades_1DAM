package com.andresgmoran.Tema_07.Actividad07;

import java.util.Arrays;

public class MedicalAttencion {
    private final Pacient pacient;
    private final String dateEntrance;
    private final String timeEntrance;
    private final String sintoms;
    private double[] vitalConstants;
    private double temperature;
    private double ppm;
    private double articalTensions;

    public MedicalAttencion(Pacient pacient, String dateEntrance, String timeEntrance, String sintoms) {
        this.pacient = pacient;
        this.dateEntrance = dateEntrance;
        this.timeEntrance = timeEntrance;
        this.sintoms = sintoms;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public String getDateEntrance() {
        return dateEntrance;
    }

    public String getTimeEntrance() {
        return timeEntrance;
    }

    public String getSintoms() {
        return sintoms;
    }

    public double[] getVitalConstants() {
        return vitalConstants;
    }

    public void setVitalConstants(double[] vitalConstants) {
        this.vitalConstants = vitalConstants;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPpm() {
        return ppm;
    }

    public void setPpm(double ppm) {
        this.ppm = ppm;
    }

    public double getArticalTensions() {
        return articalTensions;
    }

    public void setArticalTensions(double articalTensions) {
        this.articalTensions = articalTensions;
    }
}