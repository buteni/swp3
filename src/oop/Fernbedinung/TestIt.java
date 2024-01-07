package oop.Fernbedinung;

public class TestIt {
    public static void main(String[] args) {

        Batterie b1 = new Batterie(75);
        Batterie b2 = new Batterie(40);

        Remote fernbedienung = new Remote("Philips");
        fernbedienung.addBattery(b1);
        fernbedienung.addBattery(b2);

        fernbedienung.getStatus();

        fernbedienung.turnOn();

        fernbedienung.getStatus();

        fernbedienung.turnOff();
    }
}
