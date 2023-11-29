package struct;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {


        // Spieler X hat die 1
        // Spieler 0 hat die 2
        int iAuswahl = ' ';
        int iUeberpruefung = 0;
        int idurchgelaufen = 0;
        int igewinner = 0;
        int iunentschieden = 0;
        Scanner scanner = new Scanner(System.in);

        int[]  iumgewandelt = new int[2];
        char[][] cSpielfeld = new char[3][3];
        int[][] iavailable = new int [3][3];


        //Den array mit Leerzeichen befüllen
        for (int i = 0; i < cSpielfeld.length; i++) {
            for (int j = 0; j < cSpielfeld.length; j++) {
                cSpielfeld[i][j] = ' ';
            }
        }

        //Den array mit 0 befüllen
        for (int i = 0; i < iavailable.length; i++) {
            for (int j = 0; j < iavailable.length; j++) {
                iavailable[i][j] = 0;
            }
        }


        //start des Spieles
        System.out.println("Willkommen im TicTacToe Spiel. ");

        //aufklärung des Spieles
        System.out.println("1|2|3\n"  + "4|5|6\n" + "7|8|9\n");



        do {

            anzeigeSpielfeld(cSpielfeld);

            System.out.println("Der erste Spieler (X) ist dran, geben Sie ein wo sie das x einsetzen wollen");

            do {

                //Erster Spieler kann eingabe machen, wohin er setzen möchte

                iAuswahl = scanner.nextInt();


                //Es wird überprüft ob das Feld noch Leer ist
                iUeberpruefung = isavailable(iavailable, iAuswahl);

                if (iUeberpruefung == 0) {


                    //Die eingegebene Zahl wird ins Array gesetzt
                    iumgewandelt = umwandeln(iAuswahl);
                    //Der Array wird befüllt mit dem X und er wird für den ersten Spieler reserviert
                    iavailable[iumgewandelt[0]][iumgewandelt[1]] = 1;

                    cSpielfeld[iumgewandelt[0]][iumgewandelt[1]] = 'X';

                    anzeigeSpielfeld(cSpielfeld);

                    idurchgelaufen = 1;

                    iunentschieden += 1;

                } else if (iUeberpruefung == 1) {
                    //Dieser Spieler hat bereits in diesem Feld ein X plaziert

                    System.out.println("Sie haben in diesem Feld bereits ein X platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                } else if (iUeberpruefung == 2) {
                    //Der andere Spieler hat dieses Feld bereits belegt

                    System.out.println("Der generische Spieler hat bereits ein O in diesem Feld platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                }
                //Wiederholung bis die neue freie Zahl eingeben wird
            } while (idurchgelaufen != 1);
            idurchgelaufen = 0;

            //Es wird überprüft ob der Spieler schon gewonnen hat
            igewinner = gewonnen(iavailable);


            //Fals der andere Apierl schon gewonne hat, wird das Programm abgebrochen
            if(idurchgelaufen == 9 | igewinner == 1){

                //nichts passiert (da der andere Spieler schon gewonnen hat

            }else {
                System.out.println("Nun ist der Spieler mit dem O dran, wähle einen Ort aus, wo du deinen Kreis platzieren möchtest: ");
                do {

                    //Eingabe des zweiten Spielers
                    iAuswahl = scanner.nextInt();

                    //Überprüfen ob das Feld noch frei ist
                    iUeberpruefung = isavailable(iavailable, iAuswahl);


                    if (iUeberpruefung == 0) {

                        //Zahl wird umgewandelt in Koordinaten
                        iumgewandelt = umwandeln(iAuswahl);

                        iavailable[iumgewandelt[0]][iumgewandelt[1]] = 2;

                        cSpielfeld[iumgewandelt[0]][iumgewandelt[1]] = 'O';



                        idurchgelaufen = 1;

                        iunentschieden += 1;

                    } else if (iUeberpruefung == 1) {
                        //Dieser Spieler hat bereits in diesem Feld ein X plaziert

                        System.out.println("Der andere Spieler hat bereits ein X in diesem Feld platziert");

                        System.out.println("Geben sie eine neue Zahl ein, an der sie ihr O platzieren wollen");
                    } else if (iUeberpruefung == 2) {
                        //Der andere Spieler hat dieses Feld bereits belegt

                        System.out.println("Sie haben in diesem Feld bereits ein O platziert");

                        System.out.println("Geben sie eine neue Zahl ein, an der sie ihr O platzieren wollen");
                    }
                    //Wiederholung bis eine freie Zahl eingegeben wird
                } while (idurchgelaufen != 1);

                idurchgelaufen = 0;
                //Es wird überprüft ob der Spieler gewonne hat
                igewinner = gewonnen(iavailable);
            }

        }while(igewinner == 0 && iunentschieden < 9);

        //Es wird überprüft welcher der beiden Spieler gewonne hat
        if(igewinner == 1){
            System.out.println("Der Spielr mit dem X hat gewonnen");
        }else if (igewinner == 2){

            System.out.println("Der Spieler mit der O hat gewonnen");

        }else {

            System.out.println("Es ist ein Unentschieden, Viel Glück beim nächsten mal :)");
        }

    }






    //Funktion zur anzeige des Spielfeldes
    public static void anzeigeSpielfeld (char[][] Spielfeld){
        for (char[] chars : Spielfeld) {
            System.out.println("|" + chars[0] + "|" + chars[1] + "|" + chars[2] + "|");
        }
    }


    //Funktion zur Überprüfung, ob das Feld noch Frei ist, je nach dem wird zurückgegeben ob es frei ist, oder welcher Spieler es schon belegt
    public static int isavailable (int[][] Spielfeld, int Zahl) {
        int iZahl = Zahl;
        int iErgebnis = 0;
        int[] iArray = new int[2];

        //Zahl wird umgewandelt in die Koordinate
        iArray = umwandeln(iZahl);


        if (Spielfeld[iArray[0]][iArray[1]] == 0) {
            iErgebnis = 0;

        } else if (Spielfeld[iArray[0]][iArray[1]] == 1) {
            iErgebnis = 1;
        } else {
            iErgebnis = 2;
        }
        return iErgebnis;
    }



    //Funktion zur Umwandlung der Zahl in eine Koordinate für den array
    public static int[] umwandeln (int Zahl){

        int iZeile = 0;
        int iSpalte = 0;
        int[] iumgewandelt = new int[2];

        switch (Zahl) {
            case 1 -> {
                iZeile = 0;
                iSpalte = 0;
            }
            case 2 -> {
                iZeile = 0;
                iSpalte = 1;
            }
            case 3 -> {
                iZeile = 0;
                iSpalte = 2;
            }
            case 4 -> {
                iZeile = 1;
                iSpalte = 0;
            }
            case 5 -> {
                iZeile = 1;
                iSpalte = 1;
            }
            case 6 -> {
                iZeile = 1;
                iSpalte = 2;
            }
            case 7 -> {
                iZeile = 2;
                iSpalte = 0;
            }
            case 8 -> {
                iZeile = 2;
                iSpalte = 1;
            }
            case 9 -> {
                iZeile = 2;
                iSpalte = 2;
            }
        }
        iumgewandelt[0] = iZeile;
        iumgewandelt[1] = iSpalte;
        return  iumgewandelt;
    }


    //Überprüfng, ob einer der beiden Spieler gewonnen hat, indem jede mögliche Gewinn Kombination überprüft wird.
    public static int gewonnen (int[][] iAvailable){

        int iGewonnen = 0;


        if(iAvailable[0][0] == 1 && iAvailable[1][1] == 1 && iAvailable[2][2] == 1){
            iGewonnen = 1;

        } else if (iAvailable[0][2] == 1 && iAvailable[1][1] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;

        } else if (iAvailable[0][0] == 1 && iAvailable[0][1] == 1 && iAvailable[0][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[1][0] == 1 && iAvailable[1][1] == 1 && iAvailable[1][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[2][0] == 1 && iAvailable[2][1] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][0] == 1 && iAvailable[1][0] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][1] == 1 && iAvailable[1][1] == 1 && iAvailable[2][1] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][2] == 1 && iAvailable[1][2] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;
        }

        if(iAvailable[0][0] == 2 && iAvailable[1][1] == 2 && iAvailable[2][2] == 2){
            iGewonnen = 2;

        } else if (iAvailable[0][2] == 2 && iAvailable[1][1] == 2 && iAvailable[2][0] == 2) {
            iGewonnen = 2;

        } else if (iAvailable[0][0] == 2 && iAvailable[0][1] == 2 && iAvailable[0][2] == 2) {
            iGewonnen = 2;

        }else if (iAvailable[1][0] == 2 && iAvailable[1][1] == 2 && iAvailable[1][2] == 2) {
            iGewonnen = 2;

        }else if (iAvailable[2][0] == 2 && iAvailable[2][1] == 2 && iAvailable[2][2] == 2) {
            iGewonnen = 2;

        }else if (iAvailable[0][0] == 2 && iAvailable[1][0] == 2 && iAvailable[2][0] == 2) {
            iGewonnen = 2;

        }else if (iAvailable[0][1] == 2 && iAvailable[1][1] == 2 && iAvailable[2][1] == 2) {
            iGewonnen = 2;

        }else if (iAvailable[0][2] == 2 && iAvailable[1][2] == 2 && iAvailable[2][2] == 2) {
            iGewonnen = 2;
        }

        return  iGewonnen;
    };


//fertig



}