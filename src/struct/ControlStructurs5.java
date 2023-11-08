package struct;

import java.util.Random;

public class ControlStructurs5 {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10

        Random random = new Random();
        int randomNumber = random.nextInt(5,10);

        System.out.println(randomNumber);

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.

        switch(randomNumber) {

            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Anderer Wert");
                break;

        }



    }
}
