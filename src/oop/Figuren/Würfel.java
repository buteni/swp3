package oop.Figuren;

public class Würfel extends Figuren{
    public Würfel (String name) {
        super(name);
    }

    public void Fleache(double Laenge){
        double Flaecheninhalt = 0;
        Flaecheninhalt = Laenge * Laenge;
        System.out.println("Flaecheninhalt: " + Flaecheninhalt);
    }
}