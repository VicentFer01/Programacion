package Tema3;

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
    public static void tabla1() {
        System.out.println("Tabla del 1");
        System.out.println("1 * 1 = 1");
        System.out.println("1 * 2 = 2");
        System.out.println("1 * 3 = 3");
        System.out.println("1 * 4 = 4");
        System.out.println("1 * 5 = 5");
        System.out.println("1 * 6 = 6");
        System.out.println("1 * 7 = 7");
        System.out.println("1 * 8 = 8");
        System.out.println("1 * 9 = 9");
        System.out.println("1 * 10 = 10");
        System.out.println();
    }

    public static void tabla2() {
        System.out.println("Tabla del 2");
        System.out.println("2 * 1 = 2");
        System.out.println("2 * 2 = 4");
        System.out.println("2 * 3 = 6");
        System.out.println("2 * 4 = 9");
        System.out.println("2 * 5 = 10");
        System.out.println("2 * 6 = 12");
        System.out.println("2 * 7 = 14");
        System.out.println("2 * 8 = 16");
        System.out.println("2 * 9 = 18");
        System.out.println("2 * 10 = 20");
        System.out.println();
    }

    public static void tabla3() {
        System.out.println("Tabla del 3");
        System.out.println("3 * 1 = 3");
        System.out.println("3 * 2 = 6");
        System.out.println("3 * 3 = 9");
        System.out.println("3 * 4 = 12");
        System.out.println("3 * 5 = 15");
        System.out.println("3 * 6 = 18");
        System.out.println("3 * 7 = 21");
        System.out.println("3 * 8 = 24");
        System.out.println("3 * 9 = 27");
        System.out.println("3 * 10 = 30");
        System.out.println();
    }

    public static void tabla4() {
        System.out.println("Tabla del 4");
        System.out.println("4 * 1 = 4");
        System.out.println("4 * 2 = 8");
        System.out.println("4 * 3 = 12");
        System.out.println("4 * 4 = 16");
        System.out.println("4 * 5 = 20");
        System.out.println("4 * 6 = 24");
        System.out.println("4 * 7 = 28");
        System.out.println("4 * 8 = 32");
        System.out.println("4 * 9 = 36");
        System.out.println("4 * 10 = 40");
        System.out.println();
    }

    public static void tabla5() {
        System.out.println("Tabla del 5");
        System.out.println("5 * 1 = 5");
        System.out.println("5 * 2 = 10");
        System.out.println("5 * 3 = 15");
        System.out.println("5 * 4 = 20");
        System.out.println("5 * 5 = 25");
        System.out.println("5 * 6 = 30");
        System.out.println("5 * 7 = 35");
        System.out.println("5 * 8 = 40");
        System.out.println("5 * 9 = 45");
        System.out.println("5 * 10 = 50");
        System.out.println();
    }

    // Ejercicio 7

        public static boolean esPrimo(int num) {
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
    }


