package javaBasic;
import java.util.Scanner;
class username
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = scan.nextLine();
        System.out.print("Welcome Back "+name);

    }
}