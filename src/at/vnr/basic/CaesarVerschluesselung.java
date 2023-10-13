package at.vnr.basic;

public class CaesarVerschluesselung {
    public static void main(String [] args) {
        String result = ecrypt(2, "hallo");
        System.out.println(result);
    }

    public static String ecrypt(int shift, String stringToEncrypt) {

        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            encryptedString += Character.toString(letter);
        }

        return encryptedString;
    }



}
