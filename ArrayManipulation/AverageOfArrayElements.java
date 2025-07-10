package ArrayManipulation;

public class AverageOfArrayElements {
    public static void main(String [] args)
    {
        double [] arr = {2.3 , 33.3 , 21.2 , 32.3 , 19};

        double sum = 0;
        double avg = 0;
       for(int i =0 ; i< arr.length ; i++)
       {
            sum = sum+ arr[i];
            
       }
       avg = sum/arr.length;

       System.out.println(avg);
    }
}
