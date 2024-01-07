package oop.Figuren;

public class Quadrat extends Figuren{

    public Quadrat (String name) {
        super(name);
    }
    public void Fleache(double Laenge){
        double Flaecheninhalt = 0;
        Flaecheninhalt = Math.pow(Laenge, 3);
        System.out.println("Flaecheninhalt: " + Flaecheninhalt);
    }

}
