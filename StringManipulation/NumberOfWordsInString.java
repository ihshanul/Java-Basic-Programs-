package StringManipulation;
import java.util.Scanner;
public class NumberOfWordsInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Strings :");
        String s = scan.nextLine();

        String [] words = s.trim().split("\\s+00");

        System.out.println("The number of Words in a string :" + words.length);
    }
}