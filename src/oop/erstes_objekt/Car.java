package oop.erstes_objekt;

public class Car {

    private Tank tank;


    private Engine engine;

    public int speed;

    private int horsepower;

    private int fuelcosumption;

    private int fuelamount;

    private String brand;

    private String serialnumber;

    private String color;

    public int maxfuelvolume;

    public int amountOfRepititions;

    public double fuelcosumptionperkilometer;

    public double restrange;



    public Car(Engine engine, int fuelcosumption, String brand, String serialnumber) {
        this.engine = engine;
        this.fuelcosumption =fuelcosumption;
        this.brand = brand;
        this.serialnumber = serialnumber;

    }



    //Methode
    public void drive() {
        this.fuelamount = this.fuelamount - this.fuelcosumption;
        System.out.println("I am driving");
    }

    public void speedzone() {

        if (getEngine().getSpeed() > 100) {

            System.out.println("Out of range");
        }
        else if(getEngine().getSpeed() > 75) {

            System.out.println("Vollgas");
        }
        else if(getEngine().getSpeed() > 50 ) {

            System.out.println("Normal");

        }
        else if (getEngine().getSpeed() < 50) {

            System.out.println("Langsam");
        }




    }

    public void bremsen() {
        System.out.println("Ich bremse");
    }

    public void turboboost() {
        if(this.fuelamount >= 0.1 * this.maxfuelvolume ) {
            System.out.println("SuperBoostMode");
        }
        else {

            System.out.println("Not enough fuel to go Superboost");
        }

    }

    public void honk() {

        for (int i = 0; i < this.amountOfRepititions ; i++) {

            System.out.println("Tuuut");
        }

    }

    public void getremainingRange() {

        this.restrange = this.fuelamount / this.fuelcosumptionperkilometer;

        System.out.println("Das Auto fährt noch " + this.restrange + " km");

    }



    public void setFuelcosumption(int fuelcosumption) {
        this.fuelcosumption = fuelcosumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getFuelcosumption() {
        return fuelcosumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialnumber() {
        return serialnumber;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
