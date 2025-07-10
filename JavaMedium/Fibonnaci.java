package JavaMedium;
import java.util.Scanner;


public class Fibonnaci {
    public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the limit of n :" );
    int n = scan.nextInt();

    System.out.println("the fibnnaico series upto "+ n + " :");
    int a =0 , b=1;
    while(a<=n ){
        System.out.println(a + "");
        int next = a+b;
        a = b ;
        b= next;
    }
    scan.close();
}
}