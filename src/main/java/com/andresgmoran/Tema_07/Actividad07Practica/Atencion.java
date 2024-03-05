package com.andresgmoran.Tema_07.Actividad07Practica;

import java.util.Arrays;

public class Atencion {
    private final int POSICION_TEMPERATURA = 0;
    private final int POSICION_PPM = 1;
    private final int POSICION_TENSION_SISTOLICA= 2;
    private final int POSICION_TENSION_DIASTOLICA = 3;
    private int[] preRev;
    private int temperatura;
    private int ppm;
    private int tensionSistolica;
    private int tensionDiastolica;

    public Atencion() {
        preRev = new int[4];
        preRev[POSICION_TEMPERATURA] = temperatura;
        preRev[POSICION_PPM] = ppm;
        preRev[POSICION_TENSION_SISTOLICA] = tensionSistolica;
        preRev[POSICION_TENSION_DIASTOLICA] = tensionDiastolica;
    }

    public int[] getPreRev() {
        return preRev;
    }

    public void setPreRev(int[] preRev) {
        this.preRev = preRev;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getTensionSistolica() {
        return tensionSistolica;
    }

    public void setTensionSistolica(int tensionSistolica) {
        this.tensionSistolica = tensionSistolica;
    }

    public int getTensionDiastolica() {
        return tensionDiastolica;
    }

    public void setTensionDiastolica(int tensionDiastolica) {
        this.tensionDiastolica = tensionDiastolica;
    }

    @Override
    public String toString() {
        return "Atencion{" +
                "preRev=" + Arrays.toString(preRev) +
                ", temperatura=" + temperatura +
                ", ppm=" + ppm +
                ", tensionSistolica=" + tensionSistolica +
                ", tensionDiastolica=" + tensionDiastolica +
                '}';
    }
}
