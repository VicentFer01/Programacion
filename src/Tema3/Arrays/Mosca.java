package Tema3.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Mosca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int moscaPos = random.nextInt(15);
        boolean moscaAtrapada = false;



        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        do {
            System.out.println("Introduce una posicion (1-15)");
            int pos = scan.nextInt();
            System.out.println(Arrays.toString(array));

        if (pos == moscaPos) {
            System.out.println("¡Has atrapado a la mosca!");
            moscaAtrapada = true;
        } else if (pos == moscaPos + 1 || pos == moscaPos - 1) {
            System.out.println("Casi la atrapas, la mosca se ha movido.");
            moscaPos = random.nextInt(15);

        } else {
            System.out.println("No atrapaste a la mosca. Sigue intentando.");
        }
        } while (moscaAtrapada == false);






    }


}
