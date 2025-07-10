package Semqestion;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

import java.util.Arrays;

public class ArrSort {
    public static void main ( String [] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the 5 Number:");
        for(int i =0 ; i< 5 ; i++){
            arr[i] = scan.nextInt();
        }
    
        Arrays.sort(arr);

        System.out.println("Sorted Arrays:" + Arrays.toString(arr)) ;
    }
    
}
