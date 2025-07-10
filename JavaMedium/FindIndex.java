package JavaMedium;

public class FindIndex {
    public static int FindIndex(int[] arr , int target){
        for(int i = 0; i< arr.length ; i++){
            if(arr[i]== target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String [] args)
    {
        int [] arr1 = {12 , 22, 42, 2, 53 , 53};
        System.out.println(FindIndex(arr1 , 22));
    }
    
}
