package javaBasic;
import java.util.Scanner;

public class SmallestNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // One-Dimensional Array
        System.out.println("Enter the size of the one-dimensional array:");
        int size1D = scanner.nextInt();
        int[] oneDArray = new int[size1D];

        System.out.println("Enter the elements of the one-dimensional array:");
        for (int i = 0; i < size1D; i++) {
            oneDArray[i] = scanner.nextInt();
        }

        int smallest1D = findSmallestIn1DArray(oneDArray);
        System.out.println("Smallest number in the one-dimensional array: " + smallest1D);

        // Two-Dimensional Array
        System.out.println("\nEnter the number of rows and columns for the two-dimensional array:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] twoDArray = new int[rows][cols];

        System.out.println("Enter the elements of the two-dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        int smallest2D = findSmallestIn2DArray(twoDArray);
        System.out.println("Smallest number in the two-dimensional array: " + smallest2D);
    }

    // Method to find the smallest number in a 1D array
    public static int findSmallestIn1DArray(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    // Method to find the smallest number in a 2D array
    public static int findSmallestIn2DArray(int[][] array) {
        int smallest = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num < smallest) {
                    smallest = num;
                }
            }
        }
        return smallest;
    }
}
