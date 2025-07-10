package javaBasic;
import java.util.Scanner;

class temp
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter celsius:");
        double celsius = scan.nextDouble();
        double farhenheat =  (celsius * 9/5) + 32;
        System.out.println("farhenheait is :" + farhenheat);

    }
}