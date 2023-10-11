package at.vnr.basic;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean Abbruch = true;
        int iKontostand = 0;

        while(Abbruch) {

            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Abbrechen");

            int Auswahl = scanner.nextInt();


            if (Auswahl == 1) {

                System.out.println("Geben Sie ein, wieviel Sie einzahlen wollen:");
                int betrag = scanner.nextInt();
                iKontostand += betrag;
                System.out.println("Sie haben " + betrag + " Euro eingezahlt");

            } else if (Auswahl == 2) {

                System.out.println("Geben Sie ein, wieviel Sie abheben wollen:");
                double betrag = scanner.nextDouble();

                if (betrag <= iKontostand) {
                    iKontostand = (int) (iKontostand - betrag);
                    System.out.println("Sie haben " + betrag + " Euro abgehoben");

                } else {
                    System.out.println("Sie haben zu wenig Geld auf dem Konto.");
                }

            } else if (Auswahl == 3) {

                System.out.println("Ihr Kontostand beträgt: " + iKontostand);
            } else if (Auswahl == 4) {

                Abbruch = false;

                System.out.println("Sie werden abgemeldet");
            } else {

                System.out.println("Falsche Eingabe!");
            }

        }

    }
}
