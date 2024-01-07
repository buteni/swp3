package oop.Bank;

public class Kreditkonto extends Basiskonto {
    private double dZinssatz;

    public void Einzahlung(double dSumme){
        if(dSumme <= (getKontostand() * -1)) {
            System.out.println("Es wurde " + dSumme + "€ eingezahlt");
            double dNeuerKontostand = getKontostand() + dSumme;
            setKontostand(dNeuerKontostand);
        } else{
            System.out.println("Einzahlung zu hoch");
        }
    }

    public void Zinszahlung(){
        double dZinsen = getKontostand() / 100 * getdZinssatz();
        double dNeuerKontostand = getKontostand() - dZinsen;
        setKontostand(dNeuerKontostand);
        System.out.println("Ihnen wurde " + dZinsen + "€ aufgrund von Zinsen abgezogen");
    }

    public Kreditkonto(String hersteller, String kartenname, String kartennummer, String CVE, double kontostand, double dZinssatz) {
        super(hersteller, kartenname, kartennummer, CVE, kontostand);
    }

    public double getdZinssatz() {
        return dZinssatz;
    }


}
