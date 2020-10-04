/**
 * Clase que contiene el generador de combinaciones.
 * @author Aitor
 */

public class Generator {

    /**
     Esta clase crea una combinación random con x longitud con las letras que hay en el array letters.
     length define la cantidad de letras que aparecerán en la combinación.
     @return Devuelve la secuencia random creada por el generator.
     @param length Nos genera la longitud de la combinación.
     @param letters Letras que están incluidas en el array.
     */
    public String getRandomCombination(int length, String[] letters){
        String secuencia = new String();
        int numRandom;
        for (int i = 0; i < length; i++){
            numRandom = (int) Math.round(Math.random() * 3);
            secuencia += letters[numRandom];
        }
        return secuencia;
    }

    /**
     Esta función se encarga de printar una combinación con los colores deseados.
     Siempre se repetirá el mismo patrón// G/VERDE // R/ROJO // B/AZUL // Y/AMARILLO.
     Recorre la combinación y printa cada letra con el color asignado.
     Un switch se encarga de filtrar cada letra.
     @param combination Nos genera una combinación random de longitud lenght según el nivel.
     @throws InterruptedException Se usa en los sleeps necesarios.
     */
    public void print(String combination) throws InterruptedException {

        for (int i = 0; i < combination.length(); i++) {
            switch (Character.toString(combination.charAt(i))) {
                case "G":
                    System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT + "G" + ConsoleColors.RESET + "");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    System.out.print(" ");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    break;
                case "R":
                    System.out.print(ConsoleColors.RED_BOLD_BRIGHT + "R" + ConsoleColors.RESET + "");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    System.out.print(" ");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    break;
                case "B":
                    System.out.print(ConsoleColors.BLUE_BOLD_BRIGHT + "B" + ConsoleColors.RESET + "");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    System.out.print(" ");
                    Thread.sleep(1000);
                    System.out.print("\r");

                    break;
                case "Y":
                    System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT + "Y" + ConsoleColors.RESET + "");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    System.out.print(" ");
                    Thread.sleep(1000);
                    System.out.print("\r");
                    break;
                default:
                    break;
            }
        }
        System.out.print("\r");
    }
}
