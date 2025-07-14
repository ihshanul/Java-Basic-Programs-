package AdvancesLoopingQuestions;
import java.util.*;
public class PrimeNumberPrinting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit for the number");
        int limit = scan.nextInt();
        int count =0;
        int num = 2;

        while (count<limit) {
            if (isPrime(num)) {
                System.out.println(num +" ");
                count ++;
            }
            num++;
        }
    }
     static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i =2 ; i<=num/2 ; i++){
            if (num % i == 0 ) 
                return false;
        }
         return true;

    }
}
