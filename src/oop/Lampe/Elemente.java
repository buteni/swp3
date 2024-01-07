package oop.Lampe;

public class Elemente {
    private String name;
    private String farbe;
    private int stromverbrauch;
    private boolean statusOn;

    public Elemente(String name, String farbe, int stromverbrauch, boolean statuson ) {
        this.name = name;
        this.farbe = farbe;
        this.stromverbrauch = stromverbrauch;
        this.statusOn = statuson;
    }

    public void turnon() {
        if(statusOn == true) {

            System.out.println("Mein Name ist " + getName() + ". Ich bin bereits eingeschaltet");

        }
        else {
            int verbrauch = getStromverbrauch() + 5;
            setStromverbrauch(verbrauch);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getStromverbrauch() {
        return stromverbrauch;
    }

    public void setStromverbrauch(int stromverbrauch) {
        this.stromverbrauch = stromverbrauch;
    }

    public boolean isStatusOn() {
        return statusOn;
    }

    public void setStatusOn(boolean statusOn) {
        this.statusOn = statusOn;
    }
}
