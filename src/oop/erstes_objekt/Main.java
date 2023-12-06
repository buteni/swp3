package oop.erstes_objekt;

import oop.erstes_objekt.Car;

public class Main {
    public static void main(String[] args) {

        //Car 1


        Engine e1 = new Engine(300,Engine.TYPE.DIESEL, 40 );

        System.out.println(e1.getHorsePower() +  " Hp " + e1.getType() + "Typ " + e1.getSpeed() );

        Car c4 = new Car(e1, 30, "Audi", "A34539HGOA" );

        c4.speedzone();



        /*
        c1.setBrand("Audi");
        c1.setFuelcosumption(18);
        c1.setColor("grey");
        c1.setSerialnumber("523759AT");
        c1.fuelamount = 70;
        c1.maxfuelvolume = 110;
        c1.amountOfRepititions = 2;
        c1.fuelcosumptionperkilometer = 0.3;



        System.out.println("Color: " + c1.getColor() + " Serialnumber: " + c1.getSerialnumber() + " FuelConsumption: " + c1.getFuelcosumption() + " Brand: " + c1.getBrand());

        /*

        //Car 2

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.color = "grey";
        c2.fuelcosumption = 6;
        c2.serialnumber = "M1234";

        c2.fuelamount = 30;
        c2.maxfuelvolume = 90;
        c2.amountOfRepititions = 4;
        c2.fuelcosumptionperkilometer = 0.3;

        */

        /*

        //Fahren
        System.out.println(c2.fuelamount);
        c2.drive();
        System.out.println(c2.fuelamount);

        //Bremsen
        c2.bremsen();

        //Turbo
        c2.turboboost();

        //Hupen

        c2.honk();

        //Restweg

        c2.getremainingRange();


        //Car 3


        Car c3 = new Car(18, "Audi", "3479436A");

        System.out.println(c3.serialnumber);

         */



    }
}
