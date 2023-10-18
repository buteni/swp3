package at.vnr.basic;

public class CaesarVerschluesselung {
    public static void main(String[] args) {
        String result = encrypt(1, "z z z");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            char letter = inputData[i];

            if (Character.isLetter(letter)) {
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                int shifted = (letter - base + shift) % 26;
                if (shifted < 0) {
                    shifted += 26;
                }
                encryptedString += (char) (base + shifted);
            } else {
                encryptedString += letter;
            }
        }

        return encryptedString;
    }
}
