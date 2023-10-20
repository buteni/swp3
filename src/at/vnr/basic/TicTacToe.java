package at.vnr.basic;

import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] [] field = new char[3][3];

        int eingabe1 = 0;
        int eingabe2 = 0;

        int abbruch = 0;

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        do
        {


            System.out.println("Spieler X, gebe deine Koordinate ein:");


            System.out.println("Zum Weiterspielen drücken Sie 1, zum Abbrechen 0.");

            abbruch = scanner.nextInt();

        }while(abbruch == 1 );



    }
}
