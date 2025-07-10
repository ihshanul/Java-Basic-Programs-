package ArrayManipulation;

public class FibonacciSeries {
    public static void main (String [] args)
    {
        int a = 0, b=1;
        int n = 10;

        int next = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2; i<n; i++){
            next = a+b;
            a= b;
            b= next;
            System.out.println(next);

        }

    }
}
