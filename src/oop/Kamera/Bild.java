package oop.Kamera;

public class Bild {
    private String name;
    private String datum;
    private int groesse;

    public Bild(String name, String datum, int groesse) {
        this.name = name;
        this.datum = datum;
        this.groesse = groesse;
    }

    public void getInfo() {
        System.out.println("Dateiname: " + name + ", Dateigröße: " + groesse + ", Datum: " + datum );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
}
