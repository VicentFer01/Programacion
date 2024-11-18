package Tema2;

import java.util.Scanner;


public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gamemode; // modo de juego //

        // JUEGO POR CLASES (he intentado reutilizar el maximo de variables posibles para los dos gamemodes //


        // player input eleccion Personajes
        int player1PJelection = 0, player2PJelection = 0;
        int player1PJ = 0, player2PJ = 0;
        int Caballero = 1, Arquero = 2, Mago = 3, Asesino = 4, Alquimista = 5;

        // Rondas y operaciones //
        int turn = 0, danyobase = 0;
        boolean turnoJugador1;
        double danyocrit = 1.5;
        double randomNumber = Math.random();
        double randomNumber2 = Math.random();


        // Stats Clases//
        int CaballeroVEL = 45, CaballeroATQ = 45, CaballeroHP = 130, CaballeroHPmax = 130, CaballeroDEF = 20, CaballeroDEFmax = 20;
        double CaballeroCritChance = 0.2, CaballeroArmorPen = 5;

        int ArqueroVEL = 85, ArqueroATQ = 50, ArqueroHP = 120, ArqueroHPmax = 120, ArqueroDEF = 20, ArqueroDEFmax = 20;
        double ArqueroCritChance = 0.4, ArqueroArmorPen = 10;

        int MagoVEL = 55, MagoATQ = 45, MagoHP = 115, MagoHPmax = 115, MagoDEF = 20, MagoDEFmax = 20;
        double MagoCritChance = 0.4, MagArmorPen = 10;

        int AsesinoVEL = 95, AsesinoATQ = 45, AsesinoHP = 100, AsesinoHPmax = 100, AsesinoDEF = 15, AsesinoDEFmax = 15;
        double AsesinoCritChance = 0.3, AsesinoArmorPen = 15;

        int AlquimistaVEL = 70, AlquimistaATQ = 40, AlquimistaHP = 120, AlquimistaHPmax = 120, AlquimistaDEF = 15, AlquimistaDEFmax = 15;
        double AlquimistaCritChance = 0.4, AlquimistaArmorPen = 10;


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
        int potimaxAse = 3;
        int potimaxAlq = 5;

        int potimaxPlayer1 = 0, potimaxPlayer2 = 0; //Maximo de pociones//
        int potiPlayer1 = 0, potiPlayer2 = 0; //Esto es el counter de pociones//
        final int potiheal = 40;

        // Habilidades //
        boolean ABILup = true;  // La habilidad solo se puede utilizar una vez asi que al utilizarse esto se vuelve false //
        boolean ABILup2 = true;
        int player1ABIL = 0;
        int player2ABIL = 0;

        String player1ABILs = "";
        String player2ABILs = "";

        int player1ABILcab = 0, player1ABILarq = 0, player1ABILmag = 0, player1ABILase = 0, player1ABILalq = 0;
        int player2ABILcab = 0, player2ABILarq = 0, player2ABILmag = 0, player2ABILase = 0, player2ABILalq = 0;

        String CabABIL = "Estocada Precisa";
        String ArqABIL = "Disparo Preciso";
        String MagABIL = "Explosión Arcana";
        String AseABIL = "Sombra Letal";
        String AlqABIL = "Pocion Mortal";

        String CabABILfrase = "El caballero afila su espada y obtiene +20ATK adicional";
        String ArqABILfrase = "El arquero dispara su flecha más punzante y el ataque inflinge 15% del HP enemigo adicionales";
        String MagABILfrase = "El mago hace un hechizo que convoca un dragón que lanza fuego que inflinge 80HPs";
        String AseABILfrase = "El asesino utiliza su cuchillo especial y obtiene +20 letalidad";
        String AlqABILfrase = "El alquimista utiliza sus pociones y inflinge 40 HP, y se cura 30HP";


        // Stats del jugador (se otorgan al elegir clase)
        int player1VEL = 0, player1ATQ = 0, player1HP = 0, player1HPmax = 0, player1DEF = 0, player1DEFmax = 0, player1HPregen = 0;
        double player1PEN = 0, player1Crit = 0;

        int player2VEL = 0, player2ATQ = 0, player2HP = 0, player2HPmax = 0, player2DEF = 0, player2DEFmax = 0, player2HPregen = 0;
        double player2PEN = 0, player2Crit = 0;


        // Seleccionar gamemode //

        do {
            System.out.println("Como quieres jugar la partida?");
            System.out.println("1. Personajes por defecto (clases)");
            System.out.println("2. Crea tu propio personaje");

            gamemode = scan.nextInt();
            switch (gamemode) {
                case 1:

                        System.out.println("""
                                 ____  _                           \s
                                | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  ___| |
                                |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __| |
                                | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\_|
                                |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___(_)""");
                        System.out.println();
                        System.out.println();
                        System.out.println("El combate está a punto de empezar, a continuación se presentara los personajes disponibles");
                        System.out.println();
                        System.out.println();
                        System.out.println("Caballero");
                        System.out.println("""
                                 \s
                                             .--.
                                            /.--.\\
                                            |====|
                                            |`::`|
                                        .-;`\\..../`;_.-^-._
                                 /\\\\   /  |...::..|`   :   `|
                                 |:'\\ |   /'''::''|   .:.   |
                                @|\\ /\\;-,/\\   ::  |..:::::..|
                                `||\\ <` >  >._::_.| ':::::' |
                                 || `""`  /   ^^  |   ':'   |
                                 ||       |       \\    :    /
                                 ||       |        \\   :   /
                                 ||       |___/\\___|`-.:.-`
                                 ||        \\_ || _/    `
                                 ||        |  ||  |
                                """);

                        System.out.println("Habilidades");
                        System.out.println("1. Ataque basico.");
                        System.out.println("2. Usar poción de vida (3x)");
                        System.out.println("3. Habilidad única (1x)");
                        System.out.println();

                        System.out.println("Arquero");
                        System.out.println(
                                """
                                                   4   ".                                       \s
                                                   4    ^.                                      \s
                                                   4     $                                      \s
                                                   4     'b                                     \s
                                                   4      "b.                                   \s
                                                   4        $                                   \s
                                                   4        $r                                  \s
                                                   4        $F                                  \s
                                        -$b========4========$b====*P=-                          \s
                                                   4       *$$F                                 \s
                                                   4        $$"                                 \s
                                                   4       .$F                                  \s
                                                   4       dP                                   \s
                                                   4      F                                     \s
                                                   4     @                                      \s
                                                   4    .                                       \s
                                                   J.                                           \s
                                        """);

                        System.out.println("Habilidades");
                        System.out.println("1. Ataque basico");
                        System.out.println("2. Usar pocion de vida (4x)");
                        System.out.println("3. Habilidad unica");
                        System.out.println();

                        System.out.println("Mago");
                        System.out.println("""
                                                    ____ \
                                                  .'* *.'
                                               __/_*_*(_
                                              / _______ \\
                                             _\\_)/___\\(_/_\s
                                            / _((\\- -/))_ \\
                                            \\ \\())(-)(()/ /
                                             ' \\(((()))/ '
                                            / ' \\)).))/ ' \\
                                           / _ \\ - | - /_  \\
                                          (   ( .;''';. .'  )
                                          _\\"__ /    )\\ __"/_
                                            \\/  \\   ' /  \\/
                                             .'  '...' ' )
                                         .'   /    b    '.  '.
                                     _.-'    /     Bb     '-. '-._\s
                                 _.-'       |      BBb       '-.  '-.\s
                                (________mrf\\____.dBBBb.________)____)
                                """);

                        System.out.println("Habilidades");
                        System.out.println("1. Ataque basico");
                        System.out.println("2. Usar pocion de vida 5x)");
                        System.out.println("3. Habilidad unica");
                        System.out.println();

                        System.out.println("Asesino");
                        System.out.println(
                                """
                                        ⠀⠀⠳⡀⠁⠀⠀⢈⠓⠴⠾⣻⣒⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠙⢆⠠⡄⠀⠑⠒⠤⣀⡉⠙⠛⠓⠲⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠈⢦⡈⠉⠒⠢⢄⡀⠈⠑⠢⠤⠤⡤⠤⣙⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠈⠛⠑⠲⣄⠈⠒⢄⡀⠀⠀⠉⠲⢠⡭⢾⣒⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣈⠑⠦⡀⠑⢀⠀⠀⠀⠈⢆⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢯⣓⠦⣉⡳⣄⠱⡀⠀⠀⠈⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⡧⣈⠙⠻⠧⠀⠀⠀⠀⠀⠙⣦⡶⢶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢬⡑⢤⣀⠀⠀⠀⠀⠀⣠⠊⡰⠃⢉⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⢄⡉⠲⢄⣠⠞⣡⡾⠓⣠⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡱⠊⣡⠞⠃⢀⣾⣿⣿⣿⣿⣶⣤⣀⣀⡤⠦⢤⡀⠀⠀⠀⠀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢯⡐⢀⡴⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡄⡗⣒⠒⢆⡀⠀
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠉⠛⠻⢿⣿⣿⣿⣿⣿⢰⠃⡗⠒⠒⢢⠙⢤
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⢟⢃⡾⢴⡃⠀⢀⣠⠴⠞
                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠓⠋⠈⠛⠋⠀⠀⠀""");

                        System.out.println("Habilidades");
                        System.out.println("1. Ataque basico");
                        System.out.println("2. Usar pocion de vida 3x)");
                        System.out.println("3. Habilidad unica");
                        System.out.println();

                        System.out.println("Alquimista");
                        System.out.println(
                                """
                                              (___)
                                              <   >
                                               ) (
                                              /`-.\\
                                             /     \\
                                            / _    _\\
                                           :,' `-.' `:
                                           |         |
                                           :         ;
                                            \\       /
                                             `.___.'\
                                        """);

                        System.out.println("Habilidades");
                        System.out.println("1. Ataque basico");
                        System.out.println("2. Usar pocion de vida 5x)");
                        System.out.println("3. Habilidad unica");
                        System.out.println();
                        System.out.println();
                        System.out.println();


                        System.out.println("""
                                 ____       _               _                   _        ____                                  _          \s
                                / ___|  ___| | ___  ___ ___(_) ___  _ __     __| | ___  |  _ \\ ___ _ __ ___  ___  _ __   __ _ (_) ___  ___\s
                                \\___ \\ / _ \\ |/ _ \\/ __/ __| |/ _ \\| '_ \\   / _` |/ _ \\ | |_) / _ \\ '__/ __|/ _ \\| '_ \\ / _` || |/ _ \\/ __|
                                 ___) |  __/ |  __/ (_| (__| | (_) | | | | | (_| |  __/ |  __/  __/ |  \\__ \\ (_) | | | | (_| || |  __/\\__ \\
                                |____/ \\___|_|\\___|\\___\\___|_|\\___/|_| |_|  \\__,_|\\___| |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|/ |\\___||___/
                                                                                                                            |__/          \s""");
                        System.out.println();
                        System.out.println();
                        System.out.println("1. Caballero");
                        System.out.println("2. Arquero");
                        System.out.println("3. Mago");
                        System.out.println("4. Asesino");
                        System.out.println("5. Alquimista");
                        System.out.println();

                        do {



                        System.out.println("Jugador 1 elige tu personaje");
                        player1PJelection = scan.nextInt();
                        switch (player1PJelection) {
                            case 1:
                                System.out.println("El jugador 1 ha elegido al caballero!, tu habilidad única es " + CabABIL);
                                player1PJ = 1;
                                player1ATQ = CaballeroATQ;
                                player1VEL = CaballeroVEL;
                                player1DEF = CaballeroDEF;
                                player1DEFmax = CaballeroDEFmax;
                                player1HP = CaballeroHP;
                                player1HPmax = CaballeroHPmax;
                                player1Crit = CaballeroCritChance;
                                player1PEN = CaballeroArmorPen;


                                potimaxPlayer1 = potimaxCab;

                                frasePlayer1 = CabFrase;
                                break;
                            case 2:
                                player1PJ = 2;
                                System.out.println("El jugador 1 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                                player1ATQ = ArqueroATQ;
                                player1VEL = ArqueroVEL;
                                player1DEF = ArqueroDEF;
                                player1DEFmax = ArqueroDEFmax;
                                player1HP = ArqueroHP;
                                player1HPmax = ArqueroHPmax;
                                player1Crit = ArqueroCritChance;
                                player1PEN = ArqueroArmorPen;

                                potimaxPlayer1 = potimaxArq;

                                frasePlayer1 = ArqFrase;
                                break;
                            case 3:
                                player1PJ = 3;
                                System.out.println("El jugador 1 ha elegido al mago!, tu habilidad única es " + MagABIL);
                                player1ATQ = MagoATQ;
                                player1VEL = MagoVEL;
                                player1DEF = MagoDEF;
                                player1DEFmax = MagoDEFmax;
                                player1HP = MagoHP;
                                player1HPmax = MagoHPmax;
                                player1Crit = MagoCritChance;
                                player1PEN = MagArmorPen;

                                potimaxPlayer1 = potimaxMag;

                                frasePlayer1 = MagFrase;
                                break;
                            case 4:
                                player1PJ = 4;
                                System.out.println("El jugador 1 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                                player1ATQ = AsesinoATQ;
                                player1VEL = AsesinoVEL;
                                player1DEF = AsesinoDEF;
                                player1DEFmax = AsesinoDEFmax;
                                player1HP = AsesinoHP;
                                player1HPmax = AsesinoHPmax;
                                player1Crit = AsesinoCritChance;
                                player1PEN = AsesinoArmorPen;

                                potimaxPlayer1 = potimaxAse;

                                frasePlayer1 = AseFrase;
                                break;
                            case 5:
                                player1PJ = 5;
                                System.out.println("El jugador 1 ha elegido al alquimista, tu habilidad única es " + AlqABIL);
                                player1ATQ = AlquimistaATQ;
                                player1VEL = AlquimistaVEL;
                                player1DEF = AlquimistaDEF;
                                player1DEFmax = AlquimistaDEFmax;
                                player1HP = AlquimistaHP;
                                player1HPmax = AlquimistaHPmax;
                                player1Crit = AlquimistaCritChance;
                                player1PEN = AlquimistaArmorPen;

                                potimaxPlayer1 = potimaxAlq;

                                frasePlayer1 = AlqFrase;
                                break;
                            default:
                                System.out.println("No has elegido un personaje disponible (1-5)");
                        }
                        } while (player1PJelection != 1 && player1PJelection != 2 && player1PJelection != 3 && player1PJelection != 4 && player1PJelection != 5);
                        System.out.println();

                        do {


                            System.out.println("Jugador 2 elige tu personaje");
                            player2PJelection = scan.nextInt();
                            switch (player2PJelection) {
                                case 1:
                                    player2PJ = 1;
                                    System.out.println("El jugador 2 ha elegido al caballero!, tu habilidad única es " + CabABIL);
                                    player2ATQ = CaballeroATQ;
                                    player2VEL = CaballeroVEL;
                                    player2DEF = CaballeroDEF;
                                    player2DEFmax = CaballeroDEFmax;
                                    player2HP = CaballeroHP;
                                    player2HPmax = CaballeroHPmax;
                                    player2Crit = CaballeroCritChance;
                                    player2PEN = CaballeroArmorPen;

                                    potimaxPlayer2 = potimaxCab;

                                    frasePlayer2 = CabFrase;

                                    break;
                                case 2:
                                    player2PJ = 2;
                                    System.out.println("El jugador 2 ha elegido al arquero!, tu habilidad única es " + ArqABIL);
                                    player2ATQ = ArqueroATQ;
                                    player2VEL = ArqueroVEL;
                                    player2DEF = ArqueroDEF;
                                    player2DEFmax = ArqueroDEFmax;
                                    player2HP = ArqueroHP;
                                    player2HPmax = ArqueroHPmax;
                                    player1Crit = ArqueroCritChance;
                                    player1PEN = ArqueroArmorPen;
                                    potimaxPlayer2 = potimaxArq;

                                    frasePlayer2 = ArqFrase;

                                    break;
                                case 3:
                                    player2PJ = 3;
                                    System.out.println("El jugador 2 ha elegido al mago!, tu habilidad única es " + MagABIL);
                                    player2ATQ = MagoATQ;
                                    player2VEL = MagoVEL;
                                    player2DEF = MagoDEF;
                                    player2DEFmax = MagoDEFmax;
                                    player2HP = MagoHP;
                                    player2HPmax = MagoHPmax;
                                    player2Crit = MagoCritChance;
                                    player2PEN = MagArmorPen;

                                    potimaxPlayer2 = potimaxMag;

                                    frasePlayer2 = MagFrase;
                                    break;
                                case 4:
                                    player2PJ = 4;
                                    System.out.println("El jugador 2 ha elegido al asesino!, tu habilidad única es " + AseABIL);
                                    player2ATQ = AsesinoATQ;
                                    player2VEL = AsesinoVEL;
                                    player2DEF = AsesinoDEF;
                                    player2DEFmax = AsesinoDEFmax;
                                    player2HP = AsesinoHP;
                                    player2HPmax = AsesinoHPmax;
                                    player2Crit = AsesinoCritChance;
                                    player2PEN = AsesinoArmorPen;

                                    potimaxPlayer2 = potimaxAse;


                                    frasePlayer2 = AseFrase;

                                    break;
                                case 5:
                                    player2PJ = 5;
                                    System.out.println("El jugador 2 ha elegido al alquimista!, tu habilidad única es " + AlqABIL);
                                    player2ATQ = AlquimistaATQ;
                                    player2VEL = AlquimistaVEL;
                                    player2DEF = AlquimistaDEF;
                                    player2DEFmax = AlquimistaDEFmax;
                                    player2HP = AlquimistaHP;
                                    player2HPmax = AlquimistaHPmax;
                                    player2Crit = AlquimistaCritChance;
                                    player2PEN = AlquimistaArmorPen;

                                    potimaxPlayer2 = potimaxAlq;

                                    frasePlayer2 = AlqFrase;

                                    break;
                                default:
                                    System.out.println("No has elegido un personaje disponible (1-5)");
                            }
                        } while (player2PJelection != 1 && player2PJelection != 2 && player2PJelection != 3 && player2PJelection != 4 && player2PJelection != 5);

                        // Este booleano comprueba de quien es el primer turno comparando la stat VEL //
                        turnoJugador1 = player1VEL >= player2VEL;


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
                                        player2DEF = (int) (player2DEFmax - player1PEN);
                                        danyobase = player1ATQ - player2DEF;
                                        if (randomNumber < player1Crit) {
                                            danyobase = (int) (danyobase * danyocrit);
                                            System.out.println("Golpe crítico!");
                                        }


                                        player2HP = player2HP - danyobase;

                                        System.out.println();
                                        System.out.println(frasePlayer1);
                                        System.out.println();
                                        System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");
                                        break;

                                    case 2:
                                        if (potiPlayer1 < potimaxPlayer1) {
                                            player1HP += potiheal;
                                            potimaxPlayer1--;

                                            if (player1HP > player1HPmax) {
                                                System.out.println();
                                                System.out.println("El jugador 1 se ha curado hasta la vida máxima de su personaje");
                                                System.out.println("Al jugador 1 le quedan " + potimaxPlayer1 + " pociones");
                                                player1HP = player1HPmax;
                                            } else {
                                                System.out.println();
                                                System.out.println("Al jugador 1 le quedan " + potimaxPlayer1 + " pociones");
                                                System.out.println("Jugador 1 se curó " + potiheal + " HP, ahora tiene " + player1HP + "HP.");
                                            }

                                        } else {
                                            System.out.println("Jugador 1 no tiene más pociones.");
                                        }
                                        break;
                                    case 3:
                                        switch (player1PJ) {
                                            case 1:
                                                if (ABILup) {
                                                    System.out.println();
                                                    System.out.println(CabABILfrase);

                                                    player2DEF = (int) (player2DEFmax - player1PEN);
                                                    danyobase = 20 + player1ATQ - player2DEF;

                                                    if (randomNumber < player1Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player2HP -= danyobase;

                                                    System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");

                                                    ABILup = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                            case 2:
                                                if (ABILup) {
                                                    System.out.println();
                                                    System.out.println(ArqABILfrase);

                                                    player2DEF = (int) (player2DEF - player1PEN);
                                                    danyobase = (int) (((player2HPmax * 0.15) + player1ATQ) - player2DEF);

                                                    if (randomNumber < player1Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player2HP -= danyobase;
                                                    System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");

                                                    ABILup = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                            case 3:
                                                if (ABILup) {
                                                    System.out.println();
                                                    System.out.println(MagABILfrase);

                                                    player2DEF = (int) (player2DEF - player1PEN);
                                                    danyobase = 80 - player2DEF;

                                                    if (randomNumber < player1Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player2HP -= danyobase;
                                                    System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                ABILup = false;
                                                break;
                                            case 4:
                                                if (ABILup) {
                                                    System.out.println();
                                                    System.out.println(AseABILfrase);

                                                    player2DEF = (int) (player2DEF - player1PEN + 30);
                                                    danyobase = player1ATQ - player2DEF;

                                                    if (randomNumber < player1Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player2HP -= danyobase;
                                                    System.out.println("Jugador 1 hizo " + danyobase + " de daño, el Jugador 2 ahora tiene " + player2HP + "HP.");
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                ABILup = false;
                                                break;
                                            case 5:
                                                if (ABILup) {
                                                    System.out.println();
                                                    System.out.println(AlqABILfrase);
                                                    player2HP = player2HP - 40;
                                                    player1HP += 30;
                                                    System.out.println("Jugador 1 tiene " + player1HP + " HP y el Jugador 2 tiene " + player2HP + "HP");

                                                    ABILup = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                        }
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
                                        player1DEF = (int) (player1DEFmax - player2PEN);
                                        danyobase = player2ATQ - player1DEF;


                                        if (randomNumber2 < player2Crit) {
                                            danyobase = (int) (danyobase * danyocrit);
                                            System.out.println("¡Golpe crítico!");
                                        }

                                        player1HP -= danyobase;

                                        System.out.println();
                                        System.out.println(frasePlayer2);
                                        System.out.println();
                                        System.out.println("Jugador 2 hizo " + danyobase + " de daño, el Jugador 1 ahora tiene " + player1HP + "HP.");
                                        break;
                                    case 2:
                                        if (potiPlayer2 < potimaxPlayer2) {
                                            player2HP += potiheal;
                                            potimaxPlayer2--;

                                            if (player2HP > player2HPmax) {
                                                System.out.println();
                                                System.out.println("El jugador 2 se ha curado hasta la vida máxima de su personaje");
                                                System.out.println("Al jugador 2 le quedan " + potimaxPlayer2 + " pociones");
                                                player2HP = player2HPmax;
                                            } else {
                                                System.out.println();
                                                System.out.println("Al jugador 2 le quedan " + potimaxPlayer2 + " pociones");
                                                System.out.println("Jugador 2 se curó " + potiheal + " HP, ahora tiene " + player2HP + "HP.");
                                            }

                                        } else {
                                            System.out.println("Jugador 2 no tiene más pociones.");
                                        }
                                        break;
                                    case 3:
                                        switch (player2PJ) {
                                            case 1:
                                                if (ABILup2) {
                                                    System.out.println();
                                                    System.out.println(CabABILfrase);

                                                    player1DEF = (int) (player1DEF - player2PEN);
                                                    danyobase = 20 + player2ATQ - player1DEF;

                                                    if (randomNumber2 < player2Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player1HP -= danyobase;

                                                    System.out.println("Jugador 2 hizo " + danyobase + " de daño, el Jugador 1 ahora tiene " + player2HP + "HP.");

                                                    ABILup2 = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                            case 2:
                                                if (ABILup2) {
                                                    System.out.println();
                                                    System.out.println(ArqABILfrase);

                                                    player1DEF = (int) (player1DEF - player2PEN);
                                                    danyobase = (int) (((player1HPmax * 0.3) + player2ATQ) - player1DEF);

                                                    if (randomNumber2 < player2Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player1HP -= danyobase;
                                                    System.out.println("Jugador 2 hizo " + danyobase + " de daño, el Jugador 1 ahora tiene " + player2HP + "HP.");

                                                    ABILup2 = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                            case 3:
                                                if (ABILup2) {
                                                    System.out.println();
                                                    System.out.println(MagABILfrase);
                                                    danyobase = 80;

                                                    if (randomNumber2 < player2Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player1HP -= danyobase;
                                                    System.out.println("Jugador 2 hizo " + danyobase + " de daño, el Jugador 1 ahora tiene " + player2HP + "HP.");
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                ABILup2 = false;
                                                break;
                                            case 4:
                                                if (ABILup2) {
                                                    System.out.println();
                                                    System.out.println(AseABILfrase);

                                                    player1DEF = (int) (player1DEF - player2PEN + 30);
                                                    danyobase = player2ATQ - player1DEF;

                                                    if (randomNumber2 < player2Crit) {
                                                        danyobase = (int) (danyobase * danyocrit);
                                                        System.out.println("¡Golpe crítico!");
                                                    }
                                                    System.out.println();
                                                    player1HP -= danyobase;
                                                    System.out.println("Jugador 2 hizo " + danyobase + " de daño, el Jugador 1 ahora tiene " + player1HP + "HP.");
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                ABILup2 = false;
                                                break;
                                            case 5:
                                                if (ABILup2) {
                                                    System.out.println();
                                                    System.out.println(AlqABILfrase);
                                                    player1HP = player2HP - 40;
                                                    player2HP += 30;
                                                    System.out.println("Jugador 2 tiene " + player2HP + " HP y el Jugador 1 tiene " + player1HP + "HP");


                                                    ABILup2 = false;
                                                } else {
                                                    System.out.println();
                                                    System.out.println("Ya has utilizado tu habilidad única");
                                                }
                                                break;
                                        }

                                        break;
                                }

                            }
                            // Aqui se le otorga el turno al otro jugador //
                            turnoJugador1 = !turnoJugador1;


                        }
                        System.out.println();
                        System.out.println();
                        System.out.println(player1HP > 0 ? """
                                 _____ _     _                       _              _                          \s
                                | ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  / |   __ _  __ _ _ __   __ _\s
                                |  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__| | |  / _` |/ _` | '_ \\ / _` |
                                | |___| |   | | |_| | (_| | (_| | (_| | (_) | |    | | | (_| | (_| | | | | (_| |
                                |_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_|  \\__, |\\__,_|_| |_|\\__,_|
                                          |__/       |___/                              |___/                  \s""" :


                                """
                                         _____ _     _                       _              ____                           \s
                                        | ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  |___ \\    __ _  __ _ _ __   __ _\s
                                        |  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__|   __) |  / _` |/ _` | '_ \\ / _` |
                                        | |___| |   | | |_| | (_| | (_| | (_| | (_) | |     / __/  | (_| | (_| | | | | (_| |
                                        |_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_____|  \\__, |\\__,_|_| |_|\\__,_|
                                                  |__/       |___/                                  |___/                  \s""");

                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bienvenido al duelo de personajes propios!");
                    System.out.println();
                    System.out.println("Reglas para la creación de personajes");
                    System.out.println();
                    System.out.println("El total de las 4 estadísticas no puede ser superior a 500, además cada estadística no puede superar 200.");
                    System.out.println();


                    int player1Total;
                    int player2Total;


                    do {
                        System.out.println();
                        System.out.println("Jugador 1, introduce tus estadísticas:");
                        System.out.println();

                        System.out.print("Introduce tu ataque (0-200): ");
                        player1ATQ = scan.nextInt();

                        System.out.print("Introduce tu defensa (0-200): ");
                        player1DEF = scan.nextInt();

                        System.out.print("Introduce tu velocidad (0-200): ");
                        player1VEL = scan.nextInt();

                        System.out.print("Introduce tus puntos de vida (0-200): ");
                        player1HP = scan.nextInt();

                        player1Total = player1ATQ + player1DEF + player1VEL + player1HP;

                        if (player1Total > 500) {
                            System.out.println();
                            System.out.println("El total de tus estadísticas supera el máximo permitido (500)");
                        }

                        if (player1ATQ > 200 || player1DEF > 200 || player1VEL > 200 || player1HP > 200) {
                            System.out.println();
                            System.out.println("Ninguna estadística individual puede superar 200. Intenta de nuevo.");
                        }

                    } while (player1Total > 500 || player1ATQ > 200 || player1DEF > 200 || player1VEL > 200 || player1HP > 200);

                    do {
                        System.out.println();
                        System.out.println("Jugador 2, introduce tus estadísticas:");
                        System.out.println();

                        System.out.print("Introduce tu ataque (0-200): ");
                        player2ATQ = scan.nextInt();

                        System.out.print("Introduce tu defensa (0-200): ");
                        player2DEF = scan.nextInt();

                        System.out.print("Introduce tu velocidad (0-200): ");
                        player2VEL = scan.nextInt();

                        System.out.print("Introduce tus puntos de vida (0-200): ");
                        player2HP = scan.nextInt();

                        player2Total = player2ATQ + player2DEF + player2VEL + player2HP;

                        if (player2Total > 500) {
                            System.out.println();
                            System.out.println("El total de tus estadísticas supera el máximo permitido (500). Intenta de nuevo.");
                        }

                        if (player2ATQ > 200 || player2DEF > 200 || player2VEL > 200 || player2HP > 200) {
                            System.out.println();
                            System.out.println("Ninguna estadística individual puede superar 200. Intenta de nuevo.");
                        }

                    } while (player2Total > 500 || player2ATQ > 200 || player2DEF > 200 || player2VEL > 200 || player2HP > 200);

                    turnoJugador1 = player1VEL >= player2VEL;

                    int player1maxHP = player1HP;
                    int player2maxHP = player2HP;

                    while (player1HP > 0 && player2HP > 0) {
                        System.out.println();
                        System.out.println();




                        if (turnoJugador1) {
                            System.out.println("Turno del Jugador 1");
                            System.out.println("1. Ataque básico.");
                            System.out.println("2. Usar poción de vida.");
                            turn = scan.nextInt();

                            switch (turn) {
                                case 1:
                                    danyobase = player1ATQ - player2DEF;

                                    if (player2DEF > player1ATQ) {
                                        player2HP -= 1;
                                        System.out.println("La defensa del Jugador 2 es superior al ataque del jugador 1");
                                        System.out.println("El jugador 2 ha recibido 1 de daño y su vida ahora es " + player2HP);
                                    } else {
                                        player2HP -= danyobase;
                                        System.out.println("El Jugador 1 hizo " + danyobase + " de daño. Jugador 2 ahora tiene " + player2HP + " puntos de vida.");
                                    }
                                    break;

                                case 2:
                                    player1HP += 50;

                                    if (player1HP > player1maxHP) {
                                        player1HP = player1maxHP;
                                        System.out.println("Te has curado hasta la vida maxima, Jugador 1 ahora tiene " + player1HP);
                                    } else {System.out.println("El Jugador se ha curado 50 de HP y ahora tiene " + player1HP + " puntos de vida.");
                                    }

                                    break;

                                default:
                                    System.out.println("Acción no válida. Pierdes el turno.");
                                    break;
                            }

                            turnoJugador1 = false;

                        } else {
                            System.out.println("Turno del Jugador 2");
                            System.out.println("1. Ataque básico.");
                            System.out.println("2. Usar poción de vida.");
                            turn = scan.nextInt();

                            switch (turn) {
                                case 1:
                                    danyobase = player2ATQ - player1DEF;

                                    if (player1DEF > player2ATQ) {
                                        player1HP -= 1;
                                        System.out.println("La defensa del Jugador 1 es superior al ataque del jugador 2");
                                        System.out.println("El jugador 1 ha recibido 1 de daño y su vida es " + player1HP);
                                    } else {
                                        player1HP -= danyobase;
                                        System.out.println("El Jugador 2 hizo " + danyobase + " de daño. Jugador 1 ahora tiene " + player2HP + " puntos de vida.");
                                    }
                                    break;

                                case 2:
                                    player2HP += 50;

                                    if (player2HP > player2maxHP) {
                                        player2HP = player2maxHP;
                                        System.out.println("Te has curado hasta la vida maxima, Jugador 2 ahora tiene " + player2HP);
                                    } else {System.out.println("El Jugador se ha curado 50 de HP y ahora tiene " + player2HP + " puntos de vida.");
                                    }

                                    break;

                                default:
                                    System.out.println("Acción no válida. Pierdes el turno.");
                                    break;
                            }

                            turnoJugador1 = true;
                        }
                    }

                    System.out.println(player1HP > 0 ? """
                             _____ _     _                       _              _                          \s
                            | ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  / |   __ _  __ _ _ __   __ _\s
                            |  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__| | |  / _` |/ _` | '_ \\ / _` |
                            | |___| |   | | |_| | (_| | (_| | (_| | (_) | |    | | | (_| | (_| | | | | (_| |
                            |_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_|  \\__, |\\__,_|_| |_|\\__,_|
                                      |__/       |___/                              |___/                  \s""" :


                            """
                                     _____ _     _                       _              ____                           \s
                                    | ____| |   (_)_   _  __ _  __ _  __| | ___  _ __  |___ \\    __ _  __ _ _ __   __ _\s
                                    |  _| | |   | | | | |/ _` |/ _` |/ _` |/ _ \\| '__|   __) |  / _` |/ _` | '_ \\ / _` |
                                    | |___| |   | | |_| | (_| | (_| | (_| | (_) | |     / __/  | (_| | (_| | | | | (_| |
                                    |_____|_|  _/ |\\__,_|\\__, |\\__,_|\\__,_|\\___/|_|    |_____|  \\__, |\\__,_|_| |_|\\__,_|
                                              |__/       |___/                                  |___/                  \s""");

                break;
                default:
                    System.out.println("No has seleccionado un mood de juego disponible (1-2)");
                    break;
            }
        } while (gamemode != 1 && gamemode != 2);
    }
}



