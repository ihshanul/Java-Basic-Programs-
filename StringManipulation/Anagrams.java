package StringManipulation;

import java.util.Arrays;

public class Anagrams {
    public static void main (String [] args)
    {
        String str1 = "low";
        String str2 = "wol";

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            System.out.println("This is Anagrams");
        }else{
            System.out.println("this is not Anagrams");
        }


        
    }
}
