package Tema2v2;

public class T21v2 {
    public static void main(String[] args) {
        int count;
        int suma = 0;

        for ( count = 0; count <= 1000; count += 2) {
            suma += count;
            count = count + 2;


        }
        System.out.println("Es" + count);


    }
}
