package com.andresgmoran.Lib;

public class GenericDynamicArray<T> {
    private Object arr[];
    private int puntero = 0;

    public GenericDynamicArray(){
        this.arr = new Object[10];
        this.puntero = 0;
    }

    /**
     * Metodo para añadir un valor a nuestro array dynamico en la ultima posicion
     * @param value valor añadido
     * @return devuelve si se ha podido añadir el numero
     */
    public boolean add(T value){
        if(puntero == arr.length)
            incrementar();
        arr[puntero++] = value;
        return true;
    }

    /**
     * Metodo para añadir un valor a nuestro array dynamico en indice ingresado
     * @param index indice daonde se añadira el valor
     * @param value valor añadido
     * @return booleano que devuelve si se ha podido realizar
     */
    public boolean add(int index, T value){
        if (index < 0 || index > puntero)
            return false;

        if (puntero == arr.length)
            incrementar();


        for (int i = puntero; i >= index; i--) {
            arr[i] = arr[i -1];
        }
        arr[index] = value;
        puntero++;
        return true;
    }

    /**
     * Elimiar un valor por indice
     * @param index indice donde borraremos un valor
     * @return booleano que devuelve si se ha podido realizar
     */
    @SuppressWarnings("unchecked")
    public T remove(int index){
        if (index < 0 || index > puntero)
            return null;
        T valor = (T) arr[index];
        for (int i = index; i < puntero - 1; i++) {
            arr[i] = arr[i +1];
        }
        puntero--;
        return valor;
    }

    /**
     * Elimiar un valor por valor
     * @param value valor que se eliminara, la primera ocurrencia.
     * @return booleano que devuelve si se ha podido realizar
     */
    public T remove(T value){
        T encontrado = null;
        for (int i = 0; i <= puntero; i++) {
            if (arr[i] == value) {
                encontrado = remove(i);
                break;
            }
        }
        return encontrado;
    }

    /**
     * Obtener un valor por su posicion
     * @param index indice donde obtendremos el valor
     * @return valor del indice correspondiente
     */
    @SuppressWarnings("unchecked")
    public T get(int index){
        if (index < 0 | index > puntero)
            return null;
        return (T) arr[index];
    }

    /**
     * Cambiar un valor de una posicon especifica
     * @param index indice donde se cambiara el valor
     * @param value valor que se intercambiara
     * @return booleano que devuelve si se ha podido realizar.
     */
    public boolean set(int index, T value){
        if (index < 0 | index > puntero)
            return false;
        arr[index] = value;
        return true;
    }

    /**
     * Metodo para incrementar el array
     */
    private void incrementar(){
        Object valoresNuevos[] = new Object[(int)(10 * 1.5)];
        for (int i = 0; i <= puntero; i++) {
            valoresNuevos[i]=  arr[i];
        }
        arr = valoresNuevos;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < puntero -1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[puntero -1]);
        sb.append("]");
        return sb.toString();
    }

}
