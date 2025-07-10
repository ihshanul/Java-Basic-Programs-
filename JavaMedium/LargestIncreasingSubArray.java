package JavaMedium;
import java.util.*;
public class LargestIncreasingSubArray {
    public static void main (String [] args)
    {
        int [] arr1 ={ 1, 5, 3, 7};
        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};
        sortSubArray(arr2);
        sortSubArray(arr1);
        System.out.println(Arrays.toString(sortSubArray(arr2)));
        System.out.println(Arrays.toString(sortSubArray(arr1)));
    }

    public static int[] sortSubArray(int[] arr)
    {
        int currlen = 1;
        int maxlen = 1;
        int start = 0;
        int currstrt = 0;

        for(int i = 1 ; i<arr.length; i++)
        {
            if (arr[i] > arr[i-1]) {
                currlen ++;
            }else{
                currlen = 1;
                currstrt = i;
            }
            if (currlen > maxlen) {
                maxlen = currlen;
                start = currstrt;
            }
        }
        return Arrays.copyOfRange(arr, start, start + maxlen);
    }
    
}
