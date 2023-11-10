package oop.erstes_objekt;

import oop.erstes_objekt.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.color = "red";
        c1.fuelcosumption = 7;
        c1.serialnumber = "A1234";
        c1.fuelamount = 70;
        c1.maxfuelvolume = 110;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.color = "grey";
        c2.fuelcosumption = 6;
        c2.serialnumber = "M1234";
        c2.fuelamount = 20;
        c2.maxfuelvolume = 90;

        System.out.println(c2.fuelamount);
        c2.drive();
        System.out.println(c2.fuelamount);
        c2.bremsen();

    }
}
