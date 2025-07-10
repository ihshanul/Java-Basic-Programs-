package javaBasic;
import java.util.Scanner;
class age
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>= 18){
            System.out.print("adult");
        }
        else{
            System.out.print("you are not eligible");
        }
    }
}