package javaBasic;
import java.util.Scanner;

public class number 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number Between 1 to 100:");
        int num = scan.nextInt();
        if(num>1 && num<=50)
        {
            System.out.print("Lower half of the Number");
        }
        if(num>50 && num<=100)
        {
            System.out.print("Higher half of the Number");
        }
        else
        {
            //System.out.print("invaild NUmber");
        }
    }
}