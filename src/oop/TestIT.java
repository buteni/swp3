package oop;

public class TestIT {
    public static void main(String[] args) {

        //Auto

        Auto auto = new Auto( 300,  "rot");
        Auto auto1 = new Auto();
        auto.setiLeistung(300);
        auto.setsFarbe("rot");

        System.out.println("Auto: \n");
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe() + "\n");



        //Fahrrad
        Fahrrad fahrrad = new Fahrrad();
        fahrrad.setsFarbe("blau");
        fahrrad.setiPreis(200);
        fahrrad.setsMarke("KTM");
        System.out.println("Fahrrad: \n");
        System.out.println(fahrrad.getiPreis() + " " + fahrrad.getsFarbe() + " " + fahrrad.getsMarke());

        auto.setKofferraumfahrrad(fahrrad);




        //Flasche

        Flasche flasche = new Flasche("Cola", 500, "cola zero");
        System.out.println("Flasche: \n");
        System.out.println(flasche.getHersteller() + " " + flasche.getVolumen() + " " + flasche.getGefuelltmit() + "\n");


        //Getraenkekiste
        Getraenkekiste getraenkekiste = new Getraenkekiste(1, flasche );
        System.out.println("Getraenkekiste: \n");
        System.out.println(getraenkekiste.getiAnzahl() + " " + flasche.getGefuelltmit());







    }
}
