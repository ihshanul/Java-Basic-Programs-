package Semqestion;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms you want: ");
        int n = scan.nextInt();
        
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        
        if(n >= 1) System.out.print(a + " ");
        if(n >= 2) System.out.print(b + " ");
        
        for(int i = 2; i < n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
        scan.close();
    }
}
