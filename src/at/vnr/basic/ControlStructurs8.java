package at.vnr.basic;

import java.util.Random;

public class ControlStructurs8 {
    public static void main(String[] args) {

        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

        Random random = new Random();

        int randomNumber = random.nextInt(10,30);



        System.out.println(randomNumber);
















    }
}
