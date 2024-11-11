package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Jugador1, Jugador2;

        /*Existen las clases Caballero, Arquero, Mago, Asesino, Alquimista
        Los stats son VEL, ATQ, HP, DEF*/

        int Caballero, CabVEL, CabATQ, CabHP, CabDEF;
        int Arquero, ArqVEL, ArqATQ, ArqHP, ArqDEF;
        int Mago, MagVEL, MagATQ, MagHP, MagDEF;
        int Alquimista, AlqVEL, AlqATQ, AlqHP, AlqDEF;
        int Asesino, AseVEL, AseATQ, AseHP, AseDEF;

        String inputJugar;

        System.out.println("Introduzca si para empezar");
        inputJugar = scan.next();

        if (inputJugar.equals("Si")) {
            System.out.println("BIENVENIDOS A ESTE DUELO A MUERTE, A CONTINUACIÓN SE OS PRESENTARÁ LOS PERSONAJES DISPONIBLES");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Caballero");
            System.out.println("El caballero es un guerrero pesado con armadura completa y espada o lanza. Especialista en ataques cuerpo a cuerpo y defensa.");


        } else {
            System.out.println("Una pena que no quieras jugar.");


        }
    }
}
