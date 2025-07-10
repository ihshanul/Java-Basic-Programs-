package javaBasic;
import java.util.Scanner;
class ihshan
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num = scan.nextInt();
        if(num>0){
            System.out.print("Positive  NUmber");
        }
        if(num<0){
            System.out.print("Negative  NUmber");
        }
        if(num == 0){
            System.out.print("The Number is Zero");
        }
    }
}