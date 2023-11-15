package oop.erstes_objekt;

public class Car {

    public int fuelcosumption;

    public int fuelamount;

    public String brand;

    public String serialnumber;

    public String color;

    public int maxfuelvolume;

    public int amountOfRepititions;

    public double fuelcosumptionperkilometer;

    public double restrange;

    //Methode
    public void drive() {
        this.fuelamount = this.fuelamount - this.fuelcosumption;
        System.out.println("I am driving");
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


}
