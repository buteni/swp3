package oop.Bank;

public class Basiskonto {

    private String Hersteller;
    private String Kartenname;
    private String CVE;
    private String Kartennummer;
    private double Kontostand;

    public void Einzahlen(double Einzahlung) {
        System.out.println("Es wurden " + Einzahlung + "€ eingezahlt");
        double aktKontostand = getKontostand() + Einzahlung;
        setKontostand(aktKontostand);
    }

    public void Auszahlen(double Auszahlung) {
        System.out.println("Es wurden " + Auszahlung + "€ ausgezahlt");
        double akKontostand = getKontostand() - Auszahlung;
        setKontostand(akKontostand);
    }

    public void Saldo() {
        System.out.println("Der aktuelle Saldo beträgt:" + getKontostand());
    }


    public Basiskonto(String Hersteller, String Kartenname, String CVE, String Kartennummer, double Kontostand ) {
        this.Hersteller = Hersteller;
        this.Kartenname = Kartenname;
        this.CVE = CVE;
        this.Kartennummer = Kartennummer;
        this.Kontostand = Kontostand;
    }


    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public String getKartenname() {
        return Kartenname;
    }

    public void setKartenname(String kartenname) {
        Kartenname = kartenname;
    }

    public String getCVE() {
        return CVE;
    }

    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    public String getKartennummer() {
        return Kartennummer;
    }

    public void setKartennummer(String kartennummer) {
        Kartennummer = kartennummer;
    }

    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }
}
