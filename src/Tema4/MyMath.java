package Tema4;

public class MyMath {
    public static double squarePerimeter(double lado) {
        return lado * 4;

    }

    public static double squareArea(double radio) {
        return 3.14 * radio * radio;

    }

    public static double rectanglePerimeter(double lado, double anchura) {
        return 2 * (lado + anchura);

    }

    public static double rectangleArea(double lado, double anchura) {
        return lado * anchura;

    }

    public static double circlePerimeter(double radio) {
        return 2 * 3.14 * radio;

    }

    public static double circleArea(double radio) {
        return 3.14 * radio * radio;

    }


    public static boolean primoChecker(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        int raiz = (int) Math.sqrt(num);
        for (int i = 3; i <= raiz; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean noPrimoChecker(int num) {
        return !primoChecker(num);
    }

    public static int digitCounter(int num) {
        int counter = 0;
        while (num >= 1) {
            num = num / 10;
            counter++;
        }
        return counter;
    }

    public static int enteroParReader(int num) {
        int counter = 0;
        while (num >= 1) {
            if (num % 2 == 0) {
                num = num / 10;
                counter++;
            }
        }
        return counter;

    }

    public static int enteroImparReader(int num) {
        int counter = 0;
        while (num >= 1) {
            if (num % 2 != 0) {
                num = num / 10;
                counter++;
            }
        }
        return counter;

    }





    public static int calcularFactorial(int num) {
        int fact = 0;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}