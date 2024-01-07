package oop.Bank;

public class TestIt {
    public static void main(String[] args) {

        Basiskonto b1 = new Basiskonto("Sparkasse", "Valentin", "475", "2342 0238 0127 6348", 4556.76);
        b1.Einzahlen(500);
        b1.Auszahlen(250);
        b1.Saldo();

        Girokonto g1 = new Girokonto("Sparkasse", "Valentin", "368", "2342 0238 0127 6348", 4556.76, 2866);
        g1.Einzahlen(760);
        g1.Auszahlen(123);
        g1.Saldo();

        Kreditkonto k1 = new Kreditkonto("Sparkasse", "Valentin", "931", "2342 0238 0127 6348", 4556.76, 7.5);
        k1.Einzahlen(5100);
        k1.Auszahlen(1300);
        k1.Zinszahlung();
        k1.Saldo();

        Sparbuch s1 = new Sparbuch("Sparkasse", "Valentin", "947", "2342 0238 0127 6348", 4556.76, 5.5);
        s1.Einzahlen(3200);
        s1.Auszahlen(980);
        s1.Zinszahlung();
        s1.Saldo();
    }
}
