package struct;

public class StringHelper {
    public static int countLetters(String inputString, char targetChar) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        String input = "Hello World";

        char target = 'o';

        int ergebnis = countLetters(input, target);

        System.out.println("Der Charakter '" + target + "' kommt " + ergebnis + " vor.");
    }
}







