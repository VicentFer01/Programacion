package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
     public static void main(String[] args) {
         double base, altura, superficie, perimetro;
         Scanner scan = new Scanner(System.in);
         System.out.println("Introduce el valor de la base");
         base = scan.nextDouble();
         System.out.println("Introduce el valor de la altura");
         altura = scan.nextDouble();
         superficie = (base * altura) / 2;
         System.out.println("La superficie es " + superficie);
         scan.close();


     }
}

