package com.andresgmoran.Tema_08.Actividad06;

public class IMC {
    public enum Clasificacion {
        DELGADEZ_SEVERA, DELGADEZ_MODERADA, DELGADEZ_LEVE, NORMAL, SOBREPESO,
    }

    public IMC() {
    }
    public String comprobarPeso(double masa, double estatura){
        if (calcularPeso(masa, estatura) < 18.5) {
            if (calcularPeso(masa, estatura) < 16) {
                return Clasificacion.DELGADEZ_SEVERA.toString();
            }else if (calcularPeso(masa, estatura) >= 16 && calcularPeso(masa, estatura) <= 16.00) {
                return Clasificacion.DELGADEZ_MODERADA.toString();
            }
        }
        return "Hola";
    }
    private double calcularPeso(double masa, double estatura){
        double IMC = masa / Math.pow(estatura,2);
        return IMC;
    }
}
