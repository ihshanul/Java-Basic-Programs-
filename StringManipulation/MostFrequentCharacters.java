package StringManipulation;

import java.io.FilterWriter;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacters {
    public static void main(String [] args)
    {
        String value = "www.ihshan.com";

        Map<Character, Integer> freMap = new HashMap<>();

        for (char c : value.toCharArray()) {
            freMap.put(c, freMap.getOrDefault(c, 0)+1 );
            
        }
        char mostFreqCharacter =' ';
        int max = 0;
        for(Map.Entry<Character, Integer> entry : freMap.entrySet()){
            if (entry.getValue()> max) {
                mostFreqCharacter = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println("The Most Frequent Character is :" + mostFreqCharacter);
        System.out.println("The number of Times Repeated is :" + max);

    }
}
