package com.andresgmoran.Tema_07.Actividad06;

import java.util.Arrays;

public class BikeShop {
    private final String name;
    private Bike[] bikes;
    private int capacity;
    private int positionBike;

    public BikeShop(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        bikes = new Bike[capacity];
    }
    public Bike createBike(String make, String model, double weight, double inchWheels, int engine, String dateFabrication, double price, int stock){
        Bike bike = new Bike(make, model, weight,inchWheels,engine,dateFabrication,price,stock);
            bikes[positionBike] = bike;
            positionBike++;
        return bike;
    }
    public boolean eraseBike(int referenceNumber){
        boolean statusErasement;

        for(int i = 0; i < positionBike; i++){
            if(bikes[i].getReferneceNumber() == referenceNumber){
                 bikes[i] = bikes[positionBike - 1] ;
                 bikes[positionBike -1] = null;
                 positionBike--;
                return true;
            }
        }
        return statusErasement = false;
    }

    public String getName() {
        return name;
    }

    public Bike[] getBikes() {
        return bikes;
    }

    public void setBikes(Bike[] bikes) {
        this.bikes = bikes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BikeShop bikeShop = (BikeShop) o;

        if (!name.equals(bikeShop.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(bikes, bikeShop.bikes);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(bikes);
        return result;
    }

    @Override
    public String toString() {
        return "BikeShop{" +
                "name='" + name + '\'' +
                ", bikes=" + Arrays.toString(bikes) +
                '}';
    }
}
