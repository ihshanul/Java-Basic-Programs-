package AdvancesLoopingQuestions;

public class Factoiral {
    public static void main(String[] args) {
        int number = 7+2-4;
        int result = factoiral(number);
        System.out.println("Factoiral of " +number + " is :" +result);
    }
    static int factoiral(int num){
        if (num ==0 || num == 1) {
            return 1;
        }
        else{
            return num* factoiral(num-1);
        }
    }
}
