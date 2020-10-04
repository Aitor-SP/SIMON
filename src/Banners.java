import java.util.Scanner;

/**
 * Clase que contiene los banners.
 * @author Aitor
 */

public class Banners {

    public static void Instrucciones() throws InterruptedException {
        /*
         Printa las instrucciones al iniciar el Main.java
        */

        Scanner input = new Scanner(System.in);

        System.out.println("\n" +
                ConsoleColors.GREEN_BOLD_BRIGHT+"              ███████╗██╗███╗   ███╗ ██████╗ ███╗   ██╗\n"+ConsoleColors.RESET+""+
                ConsoleColors.RED_BOLD_BRIGHT+"              ██╔════╝██║████╗ ████║██╔═══██╗████╗  ██║\n"+ConsoleColors.RESET+""+
                ConsoleColors.BLUE_BOLD_BRIGHT+"              ███████╗██║██╔████╔██║██║   ██║██╔██╗ ██║\n"+ConsoleColors.RESET+""+
                ConsoleColors.YELLOW_BOLD_BRIGHT+"              ╚════██║██║██║╚██╔╝██║██║   ██║██║╚██╗██║\n"+ConsoleColors.RESET+""+
                ConsoleColors.CYAN_BOLD_BRIGHT+"              ███████║██║██║ ╚═╝ ██║╚██████╔╝██║ ╚████║\n"+ConsoleColors.RESET+""+
                "              ╚══════╝╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝\n");
        System.out.println("╔═════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      Bienvenido a SIMON.                        ║");
        System.out.println("║                                                                 ║");
        System.out.println("║ · Aparecerá una secuencia que tendrás que replicar.             ║");
        System.out.println("║ · La secuencia consta de 4 caracteres: "+ConsoleColors.GREEN_BOLD_BRIGHT+"G"+ConsoleColors.RESET+" - "+ConsoleColors.BLUE_BOLD_BRIGHT+"B"+ConsoleColors.RESET+" - " +ConsoleColors.RED_BOLD_BRIGHT+"R"+ConsoleColors.RESET+" - "+ConsoleColors.YELLOW_BOLD_BRIGHT+"Y"+ConsoleColors.RESET+".           ║");
        System.out.println("║ · Deberás introducir los caracteres utilizando mayúsculas.      ║");
        System.out.println("║ · Al acertar pasarás de nivel y la combinación crecerá.         ║");
        System.out.println("║ · Si fallas perderás una vida pero podrás volver a intentarlo.  ║");
        System.out.println("║ · Dispones de 3 vidas para superar los 9 niveles del reto.      ║");
        System.out.println("║ · Supera el reto e inscríbete en el Hall of Fame.               ║");
        System.out.println("║                                                                 ║");
        System.out.println("║                      Disfruta del juego.                        ║");
        System.out.println("╠══════════════╦════════════════╦═════════════════════╦═══════════╣");
        System.out.println("║ # PRESIONA # ║ "+ConsoleColors.WHITE_UNDERLINED+"1"+ConsoleColors.RESET+" PARA EMPEZAR ║ "+ConsoleColors.WHITE_UNDERLINED+"2"+ConsoleColors.RESET+" PARA HALL OF FAME ║ "+ConsoleColors.WHITE_UNDERLINED+"0"+ConsoleColors.RESET+" TO EXIT ║");
        System.out.println("╚══════════════╩════════════════╩═════════════════════╩═══════════╝");
    }

    public static void Win() throws InterruptedException {
        /*
         Printa el banner de victoria al acertar todas las combinaciones en el último nivel de SIMON.
         */

        System.out.println("\n"+ConsoleColors.CYAN_BOLD+
                "                 ╔════════════════════════════╗\n" +
                "                 ║     ╦ ╦╔═╗╦ ╦  ╦ ╦╦╔╗╔     ║\n" +
                "                 ║     ╚╦╝║ ║║ ║  ║║║║║║║     ║\n" +
                "                 ║      ╩ ╚═╝╚═╝  ╚╩╝╩╝╚╝     ║\n" +
                "                 ╚════════════════════════════╝"+ConsoleColors.RESET+"");
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║                        ¡¡FELICIDADES!!                        ║");
        System.out.println("║                                                               ║");
        System.out.println("║            Has superado con éxito el reto de SIMON.           ║");
        System.out.println("║               Vuelve a jugar siempre que quieras.             ║");
        System.out.println("║               Un nuevo desafío único te espera.               ║");
        System.out.println("║                                                               ║");
        System.out.println("║                         # S I M O N #                         ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
    }


    public static void GameOver() throws InterruptedException {
        /*
         Printa el banner de derrota al terminar todas las vidas para completar SIMON.
         */

        System.out.println("\n"+ConsoleColors.RED_BOLD+
                "                 ╔═════════════════════════════╗\n" +
                "                 ║ ╔═╗╔═╗╔╦╗╔═╗  ╔═╗╦  ╦╔═╗╦═╗ ║\n" +
                "                 ║ ║ ╦╠═╣║║║║╣   ║ ║╚╗╔╝║╣ ╠╦╝ ║\n" +
                "                 ║ ╚═╝╩ ╩╩ ╩╚═╝  ╚═╝ ╚╝ ╚═╝╩╚═ ║\n" +
                "                 ╚═════════════════════════════╝"+ConsoleColors.RESET+"");
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║                     #HAS SIDO DERROTADO#                      ║");
        System.out.println("║                                                               ║");
        System.out.println("║             No has podido superar el reto de SIMON.           ║");
        System.out.println("║             Vuelve a intentarlo siempre que quieras.          ║");
        System.out.println("║               Un nuevo desafío único te espera.               ║");
        System.out.println("║                                                               ║");
        System.out.println("║                         # S I M O N #                         ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
        System.exit(0);
    }

    public static void Final() throws InterruptedException {
        /*
        Printa el banner final una vez el ganador ha introducido su nombre/nick.
         */
        System.out.println("                  # ACTUALIZANDO HALL OF FAME #");
        System.out.println("                   # GRACIAS POR PARTICIPAR #");
        System.out.println("");
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║                         # "+ConsoleColors.GREEN_BOLD_BRIGHT+"S"+ConsoleColors.RESET+ConsoleColors.RED_BOLD_BRIGHT+" I"+ConsoleColors.RESET+ConsoleColors.BLUE_BOLD_BRIGHT+" M"+ConsoleColors.RESET+ConsoleColors.YELLOW_BOLD_BRIGHT+" O"+ConsoleColors.RESET+ConsoleColors.CYAN_BOLD_BRIGHT+" N"+ConsoleColors.RESET+ " #                         ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");

        // Limpiamos terminal
        Thread.sleep(4000);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Salimos del juego
        System.exit(0);
    }
}
