package oop.Kamera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int speicher;
    private static List<Bild> dateien;

    public int getFreeSpace(){
        int freierSpeicher = getSpeicher();
        for (int i = 0; i < dateien.size(); i++) {
            freierSpeicher = freierSpeicher - dateien.get(i).getGroesse();
        }
        return freierSpeicher;
    }

    public static void getAllFiles() {
        for (int i = 0; i < dateien.size(); i++) {
            dateien.get(i).getInfo();
        }
    }

    public void savePicture(Bild datei){
        this.dateien.add(datei);
    }
    public SDCard(int speicher) {
        this.speicher = speicher;
        this.dateien = new ArrayList<>();
    }

    public int getSpeicher() {
        return speicher;
    }

    public List<Bild> getDateien() {
        return dateien;
    }
}
