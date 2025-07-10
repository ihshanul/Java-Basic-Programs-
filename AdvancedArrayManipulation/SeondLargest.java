package AdvancedArrayManipulation;
import java.util.*;
import java.util.Arrays;
import java.util.TreeSet;

public class SeondLargest {
    public static int findSecondLargestNum(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : arr) {
            set.add(num);
        }
        if (set.size()<2 ) {
            return set.size()==0 ? -1 : set.last();
        }

        set.pollFirst();
        
        return set.first();
    }
    public static void main (String [] args)
    {
        int[] arr1 ={1,2,3,4,5 };
        System.out.println("The Second Largest Number in The Array is :"+findSecondLargestNum(arr1)); 
    }

}
