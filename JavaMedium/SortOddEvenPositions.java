package JavaMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortOddEvenPositions {
    static void sortOddEvenPostitions(int [] arr)
    {
        List<Integer> oddPos = new ArrayList<>();
        List<Integer> evenPos = new ArrayList<>();

        for(int i = 0 ; i< arr.length ; i++)
        {
            if(i%2 == 0) oddPos.add(arr[i]);
            else evenPos.add(arr[i]);
        }

        Collections.sort(oddPos , Collections.reverseOrder());
        Collections.sort(evenPos);
        
        int oddindex = 0 , evenindex = 0;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(i%2 ==0) arr[i]=oddPos.get(oddindex++);
            else arr[i] = evenPos.get(evenindex++);
        }
    }

    public static void main (String [] args)
    {
        int [] arr1 = {3, 2, 4, 5, 7, 8, 10, 9};
        sortOddEvenPostitions(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    
}
