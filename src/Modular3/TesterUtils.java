package Modular3;

import java.util.Scanner;

public class TesterUtils {
    public static void main(String[] args) {
    System.out.println("Introduce euros");
    Scanner scan = new Scanner(System.in);
    double euros = scan.nextDouble();
    double tax = scan.nextDouble();

    double total = Utils.getNetPrice(euros, tax);
    System.out.println(total);
    }

}
