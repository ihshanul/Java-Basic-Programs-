package JavaMedium;
import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(String str)
    {
        String cleaned = str.replaceAll("//s+", "").toLowerCase();

        int left = 0; 
        int right = cleaned.length()-1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left ++;
            right--;
        }

        return true;
    }
    public static void main (String [] args)
    {
        System.out.println(isPalindrome("aabbaa"));
        System.out.println(isPalindrome("adhlfhsd"));

    }
    
}
