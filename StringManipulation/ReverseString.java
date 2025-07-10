package StringManipulation;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter the String :");
    String org = scan.nextLine();

    String reverse ="";
    for(int i = org.length()-1 ; i>=0 ; i--)
    {
        reverse += org.charAt(i);
    }
    System.out.println("Reversed String :" + reverse);
    }
    
    
}

