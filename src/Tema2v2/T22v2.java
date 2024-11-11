package Tema2v2;

import java.util.Scanner;

public class T22v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.println("Introduce");
        num = scan.nextInt();

        while (num > 1) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
