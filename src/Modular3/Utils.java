package Modular3;

public class  Utils {
    public static double miles2kilometres(double millas) {
        return millas * 1.609;
    }

    public static double getTaxes(double euros, double tax) {
        return euros * (tax / 100);
    }

    public static  double getNetPrice(double euros, double tax) {
        double impuesto = euros * (tax / 100);
        return euros + impuesto;
    }

    public static char getLetraDNI(int dni) {
        int letraDNI = dni % 23;
        switch (letraDNI) {
            case 0: return 'T';
            case 1: return 'R';
            case 2: return 'W';
            case 3: return 'A';
            case 4: return 'G';
            case 5: return 'M';
            case 6: return 'Y';
            case 7: return 'F';
            case 8: return 'P';
            case 9: return 'D';
            case 10: return 'X';
            case 11: return 'B';
            case 12: return 'N';
            case 13: return 'J';
            case 14: return 'Z';
            case 15: return 'S';
            case 16: return 'Q';
            case 17: return 'V';
            case 18: return 'H';
            case 19: return 'L';
            case 20: return 'C';
            case 21: return 'K';
            case 22: return 'E';
            default: System.out.println("El DNI no es valido");
        }
        return '?';
    }

    public static boolean isValidNIF(int dni) {
        int counter = 0;
        while (dni >= 1) {
            dni = dni / 10;
            counter++;
        }
        if (counter != 8) { return false; }
        else return true;


    }

}
