package oop.Figuren;

public class Viereck extends Figuren{
    public Viereck(String name) {
        super(name);
    }

    public void Fleache(double laenge, double Breite){
        double Flaecheninhalt = 0;
        Flaecheninhalt = laenge * Breite;
        System.out.println("Flaecheninhalt: " + Flaecheninhalt);
    }


}
