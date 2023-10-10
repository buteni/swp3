package at.vnr.basic;

import java.util.Random;

public class ControlStructurs8 {
    public static void main(String[] args) {

        Random random = new Random();

        boolean Abbruch = false;
        int iSumme = 0;

        while(!Abbruch) {

            int randomNumber = random.nextInt(10, 30);

            System.out.println(randomNumber);

            if((randomNumber == 15) || (randomNumber == 25) ){
                Abbruch = true;
            }

            iSumme = iSumme + randomNumber;
        }

        System.out.println("Die Summer der vorherigen Zahlen lautet:");
        System.out.println(iSumme);







    }

}