package Tema1;

public class Tema1Ejercicio5 {
    public static void main(String[] args) {

        int op1 = 24 % 5;
        System.out.println("El modulo de 24 % 5 es " +  op1 );

        double op2 = ((double) 7 /2) + 2.5;
        System.out.println("La operación de 7/2 + 2.5 da " + op2);

        double op3 = (10.8/2) + 2;
        System.out.println("La operacion de 10.8/2 + 2 da " + op3);

        double op4 = (4+6) * 3 + 2 * (5-1);
        System.out.println("La operación (4+6) * 3 + 2 * (5-1) da " + op4);

        double op5 = (5/2) + 17 % 3;
        System.out.println("La operacion (5/2) + 17 % 3 da  " + op5);

        boolean op6 = 7 >= 5 || 27 != 8;
        System.out.println("El booleano 7 >= 5 || 27 != 8 es " + op6);

        boolean op7 = (45 <= 7) == !  (5>=7);
        System.out.println("El booleano (45 <= 7) || !=  (5>=7) es  " + op7);

        double op8 = (27 % 4) + 15/4;
        System.out.println("La operación (27 % 4) + 15/4 da " + op8);

        double op9 = 37/4 * 4 - 2;
        System.out.println("La operación 37/4 * 4 - 2; da " + op9);

        boolean op10 = (25>=7) && ! (7 <=2);
        System.out.println("El booleano (25>=7) && ! (7 <=2) es  " + op10);

        boolean op11 = ('H' < 'J') && ('9' != '7');
        System.out.println("El booleano ('H' < 'J') && ('9' != '7') es " + op11);

        boolean op12 = 25 > 20 && 13 > 5;
        System.out.println("El booleano 25 > 20 && 13 > 5 es  " + op12);

        boolean op13 = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - (2*2);
        System.out.println("El booleano 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - (2*2) es " + op13);

        boolean op14 = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("El booleano 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1 es " + op14);

        boolean op15 = 10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("El booleano 10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1 es " + op15);

    }
}