import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que contiene el Hall of Fame
 * @author Aitor
 */

public class HallFame {

    public static void BannerHall() throws InterruptedException {

        /**
         * Encontramos el banner del Hall of Fame.
         * Utilizamos la función BufferedReader para leer el texto de un archivo determinado e imprimirlo por pantalla.
         * Tenemos la opción de volver al menú principal.
         */

        Scanner input = new Scanner(System.in);

        // Limpiamos terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("                # PRESIONA "+ConsoleColors.WHITE_UNDERLINED+"ENTER"+ConsoleColors.RESET+" PARA VOLVER AL MENU #");
        System.out.println("");
        System.out.println("");


        System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+
                "               ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  \n" +ConsoleColors.RESET+
                "               ╔══════════════════════════════════════╗\n" +
                "               ║  "+ConsoleColors.YELLOW_BOLD_BRIGHT+"╦ ╦╔═╗╦  ╦    ╔═╗╔═╗  ╔═╗╔═╗╔╦╗╔═╗"+ConsoleColors.RESET+"  ║\n" +
                "               ║  "+ConsoleColors.YELLOW_BOLD_BRIGHT+"╠═╣╠═╣║  ║    ║ ║╠╣   ╠╣ ╠═╣║║║║╣"+ConsoleColors.RESET+"   ║\n" +
                "               ║  "+ConsoleColors.YELLOW_BOLD_BRIGHT+"╩ ╩╩ ╩╩═╝╩═╝  ╚═╝╚    ╚  ╩ ╩╩ ╩╚═╝"+ConsoleColors.RESET+"  ║\n" +
                "               ╚══════════════════════════════════════╝\n" +
                ConsoleColors.YELLOW_BOLD_BRIGHT+"               ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ \n"+ConsoleColors.RESET);

        System.out.println("                   ╔═════════════════════════════╗");
        System.out.println("                   ║ Actuales campeones de SIMON ║");
        System.out.println("                   ╚═════════════════════════════╝");

        // Utilizamos el BufferedReader para leer del archivo HallFame.txt la lista de vencedores del reto SIMON.
        try {
                BufferedReader br = new BufferedReader(new FileReader("HallFame.txt"));
                String nick = "";

            while((nick = br.readLine()) != null){
                    System.out.println("                             /"+ConsoleColors.YELLOW_BOLD_BRIGHT+"#"+ConsoleColors.RESET+"/ "+ConsoleColors.WHITE_UNDERLINED+nick+ConsoleColors.RESET);
                }
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }

        // Pulsando "ENTER" volvemos al menú
        input.nextLine();

        // Limpiamos terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Vuelve al menú
        Banners.Instrucciones();
    }
}
