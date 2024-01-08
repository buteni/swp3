package oop.Kamera;

public class TestIt {
    public static void main(String[] args) {
        SDCard sdCard = new SDCard(20);
        Linse linse  = new Linse(23);
        Hersteller hersteller = new Hersteller("Canon", "Ungarn");

        Kamera kamera = new Kamera(10,"königsblau", sdCard, linse, hersteller );
        kamera.takePicture(Kamera.type.klein,"12.10.2023","24");
        kamera.takePicture(Kamera.type.groß,"12.10.2023", "20");
        kamera.takePicture(Kamera.type.groß,"12.10.2023", "6");
        kamera.takePicture(Kamera.type.mittel,"12.10.2023", "7");
        kamera.takePicture(Kamera.type.mittel,"12.10.2023", "7");

    }
}
