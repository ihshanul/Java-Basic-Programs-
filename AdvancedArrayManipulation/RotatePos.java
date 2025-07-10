package AdvancedArrayManipulation;

import java.util.Arrays;

public class RotatePos {
    public static void RotateArr(int [] arr , int k)
    {
        int n = arr.length;
        int[] result =new int[n];

        for(int i =0; i< n ; i++)
        {
            int newPos = (i+k) % n;
            result[newPos] = arr[i];
        }
        for(int i =0; i<n ; i++)
        {
            arr[i] = result[i];
        }
    }
    public static void main (String [] args)
    {
        int [] arr = {1,2,3,4,5};
        System.out.println("Before Rotation :" + Arrays.toString(arr));
        RotateArr(arr, 6);
        System.out.println("After Rotation :" + Arrays.toString(arr));
    }
    
}
