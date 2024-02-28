package com.andresgmoran.Tema_07.Actividad06;

public class Bike {
    public static int autoIncrement;
    private final int refereneceNumber;
    private final String marca;
    private final String model;
    private final double weight;
    private final double inchWheels;
    private final int engine;
    private final String dateFabrication;
    private final double price;
    private final int stock;

    public Bike(String marca, String model, double weight, double inchWheels, int engine, String dateFabrication, double price, int stock) {
        this.refereneceNumber = autoIncrement++;
        this.marca = marca;
        this.model = model;
        this.weight = weight;
        this.inchWheels = inchWheels;
        this.engine = engine;
        this.dateFabrication = dateFabrication;
        this.price = price;
        this.stock = stock;
    }
    public int getReferneceNumber() {
        return refereneceNumber;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public double getInchWheels() {
        return inchWheels;
    }

    public int isEngine() {
        return engine;
    }

    public String getDateFabrication() {
        return dateFabrication;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (refereneceNumber != bike.refereneceNumber) return false;
        if (Double.compare(weight, bike.weight) != 0) return false;
        if (Double.compare(inchWheels, bike.inchWheels) != 0) return false;
        if (engine != bike.engine) return false;
        if (Double.compare(price, bike.price) != 0) return false;
        if (stock != bike.stock) return false;
        if (!marca.equals(bike.marca)) return false;
        if (!model.equals(bike.model)) return false;
        return dateFabrication.equals(bike.dateFabrication);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = refereneceNumber;
        result = 31 * result + marca.hashCode();
        result = 31 * result + model.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(inchWheels);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + engine;
        result = 31 * result + dateFabrication.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stock;
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "refereneceNumber=" + refereneceNumber +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", inchWheels=" + inchWheels +
                ", engine=" + engine +
                ", dateFabrication='" + dateFabrication + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
