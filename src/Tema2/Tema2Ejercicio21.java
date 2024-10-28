package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {
        int counter = 0;
        int max = 1000;
        int suma = 0;

        while (counter <= max) {
            suma = suma + counter;
            counter = counter + 2;
        }

        System.out.println("La suma es " + suma);
    }
}
