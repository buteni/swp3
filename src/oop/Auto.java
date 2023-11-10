package oop;


import java.util.ArrayList;

public class Auto {
    private int iLeistung = 0;
    private String sFarbe = "keine Farbe";


    private Fahrrad kofferraumfahrrad;

    private ArrayList<Getraenkekiste> KofferraumGetraenke;


    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public int getiLeistung() {
        return iLeistung;
    }



    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}
