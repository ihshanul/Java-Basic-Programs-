package AdvancesLoopingQuestions;

import java.util.Scanner;

public class FindingPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to Check If It is Prime Number :");
        int num =scan.nextInt();
        boolean isPrime = isPrime(num, 2);
        if (isPrime && num>1) {
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num +" is Not a Prime Number");
        }
    }

    static boolean isPrime(int num , int divisor){
        if (divisor >Math.sqrt(num)) {
            return true;
        }
        if (num % divisor ==0) {
            return false;
        }
        return  isPrime(num, divisor+1);
    }
}
