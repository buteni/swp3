package oop.Rechner;

public class TestIt {
    public static void main(String[] args) {

        Rechner r1 = new Rechner();

        System.out.println("Grundrechner: \n");
        r1.Addition(5,10);
        r1.Subtraktion(10, 5);
        r1.Multiplikation(5, 10);
        r1.Division(10, 5);

        WissenschaftlicherRechner w1 = new WissenschaftlicherRechner();
        System.out.println("\nWissenschaftlicher Rechner: \n");
        w1.Cosinus(50);
        w1.Sinus(10);

        Wurzelrechner wr1 = new Wurzelrechner();
        System.out.println("\nWurzelrechner: \n");
        wr1.Wurzel(9);
    }
}
