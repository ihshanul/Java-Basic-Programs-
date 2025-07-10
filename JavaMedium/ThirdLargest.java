package JavaMedium;
import java.util.*;

public class ThirdLargest {
    public static int ThirdLargest(int [] arr)
    {
        TreeSet <Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int num: arr)
        {
            set.add(num);
        }
        if (set.size() < 3) {
            return set.size() ==0 ? -1 : set.last();
        }

        set.pollFirst();
        set.pollFirst();

        return set.first();
    }

    public static void main (String [] args )
    {
        int [] intput1 = { 2, 42, 21, 24, 45,};

        System.out.println(ThirdLargest(intput1));
    }    
}
