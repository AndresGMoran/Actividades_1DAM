package com.andresgmoran.Tema_11.Actividad04;

import java.util.Random;

public class GestionElectrodomesticos {
    private Electrodomestico[] electrodomesticos;
    public GestionElectrodomesticos() {
        this.electrodomesticos = new Electrodomestico[10];
        rellenarArray();
        precioTotalElectrodomesticos();
    }
    private void rellenarArray(){
        Random rnd = new Random();
        int tipo = 0;
        for (int i = 0; i < electrodomesticos.length; i++) {
            tipo = rnd.nextInt(2);
            switch (tipo){
                case 0:
                    electrodomesticos[i] = new Television();
                    break;
                case 1:
                    electrodomesticos[i] = new Lavadora();
                    break;
            }
        }
    }
    private void precioTotalElectrodomesticos(){
        double precioTotalElectrodomesticos = precioLavadoras() + precioTelevisiones();
        System.out.println("Precio total de lavadoras: " + precioLavadoras());
        System.out.println("Precio total de televisiones: " + precioTelevisiones());
        System.out.println("Precio total de electrodomesticos: " + precioTotalElectrodomesticos);
    }
    private double precioLavadoras(){
        double precioTotalLavadoras = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Lavadora){
                precioTotalLavadoras += electrodomestico.precioFinal();
            }
        }
        return precioTotalLavadoras;
    }
    private double precioTelevisiones(){
        double precioTotalTelevisiones = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Television){
                precioTotalTelevisiones += electrodomestico.precioFinal();
            }
        }
        return precioTotalTelevisiones;
    }
}
