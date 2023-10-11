package at.vnr.basic;

public class CaesarVerschluesselung {
    public static void main(String [] args) {
        String result = ecrypt(1, "hallo");
    }

    public static String ecrypt(int shift, String stringToEncrypt) {

        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
        }

        return "";
    }


}
