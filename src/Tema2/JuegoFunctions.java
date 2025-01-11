package Tema2;

public class JuegoFunctions {



    public static int calculateP1Defense(int p2pen, int p1def) {
        return p1def - p2pen;

    }

    public static int calculateP2Defense(int p1pen, int p2def) {
        return p2def - p1pen;

    }

    public static double calculateP1Danyobase(int player1ATQ, int player2DEF) {
        return player1ATQ - player2DEF;
    }

    public static double calculateP2Danyobase(int player2ATQ, int player1DEF) {
        return player2ATQ - player1DEF;
    }

    public static int calculateP1HP(int player1HP, int danyobase) {

        return player1HP - danyobase;
    }


    public static int calculateP2HP(int player2HP, int danyobase) {

        return player2HP - danyobase;
    }

    public static boolean esCriticoP1(double randomNumber, double player1crit) {
        if (randomNumber < player1crit) {
            System.out.println("Golpe crítico!");
            return true;
        }
        return false;
    }


    public static boolean esCriticoP2(double randomNumber, double player2crit) {
        if (randomNumber < player2crit) {
            System.out.println("Golpe crítico!");
            return true;
        }
        return false;
    }

    public static double danyocriticoP1(double danyobase, double danyocritico) {
        return danyobase * danyocritico;

    }

    public static double danyocriticoP2(double danyobase, double danyocritico) {
        return danyobase * danyocritico;

    }




}
