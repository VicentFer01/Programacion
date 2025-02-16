package Colecciones.ListaCompra;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ListaCompraMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String producto;

        Set<String> lista = new HashSet<>();


        System.out.println("Intrdouce los productos, introduce 1 para salir");
        boolean bucleAnyadir = true;

        while (bucleAnyadir) {
            producto = scan.next();

            if (producto.equals("1")) {
                bucleAnyadir = false;
            } else if (lista.contains(producto)) {
                System.out.println("No puedes añadir el mismo producto");
            } else {
                lista.add(producto);
            }

        }

        System.out.println("Estas es tu lista de la compra" + lista);

    }

}
