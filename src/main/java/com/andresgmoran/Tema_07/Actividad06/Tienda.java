package com.andresgmoran.Tema_07.Actividad06;

import java.util.Arrays;

public class Tienda {
    private final String nombre;
    private Bicicleta[] bicicletas;
    private int numBicicletas;

    public Tienda(String nombre, int capacidad) {
        this.nombre = nombre;
        numBicicletas = 0;
        bicicletas = new Bicicleta[capacidad];
    }
    public void imprimirBicicletas(){
        for (int i = 0; i < bicicletas.length;i++){
            System.out.println(bicicletas[i]);
        }
    }
    public Bicicleta nuevaBicicleta(Bicicleta bicicleta){
        if (buscarNumReferencia(bicicleta.getNumReferencia()) != null) {
            System.out.println("Bicicleta ya existe");
        }else {
            bicicletas[numBicicletas] = bicicleta;
            numBicicletas++;
            return bicicleta;
        }
        return null;
    }
    public void venderBicicleta(int numReferencia){
        for (int i = 0; i < numBicicletas;i++){
            if(numReferencia == bicicletas[i].getNumReferencia() && bicicletas[i].getNumReferencia() > 1) {
                System.out.println("bicicleta " + bicicletas[i].getModelo() + " se vendio correctamente");
                int nuevoStock = bicicletas[i].getStock() -1;
                bicicletas[i].setStock(nuevoStock);
            }else{
                System.out.println("Ultima bicicleta " + bicicletas[i].getModelo() + " se vendio correctamente");
                bicicletas[i] = bicicletas[i + 1];
                numBicicletas--;
            }
        }
    }
    private Bicicleta buscarNumReferencia(int referencia){
        for (int i = 0; i < numBicicletas;i++){
            if (referencia == bicicletas[i].getNumReferencia()){
                return bicicletas[i];
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(Bicicleta[] bicicletas) {
        this.bicicletas = bicicletas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tienda tienda = (Tienda) o;

        if (numBicicletas != tienda.numBicicletas) return false;
        if (!nombre.equals(tienda.nombre)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(bicicletas, tienda.bicicletas);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + Arrays.hashCode(bicicletas);
        result = 31 * result + numBicicletas;
        return result;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", bicicletas=" + Arrays.toString(bicicletas) +
                '}';
    }
}
