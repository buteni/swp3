package oop.Figuren;

public class TestIt {
    public static void main(String[] args) {

        Kreis k1 = new Kreis("Kreis 1");
        k1.Flaeche(5);

        Viereck v1 = new Viereck("Viereck 1");
        v1.Fleache(5,10);

        Quadrat q1 = new Quadrat("Quadrat 1");
        q1.Fleache(2);

        Würfel w1 = new Würfel("Würfel 1");
        w1.Fleache(8);
    }
}
