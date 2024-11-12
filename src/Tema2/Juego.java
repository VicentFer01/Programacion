package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // player input eleccion Personajes //
        int player1PJelection, player2PJelection;

        // Rondas y operaciones //
        int roundcounter = 1,turn, danyobase;


        // Stats Clases//
        int CaballeroVEL = 45, CaballeroATQ = 50, CaballeroHP = 120, CaballeroDEF = 30, CaballeroHPregen = 10;
        double CaballeroCritChance = 0.35, CaballeroArmorPen = 10;

        int ArqueroVEL = 85, ArqueroATQ = 60, ArqueroHP = 65, ArqueroDEF = 15, ArqueroHPregen = 5;
        double ArqueroCritChance = 0.35, ArqueroArmorPen = 10;

        int MagoVEL = 55, MagoATQ = 45, MagoHP = 80, MagoDEF = 20, MagoHPregen = 5;
        double MagoCritChance = 0.35, MagArmorPen = 10;

        int AsesinoVEL = 95, AsesinoATQ = 45, AsesinoHP = 60, AsesinoDEF = 15, AsesinoHPregen = 5;
        double AsesinoCritChance = 0.35, AsesinoArmorPen = 10;

        int AlquimistaVEL = 70, AlquimistaATQ = 35, AlquimistaHP = 80, AlquimistaDEF = 15, AlquimistaHPregen = 5;
        double AlquimistaCritChance = 0.35, AlquimistaArmorPen = 10;



        // Pociones //
        int potimaxPlayer1 = 0, potimaxPlayer2 = 0;
        int potiPlayer1 = 0, potiPlayer2 = 0;
        final int potiheal = 40;

        // Habilidades //
        int player1ABIL = 0;
        int player2ABIL = 0;

        String player1ABILs = "";
        String player2ABILs = "";

        int player1ABILcab = 0;
        int player1ABILarq = 0;
        int player1ABILmag = 0;
        int player1ABILase = 0;
        int player1ABILalq = 0;

        int player2ABILcab = 0;
        int player2ABILarq = 0;
        int player2ABILmag = 0;
        int player2ABILase = 0;
        int player2ABILalq = 0;

        String CabABIL = "Muro de Hierro";
        String ArqABIL = "Disparo Preciso";
        String MagABIL = "Explosión Arcana";
        String AseABIL = "Sombra Letal";
        String AlqABIL = "Pocion Mortal";

        
        // Stats del jugador (se otorgan al elegir clase)
        int player1VEL = 0, player1ATQ = 0, player1HP = 0, player1DEF = 0, player1HPregen = 0;
        double player1PEN = 0, player1Crit = 0;

        int player2VEL = 0, player2ATQ = 0, player2HP = 0, player2DEF = 0,player2HPregen = 0;
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
                    player1HPregen = CaballeroHPregen;
                    player1Crit = CaballeroCritChance;
                    player1PEN = CaballeroArmorPen;
                    potimaxPlayer1 = potiPlayer1 = 3;
                    player1ABIL = player1ABILcab;
                    player1ABILs = CabABIL;

                    break;
                case 2:
                    System.out.println("El jugador 1 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                    player1ATQ = ArqueroATQ;
                    player1VEL = ArqueroVEL;
                    player1DEF = ArqueroDEF;
                    player1HP = ArqueroHP;
                    player1HPregen = ArqueroHPregen;
                    player1Crit = ArqueroCritChance;
                    player1PEN = ArqueroArmorPen;
                    potimaxPlayer1 = potiPlayer1 = 4;
                    player1ABIL = player1ABILarq;
                    player1ABILs = ArqABIL;


                    break;
                case 3:
                    System.out.println("El jugador 1 ha elegido al mago!, tu habilidad única es " + MagABIL);
                    player1ATQ = MagoATQ;
                    player1VEL = MagoVEL;
                    player1DEF = MagoDEF;
                    player1HP = MagoHP;
                    player1HPregen = MagoHPregen;
                    player1Crit = MagoCritChance;
                    player1PEN = MagArmorPen;
                    potimaxPlayer1 = potiPlayer1 = 5;
                    player1ABIL = player1ABILmag;
                    player1ABILs = MagABIL;


                    break;
                case 4:
                    System.out.println("El jugador 1 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                    player1ATQ = AsesinoATQ;
                    player1VEL = AsesinoVEL;
                    player1DEF = AsesinoDEF;
                    player1HP = AsesinoHP;
                    player1HPregen = AsesinoHPregen;
                    player1Crit = AsesinoCritChance;
                    player1PEN = AsesinoArmorPen;
                    potimaxPlayer1 = potiPlayer1 = 3;
                    player1ABIL = player1ABILase;
                    player1ABILs = AseABIL;


                    break;
                case 5:
                    System.out.println("El jugador 1 ha elegido al alquimista, tu habilidad única es " + AlqABIL);
                    player1ATQ = AlquimistaATQ;
                    player1VEL = AlquimistaVEL;
                    player1DEF = AlquimistaDEF;
                    player1HP = AlquimistaHP;
                    player1HPregen = AlquimistaHPregen;
                    player1Crit = AlquimistaCritChance;
                    player1PEN = AlquimistaArmorPen;
                    potimaxPlayer1 = potiPlayer1 = 5;
                    player1ABIL = player1ABILalq;
                    player1ABILs = AlqABIL;


                    break;
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
                    player1HPregen = CaballeroHPregen;
                    player1Crit = CaballeroCritChance;
                    player1PEN = CaballeroArmorPen;
                    potimaxPlayer2 = potiPlayer2 = 3;
                    player2ABIL = player1ABILcab;
                    player2ABILs = CabABIL;


                    break;
                case 2:
                    System.out.println("El jugador 2 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                    player2ATQ = ArqueroATQ;
                    player2VEL = ArqueroVEL;
                    player2DEF = ArqueroDEF;
                    player2HP = ArqueroHP;
                    player1HPregen = ArqueroHPregen;
                    player1Crit = ArqueroCritChance;
                    player1PEN = ArqueroArmorPen;
                    potimaxPlayer2 = potiPlayer2 = 4;
                    player2ABIL = player1ABILarq;
                    player2ABILs = ArqABIL;


                    break;
                case 3:
                    System.out.println("El jugador 2 ha elegido al mago!, tu habilidad única es " + MagABIL);
                    player2ATQ = MagoATQ;
                    player2VEL = MagoVEL;
                    player2DEF = MagoDEF;
                    player2HP = MagoHP;
                    player2HPregen = MagoHPregen;
                    player2Crit = MagoCritChance;
                    player2PEN = MagArmorPen;
                    potimaxPlayer2 = potiPlayer2 = 5;
                    player2ABIL = player1ABILmag;
                    player2ABILs = ArqABIL;


                    break;
                case 4:
                    System.out.println("El jugador 2 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                    player2ATQ = AsesinoATQ;
                    player2VEL = AsesinoVEL;
                    player2DEF = AsesinoDEF;
                    player2HP = AsesinoHP;
                    player2HPregen = AsesinoHPregen;
                    player2Crit = AsesinoCritChance;
                    player2PEN = AsesinoArmorPen;
                    potimaxPlayer2 = potiPlayer2 = 3;
                    player2ABIL = player1ABILase;
                    player2ABILs = AseABIL;


                    break;
                case 5:
                    System.out.println("El jugador 2 ha elegido al alquimista!, tu habilidad única es " + AlqABIL);
                    player2ATQ = AlquimistaATQ;
                    player2VEL = AlquimistaVEL;
                    player2DEF = AlquimistaDEF;
                    player2HP = AlquimistaHP;
                    player2HPregen = AlquimistaHPregen;
                    player2Crit = AlquimistaCritChance;
                    player2PEN = AlquimistaArmorPen;
                    potimaxPlayer2 = potiPlayer2 = 5;
                    player2ABIL = player1ABILalq;
                    player2ABILs = AlqABIL;


                    break;
            }

            // Este booleano comprueba de quien es el turno comparando la stat VEL //
            boolean turnoJugador1 = player1VEL >= player2VEL;

            while (player1HP > 0 && player2HP > 0) {
                System.out.println();
                System.out.println("Comienza la ronda numero " + roundcounter );
                if (turnoJugador1) {
                    System.out.println();
                    System.out.println();

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
                            System.out.println("Jugador 1 hizo " + danyobase + " de daño, El enemigo ahora tiene " + player2HP + "HP.");
                            break;
                        case 2:
                            if (potiPlayer1 > 0) {
                                player1HP += potiheal;
                                potiPlayer1--;
                                System.out.println();
                                System.out.println("Te quedan " + potimaxPlayer1 + "pociones");
                                System.out.println("Jugador 1 se curó 40HP, ahora tiene " + player1HP + "HP.");
                            } else {
                                System.out.println("Jugador 1 no tiene más pociones.");
                            }
                            System.out.println();
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Has utilizado la habilidad " + player1ABILs);



                    }
                } else {
                    System.out.println();
                    System.out.println();
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
                            System.out.println("Jugador 2 hizo " + danyobase + " de daño, El enemigo ahora tiene " + player1HP + "HP.");
                            break;
                        case 2:
                            if (potiPlayer2 > 0) {
                                player2HP += potiheal;
                                potiPlayer2--;
                                System.out.println();
                                System.out.println("Te quedan " + potimaxPlayer2 + "pociones");
                                System.out.println("Jugador 2 se curó 40HP, ahora tiene " + player2HP + "HP.");
                            } else {
                                System.out.println("Jugador 2 no tiene más pociones.");
                            }
                            break;
                        case 3:
                            System.out.println("Has utilizado la habilidad " + player2ABILs);


                    }
                }
                    roundcounter = roundcounter + 1;
                roundcounter = roundcounter - 1;
                turnoJugador1 = !turnoJugador1;


                // Aqui se le otorga el turno al otro jugador //
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
