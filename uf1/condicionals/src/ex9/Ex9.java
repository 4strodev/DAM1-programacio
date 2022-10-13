// Author Juan Alejandro Marin Ruiz 4strodev
package ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // Declaring variables
        String menu = """
                MENÚ APLICACIÓ
                Selecciona l'opcio que vols realitzar introduint el nombre indicat.
                1 - Afegir
                2 - Cercar
                3 - Sortir
                """;
        int option;

        // Showing menu
        while (true) {
            option = askInt(menu, "Introdueix un nombre enter!");
            switch (option) {
                case 1 -> System.out.println("L'usuari ha seleccionat Afegir");
                case 2 -> System.out.println("L'usuari ha seleccionat Cercar");
                case 3 -> System.out.println("L'usuari ha seleccionat Sortir");
                default -> System.out.println("Opcio incrrecta, no es realitzara cap operacio");
            }
        }
    }

    static int askInt(String inputMessage, String errorMessage) {
        int number = 0;
        Scanner stdin = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }
}
