package Modular1;

public class Libreria {

    public class Libreria1 {


        public static int numberSign(double numero) {
            if (numero > 0) {
                return 1;
            } else if (numero < 0) {
                return -1;
            } else {
                return 0;
            }
        }

        public static boolean isAdult(int edad) {
            if (edad > 18) {
                return true;
            } else {
                return false;
            }
        }


// Ej3

        public static boolean validRadius(double radio) {
            if (radio > 0) return true;
            else return false;
        }

        public static double calculateCirclePerimeter(double radio) {

            return 2 * 3.14 * radio;
        }

        public static double calculateCircleArea(double radio) {
            return 3.14 * (radio * radio);
        }


//Ej 4

        public static void showMenu() {
            System.out.println("1.Pasar de euros a dolares");
            System.out.println("2.Pasar de dolares a euros");
            System.out.println("3.Salir");
        }

        public static double euro2dollar(double totaleuros) {
            return totaleuros * 1.04;

        }

        public static double dollar2euro(double totaldollar) {
            return totaldollar * 0.96;

        }

    }


    // Ej 5
    public static int tabla1(int tabla) {
        int counter, result = 0;
       for (counter = 1; counter <= 10; counter++) {
           result = 1 * counter;
           System.out.println(result);
       }
       return result;
    }

    public static int tabla2(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 2 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla3(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 3 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla4(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 4 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla5(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 5 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla6(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 6 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla7(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 7 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla8(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 8 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla9(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 9 * counter;
            System.out.println(result);

        }
        return result;
    }

    public static int tabla10(int tabla) {
        int counter, result = 0;
        for (counter = 1; counter <= 10; counter++) {
            result = 10 * counter;
            System.out.println(result);

        }
        return result;
    }



    public static void mostrarTablasDel1Al10() {
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Tabla del " + counter + ":");
            for (int num = 1; num <= 10; num++) {
                System.out.println(counter + " x " + num + " = " + (counter * num));
            }
            System.out.println();
        }
    }



    public static boolean esBisiesto(int anyo, int mes, int dia) {

        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }



    // Ejercicio 7

        public static boolean esPrimo(int num) {
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
    }


