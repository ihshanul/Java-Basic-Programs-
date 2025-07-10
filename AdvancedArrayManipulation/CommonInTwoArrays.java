package AdvancedArrayManipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArrays {
    public static void main(String[] args) {
        
    int[] arr1 = { 1, 3, 5, 6, 7, 8 , 17 };
    int[] arr2 = { 1, 3, 5, 8, 9, 17 };

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> common = new HashSet<>();

    for(
    int num:arr1)
    {
        set1.add(num);
    }for(
    int num:arr2)
    {
        if (set1.contains(num)) {
            common.add(num);
        }
    }
  
    System.out.println(common);

    }

}
