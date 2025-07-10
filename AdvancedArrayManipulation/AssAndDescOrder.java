package AdvancedArrayManipulation;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

import java.util.*;

public class AssAndDescOrder {
    public static void main(String[] args)
     {
        Integer[] arr = { 8, 2, 9, 3, 1, 5, 4, };
        Integer[] ascending = arr.clone();
        Arrays.sort(ascending);
        System.out.println("Ascending Order :" + Arrays.toString(ascending));

        Integer [] descending = arr.clone();
        Arrays.sort(descending,Collections.reverseOrder());
        System.out.println("Decending Order :" + Arrays.toString(descending));
    }

}
