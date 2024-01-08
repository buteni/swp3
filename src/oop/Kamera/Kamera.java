package oop.Kamera;

public class Kamera {
    private int pixel;
    private int gewicht;
    private String farbe;
    private SDCard sdKarte;
    public enum type {klein, mittel, groß}
    private SDCard sdCard;
    private Linse linse;
    private Hersteller hersteller;


    public Kamera(int pixel, String farbe, SDCard sdCard, Linse linse, Hersteller hersteller) {
        this.pixel = pixel;
        this.gewicht = gewicht;
        this.farbe = farbe;
        this.sdCard = sdCard;
        this.linse = linse;
        this.hersteller = hersteller;
    }

    public void takePicture(type pixel, String datum, String name ) {
        int groesse = 0;
        if (pixel == type.klein){
            groesse = 2;
        } else if (pixel == type.mittel) {
            groesse = 4;
        } else if (pixel == type.groß) {
            groesse = 6;
        }

        if (sdCard.getFreeSpace() > groesse) {
            if (sdCard.getFreeSpace() > 10) {
                if (pixel == type.klein) {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                } else if (pixel == type.mittel) {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                } else {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                }
                System.out.println("Bild gespeichert");
            } else if (sdCard.getFreeSpace() < 10) {
                System.out.println("Speicher wird weniger!");
                if (pixel == type.klein) {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                } else if (pixel == type.mittel) {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                } else {
                    Bild datei = new Bild(name, datum, groesse);
                    sdCard.savePicture(datei);
                }
                System.out.println("Bild gepspeichert");
            }
        } else {
            System.out.println("Speicher voll");
        }
    }







    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public Linse getLinse() {
        return linse;
    }

    public void setLinse(Linse linse) {
        this.linse = linse;
    }

    public Hersteller getHersteller() {
        return hersteller;
    }

    public void setHersteller(Hersteller hersteller) {
        this.hersteller = hersteller;
    }
}
