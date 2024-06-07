package com.andresgmoran.Tema_11.Actividad04;

public class GestionElectrodomesticos {
    private ElectrodomesticoI[] electrodomesticos;
    public GestionElectrodomesticos() {
        this.electrodomesticos = new ElectrodomesticoI[10];
        rellenarArray();
        precioTotalElectrodomesticos();
    }
    private void rellenarArray(){
        for (int i = 0; i < electrodomesticos.length; i++) {
            electrodomesticos[i] = new Electrodonestico();
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
        for (ElectrodomesticoI electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Lavadora){
                precioTotalLavadoras += electrodomestico.precioFinal();
            }
        }
        return precioTotalLavadoras;
    }
    private double precioTelevisiones(){
        double precioTotalTelevisiones = 0;
        for (ElectrodomesticoI electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Television){
                precioTotalTelevisiones += electrodomestico.precioFinal();
            }
        }
        return precioTotalTelevisiones;
    }
}
