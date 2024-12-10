package Modular2;

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
        /*
        if (num % 2 == 0) {
            return false;
        }

         */

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
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            num /= 10;
        }
        return counter;

    }

    public static int enteroImparReader(int num) {
        int counter = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                counter++;
            }
            num /= 10;
        }
        return counter;

    }


    public static int calcularFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static int calcularFactorial2(int num) {
        int fact;

        if (num == 0) return 1;
        else {
            return num * calcularFactorial(num - 1);
        }
    }

    public static int calcularDiscriminante(double num1, double num2, double num3) {
        double discriminante = num2 * num2 - 4 * (num1) + 4 * (num3);
        if (discriminante > 1) {
            return 2;
        } else if (discriminante < 0) {
            return 0;
        } else return 1;

    }

    public static int suma(int num) {
        int counter = 0;
        while (num > 0) {
            counter += num % 10;
            num = num / 10;
        }
        return counter;


    }



}