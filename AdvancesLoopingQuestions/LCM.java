package AdvancesLoopingQuestions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The First Number :");
        int a = scan.nextInt();
        System.out.print("Enter The Second Number :");
        int b = scan.nextInt();

        int lcm = (a>b) ? a : b ; 

        while (true) {
            if (lcm % a == 0 && lcm % b == 0 ) {
                System.out.println("LCM of " +a +" And "+ b+" is "+  lcm) ;
                break;

            }
            lcm++;
        }
    }
}
