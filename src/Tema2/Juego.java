package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int player1PJ, player2PJ;
        int player1PJelection, player2PJelection;
        int turn;

        /*Existen las clases Caballero, Arquero, Mago, Asesino, Alquimista
        Los stats son VEL, ATQ, HP, DEF*/

        int Caballero = 1, Arquero = 2, Mago = 3, Asesino = 4, Alquimista = 5;

        int CaballeroVEL = 50, CaballeroATQ = 20, CaballeroHP = 100, CaballeroDEF = 50;
        int ArqueroVEL = 80, ArqueroATQ = 35, ArqueroHP = 70, ArqueroDEF = 30;
        int MagoVEL = 60, MagoATQ = 30, MagoHP = 80, MagoDEF = 40;
        int AsesinoVEL = 90, AsesinoATQ = 45, AsesinoHP = 70, AsesinoDEF = 30;
        int AlquimistaVEL = 65, AlquimistaATQ = 35, AlquimistaHP = 80, AlquimistaDEF = 50;

       int player1VEL = 0, player1ATQ, player1HP = 0, player1DEF;
       int player2VEL = 0, player2ATQ, player2HP = 0, player2DEF;



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
            switch (player1PJelection) {
                case 1:
                    System.out.println("Has elegido al caballero!");
                    player2PJ = Caballero;
                    break;
                case 2:
                    System.out.println("Has elegido al arquero!");
                    player2PJ = Arquero;
                    break;
                case 3:
                    System.out.println("Has elegido al mago!");
                    player2PJ = Mago;
                    break;
                case 4:
                    System.out.println("Has elegido al asesino!");
                    player2PJ = Asesino;
                    break;
                case 5:
                    System.out.println("Has elegido al arquero!");
                    player2PJ = Alquimista;
                    break;
            }

            System.out.println("Hora del combate!");

            while ( player1HP > 0 && player2HP > 0) {

                if (player1VEL > player2VEL) {
                    System.out.println("El jugador 1 comienza primero (> VEL)");
                    System.out.println("Utiliza tu turno");

                    switch (player1PJelection) {
                        case 1:
                            System.out.println("Habilidades");
                            System.out.println("1. Ataque basico.");
                            System.out.println("2. Usar poción de vida (3x)");
                            System.out.println("3. Habilidad única (1x)");


                        case 2:
                            System.out.println("Habilidades");
                            System.out.println("1. Ataque basico");
                            System.out.println("2. Usar pocion de vida (4x)");
                            System.out.println("3. Habilidad unica");

                        case 3:
                            System.out.println("Habilidades");
                            System.out.println("1. Ataque basico");
                            System.out.println("2. Usar pocion de vida 5x)");
                            System.out.println("3. Habilidad unica");

                        case 4:
                            System.out.println("Habilidades");
                            System.out.println("1. Ataque basico");
                            System.out.println("2. Usar pocion de vida 3x)");
                            System.out.println("3. Habilidad unica");

                        case 5:
                            System.out.println("Habilidades");
                            System.out.println("1. Ataque basico");
                            System.out.println("2. Usar pocion de vida 5x)");
                            System.out.println("3. Habilidad unica");
                    }

                }
            }


        } else {
            System.out.println("Una pena que no quieras jugar.");
        }
    }
}

