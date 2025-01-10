package Tema3;

import java.util.Arrays;
import java.util.Scanner;


public class Wifi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hab;
        do {
            System.out.print("Introduce el numero de la  habitación");
            hab = scan.nextInt();

        } while (hab >= 20 || hab <= 1);


        System.out.print("Introduce la potencia de señal");
        int senyal = scan.nextInt();

        int[] array = new int[20];

        switch (senyal) {
            case 1:


                break;
            case 2:

                break;
            case 3:

                break;

            case 4:
                array[hab] = 4;

                for (int i = 0; i <= array[hab]; i++) {
                    if (hab - i >= 0) {
                        array[hab - 1] = array[hab] - 1;
                        hab--;
                    }
                }
                hab = array[hab];
                for (int z = 0; z + array[hab] <= array.length; z++) {

                    if (array[hab] + z  <= array.length)
                    {   array[hab + 1] = array[hab] - 1;
                        hab++;
                    }
                }


                    System.out.println(Arrays.toString(array));


                    break;
                    case 5:

                        break;
                    case 6:


                }


        }


    }



