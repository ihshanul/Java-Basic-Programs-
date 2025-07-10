package Semqestion;
import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number You want to reverse:");
        int num = scan.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num%10;
            num /= 10;
        }

        System.out.print("The Resversed Number is :" + reversed);



    }
}
