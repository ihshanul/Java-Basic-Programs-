package ArrayManipulation;

public class LargestElementInArray {
    public static void main (String [] args )
    {
        int [] arr = {1,2,3,4,5,6};
        
        int large = arr[0];
        for(int num : arr)
        {
            if(num> large ){
                large = num;
            }
        }
        System.out.println(large);
    }
}
