package com.andresgmoran.Tema_11.Actividad06;

public enum Formato {
    CD,DVD,BLU_RAY,ARCHIVO;

    @Override
    public String toString() {
        return switch (this){
            case CD -> "CD";
            case DVD -> "DVD";
            case BLU_RAY -> "BLU_RAY";
            case ARCHIVO -> "ARCHIVO";
        };
    }
}
