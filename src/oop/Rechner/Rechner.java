package oop.Rechner;

import java.util.Dictionary;

public class Rechner {
    public void Addition(double Zahl1, double Zahl2) {

        double Summe = 0;
        Summe = Zahl1 + Zahl2;

        System.out.println("Die Summe lautet: " + Summe);
    }

    public void Subtraktion(double Zahl1, double Zahl2) {

        double Differenz = 0;
        Differenz = Zahl1 - Zahl2;

        System.out.println("Die Differenz lautet:" + Differenz);
    }

    public void Multiplikation(double Zahl1, double Zahl2) {

        double Produkt = 0;
        Produkt = Zahl1 * Zahl2;

        System.out.println("Das Produkt lautet:" + Produkt);

    }

    public void Division(double Zahl1, double Zahl2) {

        double Quotient = 0;
        Quotient = Zahl1 / Zahl2;

        System.out.println("Der Quotient lautet:" + Quotient);

    }

}
