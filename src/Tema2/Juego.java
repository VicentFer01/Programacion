package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int player1PJ, player2PJ;
        int player1PJelection, player2PJelection;
        int turn = 0;
        int turn1, turn2, turn3, danyobase;

        /*Existen las clases Caballero, Arquero, Mago, Asesino, Alquimista
        Los stats son VEL, ATQ, HP, DEF*/

        int Caballero = 1, Arquero = 2, Mago = 3, Asesino = 4, Alquimista = 5;

        int CaballeroVEL = 50, CaballeroATQ = 50, CaballeroHP = 100, CaballeroDEF = 30;
        int ArqueroVEL = 80, ArqueroATQ = 55, ArqueroHP = 70, ArqueroDEF = 20;
        int MagoVEL = 60, MagoATQ = 40, MagoHP = 80, MagoDEF = 20;
        int AsesinoVEL = 90, AsesinoATQ = 45, AsesinoHP = 70, AsesinoDEF = 20;
        int AlquimistaVEL = 65, AlquimistaATQ = 35, AlquimistaHP = 80, AlquimistaDEF = 10;

       int player1VEL = 0, player1ATQ, player1HP = 0, player1DEF = 0;
       int player2VEL = 0, player2ATQ, player2HP = 0, player2DEF = 0;



        String inputJugar;

        System.out.println("Introduzca si para empezar");
        inputJugar = scan.next();

        if (inputJugar.equals("Si")) {
            System.out.println("BIENVENIDOS A ESTE DUELO A MUERTE, A CONTINUACIÓN SE OS PRESENTARÁ LOS PERSONAJES DISPONIBLES");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Caballero");
            System.out.println("Estadisticas");
            System.out.println("VEL: 50 HP: 100 ATQ: 20 DEF: 50 ");
            System.out.println("Habilidades");
            System.out.println("1. Ataque basico.");
            System.out.println("2. Usar poción de vida (3x)");
            System.out.println("3. Habilidad única (1x)");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Arquero");
            System.out.println("Estadisticas");
            System.out.println("VEL: 80 HP: 70 ATQ: 35 DEF: 30 ");
            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida (4x)");
            System.out.println("3. Habilidad unica");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Mago");
            System.out.println("Estadisticas");
            System.out.println("VEL: 60 HP: 80 ATQ: 30 DEF: 40 ");
            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 5x)");
            System.out.println("3. Habilidad unica");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("Asesino");
            System.out.println("Estadisticas");
            System.out.println("VEL: 90 HP: 70 ATQ: 45 DEF: 30 ");
            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 3x)");
            System.out.println("3. Habilidad unica");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Alquimista");
            System.out.println("Estadisticas");
            System.out.println("VEL: 65 HP: 80 ATQ: 35 DEF: 50 ");
            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 5x)");
            System.out.println("3. Habilidad unica");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Es hora de elegir personajes. Introduce el numero del personaje que desees");
            System.out.println("1. Caballero");
            System.out.println("2. Arquero");
            System.out.println("3. Mago");
            System.out.println("4. Asesino");
            System.out.println("5. Alquimista");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Jugador 1 elige tu personaje");
            player1PJelection = scan.nextInt();
            switch (player1PJelection) {
                case 1:
                    System.out.println("Has elegido al caballero!");
                    player1PJ = Caballero;

                    player1ATQ = CaballeroATQ;
                    player1VEL = CaballeroVEL;
                    player1DEF = CaballeroDEF;
                    player1HP = CaballeroHP;
                    break;
                case 2:
                    System.out.println("Has elegido al arquero!");
                    player1PJ = Arquero;

                    player1ATQ = ArqueroATQ;
                    player1VEL = ArqueroVEL;
                    player1DEF = ArqueroDEF;
                    player1HP = ArqueroHP;
                    break;
                case 3:
                    System.out.println("Has elegido al mago!");
                    player1PJ = Mago;

                    player1ATQ = MagoATQ;
                    player1VEL = MagoVEL;
                    player1DEF = MagoDEF;
                    player1HP = MagoHP;
                    break;
                case 4:
                    System.out.println("Has elegido al asesino!");
                    player1PJ = Asesino;

                    player1ATQ = AsesinoATQ;
                    player1VEL = AsesinoVEL;
                    player1DEF = AsesinoDEF;
                    player1HP = AsesinoHP;
                    break;
                case 5:
                    System.out.println("Has elegido al alquimista!");
                    player1PJ = Alquimista;

                    player1ATQ = AlquimistaATQ;
                    player1VEL = AlquimistaVEL;
                    player1DEF = AlquimistaDEF;
                    player1HP = AlquimistaHP;
                    break;
            }

            System.out.println("Jugador 2 elige tu personaje");
            player2PJelection = scan.nextInt();
            switch (player2PJelection) {
                case 1:
                    System.out.println("Has elegido al caballero!");
                    player2PJ = Caballero;

                    player2ATQ = CaballeroATQ;
                    player2VEL = CaballeroVEL;
                    player2DEF = CaballeroDEF;
                    player2HP = CaballeroHP;
                    break;
                case 2:
                    System.out.println("Has elegido al arquero!");
                    player2PJ = Arquero;

                    player2ATQ = ArqueroATQ;
                    player2VEL = ArqueroVEL;
                    player2DEF = ArqueroDEF;
                    player2HP = ArqueroHP;
                    break;
                case 3:
                    System.out.println("Has elegido al mago!");
                    player2PJ = Mago;

                    player2ATQ = MagoATQ;
                    player2VEL = MagoVEL;
                    player2DEF = MagoDEF;
                    player2HP = MagoHP;
                    break;
                case 4:
                    System.out.println("Has elegido al asesino!");
                    player2PJ = Asesino;

                    player2ATQ = AsesinoATQ;
                    player2VEL = AsesinoVEL;
                    player2DEF = AsesinoDEF;
                    player2HP = AsesinoHP;
                    break;
                case 5:
                    System.out.println("Has elegido al arquero!");
                    player2PJ = Alquimista;

                    player2ATQ = AlquimistaATQ;
                    player2VEL = AlquimistaVEL;
                    player2DEF = AlquimistaDEF;
                    player2HP = AlquimistaHP;
                    break;
            }

            System.out.println("Hora del combate!");

            while ( player1HP > 0 && player2HP > 0) {

                if (player1VEL > player2VEL) {
                    System.out.println("Turno del jugador 1)");
                    System.out.println("Utiliza tu turno");
                    System.out.println("Habilidades");
                    System.out.println("1. Ataque basico.");
                    System.out.println("2. Usar poción de vida (3x)");
                    System.out.println("3. Habilidad única (1x)");

                    turn = scan.nextInt();
                    switch (turn) {
                        case 1:
                            System.out.println("1. Ataque basico.");
                            danyobase = CaballeroATQ - player2DEF;
                            player2HP = player2HP - danyobase;
                            System.out.println("El daño base es " + danyobase + " puntos de vida, el enemigo tiene ahora "+ player2HP);
                            break;
                        case 2:
                            System.out.println("2. Usar poción de vida");
                            break;
                        case 3:
                            System.out.println("3. Habilidad única");
                            break;


                    }
                }
                else {
                    System.out.println();
                    System.out.println();

                    System.out.println("Turno del jugador 2");
                    System.out.println("Utiliza tu turno");
                    System.out.println("Habilidades");
                    System.out.println("1. Ataque basico.");
                    System.out.println("2. Usar poción de vida (3x)");
                    System.out.println("3. Habilidad única (1x)");
                    turn = scan.nextInt();
                    switch (turn) {
                        case 1:
                            System.out.println("1. Ataque basico.");
                            danyobase = CaballeroATQ - player1DEF;
                            player1HP = player1HP - danyobase;
                            System.out.println("El daño base es " + danyobase + " puntos de vida, el enemigo tiene ahora "+ player1HP);
                            break;
                        case 2:
                            System.out.println("2. Usar poción de vida");
                            break;
                        case 3:
                            System.out.println("3. Habilidad única");
                            break;
                    }

                }
            }


        } else {
            System.out.println("Una pena que no quieras jugar.");
        }
    }
}

