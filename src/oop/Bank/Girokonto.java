package oop.Bank;

public class Girokonto extends Basiskonto {
    private double dÜberziehungsrahmen;

    public void Auszahlung(double dSumme){
        if((getdÜberziehungsrahmen() + getKontostand()) >= dSumme) {
            System.out.println("Es wurde " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getKontostand() - dSumme;
            setKontostand(dNeuerKontostand);
        } else {
            System.out.println("Limit überschritten!");
        }
    }

    public Girokonto(String Hersteller, String Kartenname, String CVE, String Kartennummer, double Kontostand, double dÜberziehungsrahmen) {
        super(Hersteller, Kartenname, CVE, Kartennummer, Kontostand);
    }

    public double getdÜberziehungsrahmen() {
        return dÜberziehungsrahmen;
    }
}
