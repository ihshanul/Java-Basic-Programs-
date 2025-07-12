package StringManipulation;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main (String [] args)
    {
        String input =" ihshanul Halq ";
        Character result = FindFirstNonRepeatedChar(input);
        if (result != null) {
            System.out.println("First non Repeated Character is :" + result);
        }else{
            System.out.println("No Character Found");
        }
    }

    private static Character FindFirstNonRepeatedChar(String str) {
            Map<Character , Integer> map = new LinkedHashMap<>();

            for(char c : str.toCharArray())
            {
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            for(Map.Entry<Character , Integer> entry : map.entrySet())
            {
                if (entry.getValue()==1) {
                    return entry.getKey();
                    
                }
            }
            return null;
    }
}
