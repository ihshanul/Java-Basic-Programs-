package AdvancesLoopingQuestions;



import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int a = scan.nextInt();
        System.out.print("Enter The Second Number : ");
        int b = scan.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is :");
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
