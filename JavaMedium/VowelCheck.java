package JavaMedium;

public class VowelCheck {
    public static boolean containsVowel(String input){
        input = input.toLowerCase();
        return input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u");
    }
    public static void main (String [] args ){
        System.out.println(containsVowel("arntgjdsgn"));
        System.out.println(containsVowel("brtrbt"));
    }
    
}
