package AdvancedArrayManipulation;

import javaBasic.palindrome;

public class MatricMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, },
                { 3, 4 }
        };
        int[][] matrix2 = {
                { 5, 6, },
                { 7, 8 }
        };
        int rows = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows][cols2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for(int [] row : result){
            for ( int value  : row) {
                System.out.print(value +" ");
            }
            System.out.println();
        }
    }
}
