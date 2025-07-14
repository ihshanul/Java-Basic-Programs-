package AdvancesLoopingQuestions;

import java.util.Scanner;

public class FibonacciSereries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enther The Limit :");
        int limit = scan.nextInt();

        int a = 0;
        int b = 1;
        int next= 0;

        while (a<=limit) {
            System.out.println(a);

            next = a+b;
            a =b;
            b=next;
    }
        
        }
    }

