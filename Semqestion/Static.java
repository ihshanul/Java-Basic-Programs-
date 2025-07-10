package Semqestion;
class StaticExample{
    static int count =0;

    static void increment(){
        count++;
    }
}



public class Static {
    public static void main (String [] args){
        StaticExample.increment();
        StaticExample.increment();
        StaticExample.increment();
        System.out.println("the static count is :" + StaticExample.count);
        
    }
}
