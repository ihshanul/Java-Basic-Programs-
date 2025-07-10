package javaBasic;
import java.util.Scanner;

public class Sting
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("enter the string: ");
        String name = scan.nextLine();
        if(name.contains("java")){
            System.out.print("the word matches the string");
        }
        else{
            System.out.print("the string doesn't contains java");
        }
    }
}