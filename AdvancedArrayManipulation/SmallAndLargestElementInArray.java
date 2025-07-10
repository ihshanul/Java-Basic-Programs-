package AdvancedArrayManipulation;

public class SmallAndLargestElementInArray {
    public static void findLarAndSml(int[] arr)
    {
        if (arr.length == 0) {
            System.out.println("The array is empty");
           
        }

        int min = arr[0];
        int max = arr[0];

        for(int num: arr) {
            if (num < min ) {
                min = num;
            }
            if (num >max ) {
                max = num;
            }
        }
        System.out.println("The smallest element of the Array is :" + min);
        System.out.println("The Biggest element of the Array is :" + max);
    }
    public static void main (String [] args)
    {
        int [] arr1 = {1,2,3,4,5,6};
        findLarAndSml(arr1);
    }
}
