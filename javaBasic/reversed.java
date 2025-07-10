package javaBasic;
import java.util.Scanner;
public class reversed {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:");
        String input = scan.nextLine();
        String reversing = new StringBuilder(input).reverse().toString();
        System.err.println("Reversed String is "+reversing);

    }
}
