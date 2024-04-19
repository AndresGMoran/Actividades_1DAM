package com.andresgmoran.Tema_10.Actividad02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListEstadisticas extends ArrayList<Double> implements IEstadisticas{
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListEstadisticas() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayListEstadisticas(int capacity){
        super(capacity);
    }
    public ArrayListEstadisticas(Collection<Double> collection){
        super(collection);
    }

    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < size(); i++){
            double value = get(i);
            if (value < min){
                min = value;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < size(); i++){
            double value = get(i);
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double result = 0;
        for (int i = 0; i < size(); i++){
            result += get(i);
        }
        return result;
    }

    @Override
    public double media() {
        return sumatorio()/size();
    }

    @Override
    public double moda() {
        int cont1 = 0;
        int cont2 = 0;
        double moda = 0;
        for (int i = 0; i < size(); i++){
            for (Double num : this) {
                if (get(i) == num) {
                    cont1++;
                }
            }
            if (cont1 > cont2){
                cont2 = cont1;
                moda = get(i);
            }
        }
        return moda;
    }
}
