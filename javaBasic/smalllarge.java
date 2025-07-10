package javaBasic;
public class smalllarge {
    public static void main(String[] args) {
        int [] numbers = {45,89,34,66,90,100};
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i=0; i< numbers.length; i++)
        {
            if (numbers[i]>largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                
            }
        }
        System.out.println("The Largest Number In The Array is :" +largest);
        System.out.println("The smallest Number In The Array is :"+ smallest);
        
    }
}
