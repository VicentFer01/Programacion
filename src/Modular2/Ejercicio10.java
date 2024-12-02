package Modular2;


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            case 3:
                System.out.println("Introduce un numero");
                num = scan.nextInt();
                boolean noEsPrimo = MyMath.noPrimoChecker(num);
                if (noEsPrimo) {
                    System.out.println("No es primo");
                } else {
                    System.out.println("Es primo");
                }
            case 4:
                System.out.println("Introduce un numero");
                num = scan.nextInt();
                int pares = MyMath.enteroParReader(num);
                System.out.println(pares);
            case 5:
                System.out.println("Introduce un numero");
                num = scan.nextInt();
                int impares = MyMath.enteroImparReader(num);
                System.out.println(impares);
            case 6:
                System.out.println("Introduce un numero");
                num = scan.nextInt();
                int factorial = MyMath.calcularFactorial(num);
                System.out.println(factorial);
            case 7:
                System.out.println("Introduce un numero");
                num = scan.nextInt();
                int factorial2 = MyMath.calcularFactorial2(num);
                System.out.println(factorial2);
            case 8:
                System.out.println("Introduce el primer coeficiente");
                int num1 = scan.nextInt();
                System.out.println("Introduce el segundo coeficiente");
                int num2 = scan.nextInt();
                System.out.println("Introduce el tercero coeficiente");
                int num3 = scan.nextInt();
                int discriminante = MyMath.calcularDiscriminante(num1, num2, num3);
                System.out.println(discriminante);
            case 9:
                System.out.println("Introduce el entero");
                num = scan.nextInt();
                int suma = MyMath.suma(num);
                System.out.println(suma);
                break;
        }






    }
}
