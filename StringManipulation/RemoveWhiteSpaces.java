package StringManipulation;

public class RemoveWhiteSpaces {
    public static void main (String [] args)
    {
        String value = " Java P rogamming Lan   guage ";

        String result = value.replaceAll("\\s+", "");

        System.out.println("Original String :" + value);
        System.out.println("WhiteSpaceRemovesString :" + result);
    }
}
