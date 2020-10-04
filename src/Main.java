import java.io.*;
import java.util.Scanner;

/**
 * Main del juego SIMON
 * @author Aitor
 * @version 2.0
 */

public class Main {

    /**
     * Clase en la que se inicia el array letters y se llama a las distintas clases y banners.
     * Contiene un bucle encargado de recorrer y aumentar el número de levels.
     * Se encarga de comprobar la combinación introducida por el jugador con la creada por el generator.
     * Contiene la función BufferedWritter para escribir en un archivo determinado el texto recibido por input.
     * Para testeo de funciones editar línea 71.
     * @param args Se usa para el array de Strings.
     * @throws InterruptedException Se usa en los sleeps.
     */

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Generator generator = new Generator();
        int levels = 10;
        int lives = 3;
        // Iniciamos el array letters que se lo pasaremos más abajo al generador
        String[] letters = {"G", "R", "B", "Y"};
        int numRandom = (int) Math.round(Math.random() * 3);

        // Limpiamos terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Llamamos al banner Instrucciones
        Banners.Instrucciones();

        // Menu
        int menu = 0;
        do{
            menu = input.nextInt();

            switch (menu){
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    //input.nextLine();
                    break;

                case 2:
                    HallFame.BannerHall();
                    break;

                default:
                    System.out.println("# OPCIÓN INCORRECTA #");
                    break;
            }
        }
        while(menu != 1);

        // Limpiamos terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Thread.sleep(1000);

        // Bucle para crear y recorrer los levels
        for (int i = 0; i < levels; i++) {
            if (i > 8) { // Modificar para testeo i > 0 // LVL 8 por defecto

                // Print del banner WIN cuando terminamos con éxito el level 9
                Banners.Win();
                
                // Vamos a grabar el nombre/nick del ganador
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("HallFame.txt"), true)); // append true = añade el string al archivo existente, no lo sobreescrive

                    String nick;

                    while (true) {
                        System.out.println(" # Introduce tu nombre/nick para grabarlo en el Hall of Fame: #");

                        nick = input.next();

                        bw.write(nick);
                        bw.write("\n");
                        break;
                    }
                    bw.close();
                } catch (IOException e) {
                    System.err.println("Error -> " + e.getMessage());
                }
                // Finaliza la grabación del nombre/nick

                // Limpiamos terminal
                Thread.sleep(1500);
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Banner final y salimos del juego
                Banners.Final();

            }
            if (i == 8) {
                System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "                     -> ->" + ConsoleColors.RESET + " LAST  LEVEL " + ConsoleColors.GREEN_BOLD_BRIGHT + "<- <-" + ConsoleColors.RESET);
            }
            if (lives == 0) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "                     -> ->" + ConsoleColors.RESET + " ULTIMA VIDA " + ConsoleColors.RED_BOLD_BRIGHT + "<- <-" + ConsoleColors.RESET);
            }
            System.out.println("\n" +
                    "                      ╔═╦═╦═╦═╦═╦═══════╗\n" +
                    "                      ║L║V║L║ ║" + (i + 1) + "║" + ConsoleColors.RED_BOLD_BRIGHT + " ♥" + ConsoleColors.RESET + " x " + ConsoleColors.RED_BOLD_BRIGHT +(lives)+ ConsoleColors.RESET +" ║\n" +
                    "                      ╚═╩═╩═╩═╩═╩═══════╝\n");

            Thread.sleep(2000);
            // Aquí se pide una combinación random al generator
            String combination = generator.getRandomCombination(i + 1, letters);

            // Aquí printea la combinación random
            System.out.println(ConsoleColors.WHITE_UNDERLINED + "#SIMON dice...#" + ConsoleColors.RESET);
            Thread.sleep(1000);
            generator.print(combination);

            while (true) {
                System.out.println("Introduzca la combinación: ");
                String intento = input.next();
                System.out.println();

                if (intento.equals(combination)) {
                    System.out.println("¡CORRECTO!");
                    if (i < 8) {
                        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "#NEXT LEVEL#" + ConsoleColors.RESET);
                    }
                    Thread.sleep(1500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                }
                else {
                    lives--;
                    if (lives < 0) {
                        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "#ERROR#" + ConsoleColors.RESET);
                        Thread.sleep(1500);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        // Print del banner GameOver cuando hemos perdido todas las vidas
                        Banners.GameOver();
                    }
                    else {
                        // Aún quedan vidas
                        // Aquí printea la combinación de nuevo
                        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "#ERROR#" + ConsoleColors.RESET);
                        System.out.println("¡Intentalo de nuevo!");
                        Thread.sleep(1500);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if (lives == 0) {
                            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "                     -> ->" + ConsoleColors.RESET + " ULTIMA VIDA " + ConsoleColors.RED_BOLD_BRIGHT + "<- <-" + ConsoleColors.RESET);
                        }
                        if (i == 8) {
                            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "                     -> ->" + ConsoleColors.RESET + " LAST  LEVEL " + ConsoleColors.GREEN_BOLD_BRIGHT + "<- <-" + ConsoleColors.RESET);
                        }
                        System.out.println("\n" +
                                "                      ╔═╦═╦═╦═╦═╦═══════╗\n" +
                                "                      ║L║V║L║ ║" + (i + 1) + "║" + ConsoleColors.RED_BOLD_BRIGHT + " ♥" + ConsoleColors.RESET + " x " + ConsoleColors.RED_BOLD_BRIGHT +(lives)+ ConsoleColors.RESET +" ║\n" +
                                "                      ╚═╩═╩═╩═╩═╩═══════╝\n");

                        Thread.sleep(2000);
                        System.out.println(ConsoleColors.WHITE_UNDERLINED + "#SIMON dice...#" + ConsoleColors.RESET);
                        Thread.sleep(1000);
                        generator.print(combination);
                    }
                }
            }
        }
    }
}