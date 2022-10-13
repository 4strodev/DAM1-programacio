// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // Variables
        double squareMeters;
        int option;
        String menu = """
                Tria el format de conversio:
                1. mm2
                2. cm2
                3. dm2
                4. hm2
                5. km2
                6. yd2
                """;

        // Asking area
        squareMeters = askInt("Introdueix els metres quadrats: ", "Has d'introduir un numero decimal");
        option = askInt(menu, "Has d'introduir un numero enter");

        // Showing conversion
        switch (option) {
            case 1 -> System.out.println(squareMeters * 1000000);
            case 2 -> System.out.println(squareMeters * 10000);
            case 3 -> System.out.println(squareMeters * 100);
            case 4 -> System.out.println(squareMeters * 0.0001);
            case 5 -> System.out.println(squareMeters * 0.000001);
            case 6 -> System.out.println(squareMeters * 1.19599);
            default -> System.out.println("Opcio no valida");
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
            } catch(Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }

    static double askDouble(String inputMessage, String errorMessage) {
        double number = 0;
        Scanner stdin = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Double.parseDouble(stdin.nextLine());
                exit = true;
            } catch(Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }
}
