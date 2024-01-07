package oop.Bank;

public class Sparbuch extends Basiskonto {
    private double dZinssatz;

    public void Auszahlung(double dSumme){
        if(dSumme <= getKontostand()) {
            System.out.println("Es wurde " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getKontostand() - dSumme;
            setKontostand(dNeuerKontostand);
        } else {
            System.out.println("Saldo zu klein!");
        }
    }
    public void Zinszahlung(){
        double dZinsen = getKontostand() / 100 * getdZinssatz();
        double dNeuerKontostand = getKontostand() + dZinsen;
        setKontostand(dNeuerKontostand);
        System.out.println("Sie bekommen " + dZinsen + "€ als Zinsen zugeschrieben");
    }

    public Sparbuch(String hersteller, String kartenname, String kartennummer, String  CVE, double kontostand, double dZinssatz) {
        super(hersteller, kartenname, kartennummer, CVE, kontostand);
    }

    public double getdZinssatz() {
        return dZinssatz;
    }
}
