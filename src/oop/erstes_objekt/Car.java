package oop.erstes_objekt;

public class Car {

    public int fuelcosumption;

    public int fuelamount;

    public String brand;

    public String serialnumber;

    public String color;

    public int maxfuelvolume;


    //Methode
    public void drive() {
        this.fuelamount = this.fuelamount - this.fuelcosumption;
        System.out.println("I am driving");
    }

    public void bremsen() {
        System.out.println("Ich bremse");
    }

    public void turboboost() {
        if(this.fuelamount >= this.maxfuelvolume ) {
            System.out.println("");
        }

    }
}
