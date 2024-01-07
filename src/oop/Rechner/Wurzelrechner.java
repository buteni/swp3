package oop.Rechner;

import static java.lang.Math.sqrt;

public class Wurzelrechner extends Rechner {

    public void Wurzel (double Zahl1) {

        double Wurzel = 0;
        Wurzel = sqrt(Zahl1);

        System.out.println("Die Wurzel von " + Zahl1 + "lautet: " + Wurzel);
    }
}
