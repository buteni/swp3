package oop.erstes_objekt;

public class Engine {

    public enum TYPE{DIESEL, GAS}

    private int horsePower;
    private TYPE type;

    private int speed;

    public Engine(int horsePower, TYPE type, int speed) {
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
    }

    public void drive(int amount) {

        System.out.println("The motor is running with: " + amount);

    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }


}

