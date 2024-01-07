package oop.Fernbedinung;

public class Batterie {
    private int chargingStatus;


    public Batterie(int chargingStatus) {
        this.chargingStatus = chargingStatus;


    }

    public int getChargingStatus() {
        return chargingStatus;

    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }


}
