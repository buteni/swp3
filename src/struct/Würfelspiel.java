package struct;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int winsofplayer = 0;
        int winsofcomputer = 0;
        int unentschieden = 0;


        int abbruch;
        do {

            winsofcomputer = 0;
            winsofplayer = 0;
            unentschieden = 0;


            System.out.println("Das Spiel beginnt.");

            for (int i = 0; i < 6; i++) {

                int randomPlayer = random.nextInt(6) + 1;
                int randomComputer = random.nextInt(6) + 1;

                System.out.println("Player :" + randomPlayer + " Computer: " + randomComputer);

                if (randomPlayer > randomComputer) {
                    winsofplayer++;

                } else if (randomPlayer < randomComputer) {

                    winsofcomputer++;

                } else {
                    unentschieden++;
                }

            }


            System.out.println("Player: " + winsofplayer);
            System.out.println("Computer: " +winsofcomputer);
            System.out.println("Unentschieden: " +unentschieden);



            if (winsofplayer > winsofcomputer) {

                System.out.println("Spieler hat gewonnen");
            } else if (winsofplayer < winsofcomputer) {

                System.out.println("Computer hat gewonnen");
            } else {

                System.out.println("Es gibt ein unentschieden");
            }

            System.out.println("Zum Weiterspielen drücken Sie 1, zum Abbrechen 0.");

            abbruch = scanner.nextInt();

        } while (abbruch == 1);


    }
}
