package com.andresgmoran.Tema_07.AnexoPila.Actividad01;

import java.util.Arrays;

public class DynamicArray {
    private double[] arr;
    private int size;

    public DynamicArray(int capacidadInicial) {
        this.arr = new double[capacidadInicial];
        this.size = 0;
    }
    public DynamicArray() {
        this(10);
    }
    public boolean add(double valor){
        if(size >= arr.length)
            arr = resize();
        arr[size] = valor;
        size++;

        return true;
    }
    public boolean add(int index, double value){
        if (index >= size ||  index < 0)
            return false;

        if(size >= arr.length)
            arr = resize();

        moveRight(index);
        arr[index] = value;

        return true;

    }
    public double remove(int index){
        if (index >= size || index < 0)
            return Double.POSITIVE_INFINITY;
        double result = arr[index];
        moveLeft(index);
        return result;
    }
    public double removeWithValue(double value){
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                result = remove(i);
                break;
            }
        }
        return result;
    }
    public double get(int index){
        if (index >= size || index < 0)
            return Double.POSITIVE_INFINITY;
        return arr[index];
    }
    public boolean set(int index, double value){
        if (index >= size || index < 0)
            return false;
        arr[index] = value;
        return true;
    }
    private void moveRight(int index){
        for (int i = size; i > index;i--){
            arr[i] = arr[i - 1];
        }
        size++;
    }
    private void moveLeft(int index){
        for (int i = index; i < size;i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }
    private double[] resize(){
        double[] newArray = new double[size*2];
        for (int i = 0; i < size; i++){
             newArray[i] = arr[i];
        }
        return newArray;

    }
    public int size(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicArray that = (DynamicArray) o;

        if (size != that.size) return false;
        for (int i = 0; i < size; i++){
            if (arr[i] != that.arr[i])
                return false;
        }
        return true;
        //return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        double[] effectiveArray = new double[size];
        for (int i = 0; i < effectiveArray.length;i++){
            effectiveArray[i] = arr[i];
        }
        int result = Arrays.hashCode(arr);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");sb.append(Arrays.toString(arr));sb.append("}");sb.append(" Size: ");sb.append(size);
        return sb.toString();
    }
}
