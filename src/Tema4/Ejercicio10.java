package Tema4;


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in)
        int option;
        System.out.println("1.Perimetros y areas\n" +
                           "2. Primo \n" +
                           "3. No Primo\n" +
                           "4. Digitos pares\n" +
                           "5. Digitos impares\n" +
                           "6. Factorial\n" +
                           "7. Factorial v2\n" +
                           "8. Ecuacion 2do grado\n" +
                           "9. Suma");

        option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Introduce radio");
                double radio = scan.nextDouble();

                System.out.println("Introduce lado");
                double lado = scan.nextDouble();

                System.out.println("Introduce ancho");
                double anchura = scan.nextDouble();

                double perimetroCuadrado = MyMath.squarePerimeter(lado);
                double perimetroCirculo  = MyMath.circlePerimeter(radio);
                double perimetroRectangulo = MyMath.rectanglePerimeter(lado, anchura);

                double areaCuadrado = MyMath.squareArea(radio);
                double areaCirculo = MyMath.circleArea(radio);
                double areaRectangulo = MyMath.rectangleArea(lado, anchura);

                System.out.println("Perimetro del cuadrado " + perimetroCuadrado + " Perimetro del circulo " + perimetroCirculo + " Perimetro del rectangulo " + perimetroRectangulo);
                System.out.println("Area del cuadrado " + areaCuadrado + " Area del circulo " + areaCirculo + " Area del rectangulo " + areaRectangulo);

            case 2:
                System.out.println("Introduce un numero");
                int num = scan.nextInt();
                boolean esprimo = MyMath.primoChecker(num);
                if (esprimo) {
                    System.out.println("Es primo");
                } else {
                    System.out.println("No es primo");
                }
        }






    }
}
