public class PrimerosPrimos {
    public static void main(String[] args) {
        int cantidadPrimos = 20;
        int contador = 0;
        int numero = 2; // Comenzamos desde el primer primo

        while (contador < cantidadPrimos) {
            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false; // 0 y 1 no son primos
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
