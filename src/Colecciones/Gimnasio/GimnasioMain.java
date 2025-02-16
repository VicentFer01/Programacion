package Colecciones.Gimnasio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GimnasioMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Usuario> personas = new HashMap<>();
        int eleccion;

        do {
            System.out.println();
            System.out.println("1. Dar de alta usuario \n" +
                    "2. Dar de baja usuario \n" +
                    "3. Mostrar datos usuarios \n" +
                    "4. Modificar usuario");

            System.out.println();
            System.out.print("Elige una opcion: ");
            eleccion = scan.nextInt();

            switch (eleccion) {
                case 1:
                    anyadirUser(personas);
                    break;
                case 2:
                    bajaUser(personas);
                    break;
                case 3:
                    mostrarUsuario(personas);
                    break;
                case 4:
                    break;
                    editarUser(personas);
            }

    } while (eleccion != 5);
}

    private static void editarUser(Map<String, Usuario> personas) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce tu dni ");
        String dni = scan.next();

        if (personas.containsKey(dni)) {
            System.out.println("Introduce tu edad actualizada");
            Usuarios user =

        }



    }


    private static void anyadirUser(Map <String, Usuario> personas) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu nombre ");
        String nombre = scan.next();

        System.out.print("Introduce tu edad ");
        int edad = scan.nextInt();

        System.out.print("Introduce tu dni ");
        String dni = scan.next();

        Usuario user = new Usuario(nombre, edad);

        if (personas.containsKey(dni)) {
            System.out.println("El dni ya está regitrado");
            } else { personas.put(dni, user);
        }

        System.out.println();
        System.out.println("Bienvenido a nuetro gimnasio");


    }

    private static void bajaUser(Map<String, Usuario> personas) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu dni");
        String dni = scan.next();

        if (personas.containsKey(dni)) {
            personas.remove(dni);
            System.out.println("Persona dada de baja");
        } else {
            System.out.println("Este dni no está registrado");
        }

    }

    private static void mostrarUsuario(Map<String, Usuario> personas) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu dni");
        String dni = scan.next();

        if (personas.containsKey(dni)) {
            System.out.println(personas.get(dni));

        }
    }
}
