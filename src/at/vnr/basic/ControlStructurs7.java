package at.vnr.basic;

public class ControlStructurs7 {
    public static void main(String[] args) {

        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

        int iNummer = 0;

        for (int i = 2; i < 1000 ; i = i+2) {

            iNummer = iNummer +i;

        }

        System.out.println(iNummer);


    }
}
