package AdvancesLoopingQuestions;

public class StringPermute {
    public static void main(String[] args) {
        String str ="PQRAFDSP";
        System.out.println("The permutations of the " + str + "is :") ;
        permute(str, "");
    }

    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i <= str.length()-1; i++) {

            char ch = str.charAt(i);

            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, ch + result);
        }
    }
}
