package Modular3;

public class Utils {
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

}
