package javaBasic;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Total number of  NUmber of values: ");
        int count = scan.nextInt();
        int sum = 0;
        int number = 0;
        float average = 0;
        for(int i = 0;i<count;i++){
            number = scan.nextInt();
            sum = sum+number;
        }
        average = sum/count;
        System.out.println("The average of " + count + " Number is " +  average);
    }
}