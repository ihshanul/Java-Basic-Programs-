package javaBasic;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String word = scan.nextLine();
        String word2 = "";
        for(int i = word.length()-1; i>=0 ; i--){
            word2 = word2 + word.charAt(i);
        }
    
        System.out.println(word2);
        if(word.equals(word2))
        {
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }

}
