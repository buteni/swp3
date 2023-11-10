package oop.einfuehrung;

public class Fahrrad {
    private int iPreis = 0;

    private String sMarke = "keine Marke";

    private String sFarbe = "keine Farbe";

    public int getiPreis() {
        return iPreis;
    }

    public void setiPreis(int iPreis) {
        this.iPreis = iPreis;
    }

    public String getsMarke() {
        return sMarke;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}