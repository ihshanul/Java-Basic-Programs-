package Semqestion;

import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Names You Want to Enter : ");
        int n = scan.nextInt();
        scan.nextLine();

        String [] names = new String[n];

        System.out.println("Enter " + n + " names: ");
        for( int i = 0 ; i< n ; i++){
            System.out.println("Enter the Name# "+ (i + 1) + " :");
            names[i] = scan.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Sorted names are");
        for (String name : names){
            System.out.println(name);
        }

       scan.close();


    }
}
