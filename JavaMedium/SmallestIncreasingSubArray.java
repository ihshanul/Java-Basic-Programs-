package JavaMedium;

import java.util.Arrays;

public class SmallestIncreasingSubArray {
    public static int[] findSmallestSub( int[] arr) {
        int max = Integer.MAX_VALUE;
        int[] result = new int[0];

        for (int i = 0; i < arr.length - 1;) {
            int start = i;
              while (i < arr.length - 1 && arr[i + 1] > arr[i]) {
            i++;
        }

        int len = i - start + 1;

        if (len >= 2 && len < max) {
            max = len;
            result = Arrays.copyOfRange(arr, start, i + 1);
        }
        if (start ==i) {
            i++;
        }
        }
        return result;
      
    }

    public static void main(String[] args) {
        int [] arr1 = { 1, 5, 3, 7};
        int [] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};
        findSmallestSub(arr2);
        System.out.println(Arrays.toString(findSmallestSub(arr2)));
        System.out.println(Arrays.toString(findSmallestSub(arr1)));
    }
}
