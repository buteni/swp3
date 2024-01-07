package oop.Lampe;

public class TestIt {
    public static void main(String[] args) {
        Elemente e1 = new Elemente("LED rot", "Rot", 3, true);
        Elemente e2 = new Elemente("LED grün", "Grün", 7, false);
        Elemente e3 = new Elemente("LED blau", "Blau", 13, false);
        Elemente e4 = new Elemente("LED gelb", "Gelb", 16, true);

        Lampe l1 = new Lampe();
        l1.addLightElement(e1);
        l1.addLightElement(e2);
        l1.addLightElement(e3);
        l1.addLightElement(e4);

        l1.getOverallPowerUsage();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        e1.turnon();
    }

    }

