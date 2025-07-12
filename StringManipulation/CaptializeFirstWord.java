package StringManipulation;

public class CaptializeFirstWord {
    public static void main (String [] args){
        String value = "java is a powerful language";
        String result = CaptializeFirstWord(value);
        System.out.println("CAPITALIZED :"  + result);
    }

    private static String CaptializeFirstWord(String str) {
        String []words = str.split(" ");
        StringBuilder s = new StringBuilder();

        for(String word : words)
        {
            if (!word.isEmpty()) {
                s.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1))
                .append(" ");
            }
        }
        return s.toString().trim();

    }
}
