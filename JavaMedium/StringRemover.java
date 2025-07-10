package JavaMedium;

import java.util.Arrays;

public class StringRemover {
    public static String strRemover(String str, char ch)
    {
        StringBuilder result = new StringBuilder();

        for(int i =0; i< str.length(); i++ )
        {
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(ch)){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main (String [] args)
    {
        String occurence = "aAfsdhg";
        char remove1 = 'a';
        System.out.println(strRemover(occurence, remove1));
       
    }
    
}
