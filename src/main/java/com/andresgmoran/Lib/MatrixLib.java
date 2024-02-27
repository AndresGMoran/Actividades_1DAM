package com.andresgmoran.Lib;

import java.util.Random;
import java.util.Scanner;

public class MatrixLib {
    public Scanner lector = new Scanner(System.in);
    public static Random rnd = new Random();

    /**
     * Rellenar una matriz con numeros randoms
     * @param matrix la matriz a rellenar
     * @param min numero random minimo
     * @param max numero random maximo
     * @return si el min es mayor que eo max se devuelve null si no se devuelve la matriz rellenada
     */
    public static int[][] matrixRandom(int[][] matrix, int min, int max){
        if(min > max)
            return null;
        for (int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = rnd.nextInt(max - min +1) + min;
            }
        }
        return matrix;
    }

    /**
     * Metodo para imprimir una matriz con un formato
     * @param matrix la matriz que queremos imprimir
     * @return la matriz en forma de String
     */
    public static String printMatrix(int[][] matrix){
        StringBuilder sb = new StringBuilder();
        MatrixStats matrixStats = new MatrixStats(matrix);
        int min = matrixStats.getMin();
        int max = matrixStats.getMax();
        String minStr = String.valueOf(min);
        String maxStr = String.valueOf(max);
        int columSize = Math.max(minStr.length(), maxStr.length()) + 1 ;
        String stringFormat = "%" + columSize + "d";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sb.append(String.format(stringFormat, matrix[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Metodo para comprobar que una matriz en regular
     * @param matrix la matriz que queremos comprobar
     * @return false si no es regular y true si es regular
     */
    public static boolean isRegularMatrix(int[][] matrix){
        int numColums = matrix[0].length;
        for (int  i = 1; i < matrix.length; i++){
            if(matrix[i].length != numColums)
                return false;
        }
        return true;
    }

    /**
     * Metodo para transponer una matriz
     * @param matriz
     * @return
     */
    public static int[][] transponerMatriz(int[][] matriz){
        if (!isRegularMatrix(matriz))
            return null; //Deberiamos devolver una excepción
        int[][] resultado = new int[matriz[0].length][matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                resultado[j][i] = matriz[i][j];
            }
        }
        return resultado;
    }

    /**
     * Metodo para sumar los datos de las lineas de una matriz
     * @param matrix la matriz del que queremos hacer calculos
     * @return la suma de todos los datos de la linea de la matriz
     */
    public static int suma(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                suma += matrix[i][j];
            }
        }
        return suma;
    }

    /**
     * Metodos para calcular estadisticas de una matriz(min, max, sum, media)
     */
    public static class MatrixStats{
        private int min;
        private int max;
        private long suma;
        private double mean;
        private int positiveCount;
        private int negativeCount;
        private final int[][] matrix;
        public MatrixStats(int[][] matrix){
            this.matrix = matrix;
            getClass();
        }
        private void getStats(){
            min = matrix[0][0];
            max = matrix[0][0];
            mean = 0;
            positiveCount = 0;
            negativeCount = 0;
            int elementCount = 0;
            for(int i = 0; i < matrix.length;i++){
                for(int j = 0; j < matrix[i].length;j++) {
                    int value = matrix[i][j];
                    suma += value;
                    if (value > max)
                        max = value;
                    if (value < min)
                        min = value;
                    if (value < 0)
                        negativeCount++;
                    else if (value > 0)
                        positiveCount++;
                    elementCount++;
                }
            }
            mean = (double)suma / (matrix.length * matrix[0].length);
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public long getSuma() {
            return suma;
        }

        public double getMean() {
            return mean;
        }

        public int getPositiveCount() {
            return positiveCount;
        }

        public int getNegativeCount() {
            return negativeCount;
        }

        public int[][] getMatrix() {
            return matrix;
        }
    }
}
