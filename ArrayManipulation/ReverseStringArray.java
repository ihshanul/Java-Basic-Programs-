package ArrayManipulation;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String Size :");
        int n = scan.nextInt();
        scan.nextLine();

        String[] values = new String[n];
        System.out.println("Enter the string value :");
        String[] reversed = new String[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            values[i] = scan.nextLine();
        }
        for (int i = n - 1; i >= 0; i--) {
            reversed[j] = values[i];
            j++;
        }
        System.out.println(Arrays.toString(reversed));

    }

}
