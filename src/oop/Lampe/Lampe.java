package oop.Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lampe {

    private List<Elemente> elemente;

    public Lampe() {
        this.elemente = new ArrayList<>();

    }

    public void addLightElement(Elemente elemente) {
        this.elemente.add(elemente);
    }

    public void turnAllOn() {
        for (int i = 0; i < elemente.size(); i++) {
            if (elemente.get(i).isStatusOn() == false) {
                elemente.get(i).setStatusOn(true);
                int erhöhung = elemente.get(i).getStromverbrauch() + 5;
                elemente.get(i).setStromverbrauch(erhöhung);
            }
        }
    }

    public double getOverallPowerUsage() {
        double gesamtStromverbrauch = 0;
        for (int i = 0; i < elemente.size(); i++) {
            gesamtStromverbrauch += elemente.get(i).getStromverbrauch();
        }
        System.out.println("Der bisher verbrauchte Strom beträgt " + gesamtStromverbrauch);
        return gesamtStromverbrauch;
    }

    public void printNamesOfLightElements() {
        System.out.println("Es gibt folgende LEDS: ");
        for (int i = 0; i < elemente.size(); i++) {
            System.out.println(elemente.get(i).getName());
        }

    }

}
