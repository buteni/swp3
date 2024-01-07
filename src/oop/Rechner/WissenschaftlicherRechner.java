package oop.Rechner;

import static java.lang.Math.*;
import static java.lang.Math.toRadians;

public class WissenschaftlicherRechner extends Rechner{

    public void Sinus(double Zahl1){
        double Ergebnis = sin(toRadians(Zahl1));
        System.out.println("Der Sinus von " + Zahl1 + " lautet: " + Ergebnis);
    }

    public void Cosinus(double Zahl1){
        double Ergebnis=cos(toRadians(Zahl1));
        System.out.println("Der Cosinus von " + Zahl1 + " lautet: " + Ergebnis);
    }
}
