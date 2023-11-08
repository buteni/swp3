package oop;

public class Flasche {

    private String Hersteller;

    private int Volumen;

    private String Gefuelltmit;

    public Flasche(String hersteller, int volumen, String gefuelltmit) {
        Hersteller = hersteller;
        Volumen = volumen;
        Gefuelltmit = gefuelltmit;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int volumen) {
        Volumen = volumen;
    }

    public String getGefuelltmit() {
        return Gefuelltmit;
    }

    public void setGefuelltmit(String gefuelltmit) {
        Gefuelltmit = gefuelltmit;
    }
}
