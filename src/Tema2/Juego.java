package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // player input eleccion Personajes //
        int player1PJelection = 0, player2PJelection = 0;

        // Rondas y operaciones //
        int turn, danyobase;


        // Stats Clases//
        int CaballeroVEL = 45, CaballeroATQ = 50, CaballeroHP = 120, CaballeroHPmax = 120, CaballeroDEF = 30, CaballeroHPregen = 15;
        double CaballeroCritChance = 0.35, CaballeroArmorPen = 10;

        int ArqueroVEL = 85, ArqueroATQ = 50, ArqueroHP = 65, ArqueroHPmax = 65, ArqueroDEF = 15, ArqueroHPregen = 10;
        double ArqueroCritChance = 0.35, ArqueroArmorPen = 10;

        int MagoVEL = 55, MagoATQ = 45, MagoHP = 80, MagoHPmax = 80, MagoDEF = 20, MagoHPregen = 100;
        double MagoCritChance = 0.35, MagArmorPen = 10;

        int AsesinoVEL = 95, AsesinoATQ = 55, AsesinoHP = 60,  AsesinoHPmax = 60, AsesinoDEF = 15, AsesinoHPregen = 15;
        double AsesinoCritChance = 0.35, AsesinoArmorPen = 10;

        int AlquimistaVEL = 70, AlquimistaATQ = 35, AlquimistaHP = 80, AlquimistaHPmax = 80, AlquimistaDEF = 15, AlquimistaHPregen = 15;
        double AlquimistaCritChance = 0.35, AlquimistaArmorPen = 10;


        // Frases Atacar //
        String CabFrase = "Por el honor y la justicia!";
        String ArqFrase = "¡No escaparás de mis flechas!";
        String MagFrase = "¡Que el poder arcano te consuma!";
        String AseFrase = "No verás el próximo amanecer";
        String AlqFrase = "¡Mis fórmulas nunca fallan!";

        String frasePlayer1 = "";
        String frasePlayer2 = "";


        // Pociones //
        int potimaxCab = 3;
        int potimaxArq = 4;
        int potimaxMag = 4;
        int potimaxAse = 4;
        int potimaxAlq = 5;

        int potimaxPlayer1 = 0, potimaxPlayer2 = 0;
        int potiPlayer1 = 0, potiPlayer2 = 0; //Esto es el counter de pociones//
        final int potiheal = 40;

        // Habilidades //
        int player1ABIL = 0;
        int player2ABIL = 0;

        String player1ABILs = "";
        String player2ABILs = "";

        int player1ABILcab = 0, player1ABILarq = 0, player1ABILmag = 0, player1ABILase = 0, player1ABILalq = 0;
        int player2ABILcab = 0, player2ABILarq = 0, player2ABILmag = 0, player2ABILase = 0, player2ABILalq = 0;

        String CabABIL = "Muro de Hierro";
        String ArqABIL = "Disparo Preciso";
        String MagABIL = "Explosión Arcana";
        String AseABIL = "Sombra Letal";
        String AlqABIL = "Pocion Mortal";


        // Stats del jugador (se otorgan al elegir clase)
        int player1VEL = 0, player1ATQ = 0, player1HP = 0, player1HPmax = 0, player1DEF = 0, player1HPregen = 0;
        double player1PEN = 0, player1Crit = 0;

        int player2VEL = 0, player2ATQ = 0, player2HP = 0, player2HPmax = 0, player2DEF = 0,player2HPregen = 0;
        double player2PEN = 0, player2Crit = 0;


        System.out.println("Introduzca 'Si' para empezar");
        String inputJugar = scan.next();

        if (inputJugar.equalsIgnoreCase("Si")) {
            System.out.println(" ____  _                            \n" +
                    "| __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  ___| |\n" +
                    "|  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __| |\n" +
                    "| |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\_|\n" +
                    "|____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___(_)");
            System.out.println();
            System.out.println();
            System.out.println("El combate está a punto de empezar, a continuación se presentara los personajes disponibles");
            System.out.println();
            System.out.println();
            System.out.println("Caballero");
            System.out.println("  \n" +
                    "             .--.\n" +
                    "            /.--.\\\n" +
                    "            |====|\n" +
                    "            |`::`|\n" +
                    "        .-;`\\..../`;_.-^-._\n" +
                    " /\\\\   /  |...::..|`   :   `|\n" +
                    " |:'\\ |   /'''::''|   .:.   |\n" +
                    "@|\\ /\\;-,/\\   ::  |..:::::..|\n" +
                    "`||\\ <` >  >._::_.| ':::::' |\n" +
                    " || `\"\"`  /   ^^  |   ':'   |\n" +
                    " ||       |       \\    :    /\n" +
                    " ||       |        \\   :   /\n" +
                    " ||       |___/\\___|`-.:.-`\n" +
                    " ||        \\_ || _/    `\n" +
                    " ||        |  ||  |\n");

            System.out.println("Habilidades");
            System.out.println("1. Ataque basico.");
            System.out.println("2. Usar poción de vida (3x)");
            System.out.println("3. Habilidad única (1x)");
            System.out.println();

            System.out.println("Arquero");
            System.out.println(
                            "           4   \".                                        \n" +
                            "           4    ^.                                       \n" +
                            "           4     $                                       \n" +
                            "           4     'b                                      \n" +
                            "           4      \"b.                                    \n" +
                            "           4        $                                    \n" +
                            "           4        $r                                   \n" +
                            "           4        $F                                   \n" +
                            "-$b========4========$b====*P=-                           \n" +
                            "           4       *$$F                                  \n" +
                            "           4        $$\"                                  \n" +
                            "           4       .$F                                   \n" +
                            "           4       dP                                    \n" +
                            "           4      F                                      \n" +
                            "           4     @                                       \n" +
                            "           4    .                                        \n" +
                            "           J.                                            \n");

            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida (4x)");
            System.out.println("3. Habilidad unica");
            System.out.println();

            System.out.println("Mago");
            System.out.println("                    ____ " +
                    "                  .'* *.'\n" +
                    "               __/_*_*(_\n" +
                    "              / _______ \\\n" +
                    "             _\\_)/___\\(_/_ \n" +
                    "            / _((\\- -/))_ \\\n" +
                    "            \\ \\())(-)(()/ /\n" +
                    "             ' \\(((()))/ '\n" +
                    "            / ' \\)).))/ ' \\\n" +
                    "           / _ \\ - | - /_  \\\n" +
                    "          (   ( .;''';. .'  )\n" +
                    "          _\\\"__ /    )\\ __\"/_\n" +
                    "            \\/  \\   ' /  \\/\n" +
                    "             .'  '...' ' )\n" +
                    "         .'   /    b    '.  '.\n" +
                    "     _.-'    /     Bb     '-. '-._ \n" +
                    " _.-'       |      BBb       '-.  '-. \n" +
                    "(________mrf\\____.dBBBb.________)____)\n");

            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 5x)");
            System.out.println("3. Habilidad unica");
            System.out.println();

            System.out.println("Asesino");
            System.out.println(
                    "⠀⠀⠳⡀⠁⠀⠀⢈⠓⠴⠾⣻⣒⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠙⢆⠠⡄⠀⠑⠒⠤⣀⡉⠙⠛⠓⠲⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠈⢦⡈⠉⠒⠢⢄⡀⠈⠑⠢⠤⠤⡤⠤⣙⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠈⠛⠑⠲⣄⠈⠒⢄⡀⠀⠀⠉⠲⢠⡭⢾⣒⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣈⠑⠦⡀⠑⢀⠀⠀⠀⠈⢆⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢯⣓⠦⣉⡳⣄⠱⡀⠀⠀⠈⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⡧⣈⠙⠻⠧⠀⠀⠀⠀⠀⠙⣦⡶⢶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢬⡑⢤⣀⠀⠀⠀⠀⠀⣠⠊⡰⠃⢉⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⢄⡉⠲⢄⣠⠞⣡⡾⠓⣠⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡱⠊⣡⠞⠃⢀⣾⣿⣿⣿⣿⣶⣤⣀⣀⡤⠦⢤⡀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢯⡐⢀⡴⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡄⡗⣒⠒⢆⡀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠉⠛⠻⢿⣿⣿⣿⣿⣿⢰⠃⡗⠒⠒⢢⠙⢤\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⢟⢃⡾⢴⡃⠀⢀⣠⠴⠞\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠓⠋⠈⠛⠋⠀⠀⠀");

            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 3x)");
            System.out.println("3. Habilidad unica");
            System.out.println();

            System.out.println("Alquimista");
            System.out.println(
                    "      (___)\n" +
                    "      <   >\n" +
                    "       ) (\n" +
                    "      /`-.\\\n" +
                    "     /     \\\n" +
                    "    / _    _\\\n" +
                    "   :,' `-.' `:\n" +
                    "   |         |\n" +
                    "   :         ;\n" +
                    "    \\       /\n" +
                    "     `.___.'");

            System.out.println("Habilidades");
            System.out.println("1. Ataque basico");
            System.out.println("2. Usar pocion de vida 5x)");
            System.out.println("3. Habilidad unica");
            System.out.println();
            System.out.println();
            System.out.println();


            System.out.println(" ____       _               _                   _      \n" +
                    "/ ___|  ___| | ___  ___ ___(_) ___  _ __     __| | ___ \n" +
                    "\\___ \\ / _ \\ |/ _ \\/ __/ __| |/ _ \\| '_ \\   / _` |/ _ \\\n" +
                    " ___) |  __/ |  __/ (_| (__| | (_) | | | | | (_| |  __/\n" +
                    "|____/ \\___|_|\\___|\\___\\___|_|\\___/|_| |_|  \\__,_|\\___|\n" +
                    " _ __   ___ _ __ ___  ___  _ __   __ _ (_) ___  ___    \n" +
                    "| '_ \\ / _ \\ '__/ __|/ _ \\| '_ \\ / _` || |/ _ \\/ __|   \n" +
                    "| |_) |  __/ |  \\__ \\ (_) | | | | (_| || |  __/\\__ \\   \n" +
                    "| .__/ \\___|_|  |___/\\___/|_| |_|\\__,_|/ |\\___||___/   \n" +
                    "|_|                                  |__/              ");
            System.out.println();
            System.out.println();
            System.out.println("1. Caballero");
            System.out.println("2. Arquero");
            System.out.println("3. Mago");
            System.out.println("4. Asesino");
            System.out.println("5. Alquimista");
            System.out.println();

            System.out.println("Jugador 1 elige tu personaje");
            player1PJelection = scan.nextInt();
            switch (player1PJelection) {
                case 1:
                    System.out.println("El jugador 1 ha elegido al caballero!, tu habilidad única es " + CabABIL);
                    player1ATQ = CaballeroATQ;
                    player1VEL = CaballeroVEL;
                    player1DEF = CaballeroDEF;
                    player1HP = CaballeroHP;
                    player1HPmax = CaballeroHPmax;
                    player1HPregen = CaballeroHPregen;
                    player1Crit = CaballeroCritChance;
                    player1PEN = CaballeroArmorPen;

                    potimaxPlayer1 = potimaxCab;

                    frasePlayer1 = CabFrase;

                    break;
                case 2:
                    System.out.println("El jugador 1 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                    player1ATQ = ArqueroATQ;
                    player1VEL = ArqueroVEL;
                    player1DEF = ArqueroDEF;
                    player1HP = ArqueroHP;
                    player1HPmax = ArqueroHPmax;
                    player1HPregen = ArqueroHPregen;
                    player1Crit = ArqueroCritChance;
                    player1PEN = ArqueroArmorPen;

                    potimaxPlayer1 =  potimaxArq;

                    frasePlayer1 = ArqFrase;


                    break;
                case 3:
                    System.out.println("El jugador 1 ha elegido al mago!, tu habilidad única es " + MagABIL);
                    player1ATQ = MagoATQ;
                    player1VEL = MagoVEL;
                    player1DEF = MagoDEF;
                    player1HP = MagoHP;
                    player1HPmax = MagoHPmax;
                    player1HPregen = MagoHPregen;
                    player1Crit = MagoCritChance;
                    player1PEN = MagArmorPen;

                    potimaxPlayer1 = potimaxMag;

                    frasePlayer1 = MagFrase;
                    break;
                case 4:
                    System.out.println("El jugador 1 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                    player1ATQ = AsesinoATQ;
                    player1VEL = AsesinoVEL;
                    player1DEF = AsesinoDEF;
                    player1HP = AsesinoHP;
                    player1HPmax = AsesinoHPmax;
                    player1HPregen = AsesinoHPregen;
                    player1Crit = AsesinoCritChance;
                    player1PEN = AsesinoArmorPen;

                    potimaxPlayer1 = potimaxAse;

                    frasePlayer1 = AseFrase;
                    break;
                case 5:
                    System.out.println("El jugador 1 ha elegido al alquimista, tu habilidad única es " + AlqABIL);
                    player1ATQ = AlquimistaATQ;
                    player1VEL = AlquimistaVEL;
                    player1DEF = AlquimistaDEF;
                    player1HP = AlquimistaHP;
                    player1HPmax = AlquimistaHPmax;
                    player1HPregen = AlquimistaHPregen;
                    player1Crit = AlquimistaCritChance;
                    player1PEN = AlquimistaArmorPen;

                    potimaxPlayer1 = potimaxAlq;

                    frasePlayer1 = AlqFrase;
                    break;
                default:
                    System.out.println("No has elegido un personaje disponible (1-5)");
            }
            System.out.println();
            System.out.println("Jugador 2 elige tu personaje");
            player2PJelection = scan.nextInt();
            switch (player2PJelection) {
                case 1:
                    System.out.println("El jugador 2 ha elegido al caballero!, tu habilidad única es " + CabABIL);
                    player2ATQ = CaballeroATQ;
                    player2VEL = CaballeroVEL;
                    player2DEF = CaballeroDEF;
                    player2HP = CaballeroHP;
                    player2HPmax = CaballeroHPmax;
                    player2HPregen = CaballeroHPregen;
                    player2Crit = CaballeroCritChance;
                    player2PEN = CaballeroArmorPen;
                    potimaxPlayer2 = potimaxCab;


                    frasePlayer2 = CabFrase;

                    break;
                case 2:
                    System.out.println("El jugador 2 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                    player2ATQ = ArqueroATQ;
                    player2VEL = ArqueroVEL;
                    player2DEF = ArqueroDEF;
                    player2HP = ArqueroHP;
                    player2HPmax = ArqueroHPmax;
                    player1HPregen = ArqueroHPregen;
                    player1Crit = ArqueroCritChance;
                    player1PEN = ArqueroArmorPen;
                    potimaxPlayer2 =  potimaxArq;

                    frasePlayer2 = ArqFrase;

                    break;
                case 3:
                    System.out.println("El jugador 2 ha elegido al mago!, tu habilidad única es " + MagABIL);
                    player2ATQ = MagoATQ;
                    player2VEL = MagoVEL;
                    player2DEF = MagoDEF;
                    player2HP = MagoHP;
                    player2HPmax = MagoHPmax;
                    player2HPregen = MagoHPregen;
                    player2Crit = MagoCritChance;
                    player2PEN = MagArmorPen;

                    potimaxPlayer1 = potimaxMag;

                    frasePlayer2 = MagFrase;
                    break;
                case 4:
                    System.out.println("El jugador 2 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                    player2ATQ = AsesinoATQ;
                    player2VEL = AsesinoVEL;
                    player2DEF = AsesinoDEF;
                    player2HP = AsesinoHP;
                    player2HPmax = AsesinoHPmax;
                    player2HPregen = AsesinoHPregen;
                    player2Crit = AsesinoCritChance;
                    player2PEN = AsesinoArmorPen;

                    potimaxPlayer2 = potimaxAse;


                    frasePlayer2 = AseFrase;

                    break;
                case 5:
                    System.out.println("El jugador 2 ha elegido al alquimista!, tu habilidad única es " + AlqABIL);
                    player2ATQ = AlquimistaATQ;
                    player2VEL = AlquimistaVEL;
                    player2DEF = AlquimistaDEF;
                    player2HP = AlquimistaHP;
                    player2HPmax = AlquimistaHPmax;
                    player2HPregen = AlquimistaHPregen;
                    player2Crit = AlquimistaCritChance;
                    player2PEN = AlquimistaArmorPen;

                    potimaxPlayer2= potimaxAlq;

                    frasePlayer2 = AlqFrase;

                    break;
                default:
                    System.out.println("No has elegido un personaje disponible (1-5)");
            }

            // Este booleano comprueba de quien es el primer turno comparando la stat VEL //
            boolean turnoJugador1 = player1VEL >= player2VEL;


            while (player1HP > 0 && player2HP > 0) {
                System.out.println();
                System.out.println();
                System.out.println();

                if (turnoJugador1) {
                    System.out.println("Turno del jugador 1");
                    System.out.println("1. Ataque básico.");
                    System.out.println("2. Usar pocion de vida.");
                    System.out.println("3. Habilidad unica");
                    turn = scan.nextInt();
                    switch (turn) {
                        case 1:
                            player2DEF = (int) (player2DEF - player1PEN);
                            danyobase = player1ATQ - player2DEF;
                            player2HP = player2HP - danyobase;
                            System.out.println();
                            System.out.println(frasePlayer1);
                            System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");
                            break;
                        case 2:
                            if (potiPlayer1 < potimaxPlayer1) {
                                player1HP += potiheal;
                                potimaxPlayer1--;

                                if ( player1HP > player1HPmax ) {
                                    System.out.println();
                                    System.out.println("No te puedes curar por encima de la vida maxima, has perdido una poción");
                                    player1HP = player1HPmax;
                                } else {
                                    System.out.println();
                                    System.out.println("Te quedan " + potimaxPlayer1 + "pociones");
                                    System.out.println("Jugador 2 se curó " + potiheal + " HP, ahora tiene " + player1HP + "HP.");
                                }

                            } else {
                                System.out.println("Jugador 1 no tiene más pociones.");
                            }
                            break;
                        case 3:
                            System.out.println("Has utilizado la habilidad " + player1ABILs);
                            break;
                    }
            } else {
                    System.out.println("Turno del jugador 2");
                System.out.println("1. Ataque básico.");
                System.out.println("2. Usar pocion de vida. ");
                System.out.println("3. Habilidad unica");
                turn = scan.nextInt();
                switch (turn) {
                    case 1:
                        player1DEF = (int) (player1DEF - player2PEN);
                        danyobase = player2ATQ - player1DEF;
                        player1HP = player1HP - danyobase;
                        System.out.println();
                        System.out.println(frasePlayer2);
                        System.out.println("Jugador 2 hizo " + danyobase + " de daño, El jugador 1 ahora tiene " + player1HP + "HP.");
                        break;
                    case 2:
                        if (potiPlayer2 < potimaxPlayer2) {
                            player2HP += potiheal;
                            potimaxPlayer2--;

                            if ( player2HP > player2HPmax ) {
                                System.out.println();
                                System.out.println("No te puedes curar por encima de la vida maxima, has perdido una poción");
                                player2HP = player2HPmax;
                            } else {
                                System.out.println();
                                System.out.println("Te quedan " + potimaxPlayer2 + "pociones");
                                System.out.println("Jugador 2 se curó " + potiheal + " HP, ahora tiene " + player2HP + "HP.");
                            }

                        } else {
                            System.out.println("Jugador 2 no tiene más pociones.");
                        }
                        break;
                        case 3:
                        System.out.println("Has utilizado la habilidad " + player2ABILs);
                        break;
                        }
                // Al acabar la ronda se curan un poco dependiendo del stat HPregen //
                    player1HP = player1HP + player1HPregen;
                    player2HP = player2HP + player2HPregen;
            }
                // Aqui se le otorga el turno al otro jugador //
                turnoJugador1 = !turnoJugador1;




            }
            System.out.println();
            System.out.println();
            System.out.println(player1HP > 0 ? "J _____ _     _                       _              _                           \n" +
                    "| ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  / |   __ _  __ _ _ __   __ _ \n" +
                    "|  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__| | |  / _` |/ _` | '_ \\ / _` |\n" +
                    "| |___| |   | | |_| | (_| | (_| | (_| | (_) | |    | | | (_| | (_| | | | | (_| |\n" +
                    "|_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_|  \\__, |\\__,_|_| |_|\\__,_|\n" +
                    "          |__/       |___/                              |___/                   " :


                    " _____ _     _                       _              ____                            \n" +
                            "| ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  |___ \\    __ _  __ _ _ __   __ _ \n" +
                            "|  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__|   __) |  / _` |/ _` | '_ \\ / _` |\n" +
                            "| |___| |   | | |_| | (_| | (_| | (_| | (_) | |     / __/  | (_| | (_| | | | | (_| |\n" +
                            "|_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_____|  \\__, |\\__,_|_| |_|\\__,_|\n" +
                            "          |__/       |___/                                  |___/                   ");
        } else {
            System.out.println("Una pena que no quieras jugar.");
        }
    }
}
