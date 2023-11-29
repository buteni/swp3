package oop.erstes_objekt;

public class Engine {

    public enum TYPE{DIESEL, GAS}

    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
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
}

