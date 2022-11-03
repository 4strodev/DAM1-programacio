// Author Juan Alejandro Marin Ruiz AKA 4strodev
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height = askInt("Especifica l'alçada del quadrat: ", "Ha de ser un nombre enter!");
        int width = askInt("Especifica l'amplada del quadrat: ", "Ha de ser un nombre enter!");

        String menu = """
                Figures disponibles
                1. Quadrat amb fons
                2. Quadrat sense fons
                3. Abaix esquerra
                4. Amunt dreta
                5. Abaix dreta
                6. Amunt esquerra

                0. Srotir
                """;
        int option;

        do {
            System.out.println(menu);
            option = askInt("Quina figura vols mostrar: ", "Ha de ser un numero enter!");

            switch (option) {
                case 0 -> {}
                case 1 -> filledSquare(height, width);
                case 2 -> emptySquare(height, width);
                case 3 -> downLeft(height, width);
                case 4 -> upRight(height, width);
                case 5 -> downRight(height, width);
                case 6 -> upLeft(height, width);
                default -> System.out.println("Opcio no valida");
            }
        } while (option != 0);

    }

    static int askInt(String inputMessage, String outputMessage) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println(outputMessage);
            }
        }

        return number;
    }

    static void filledSquare(int height, int width) {
        for (int row = 1; row <= height; row++) {
            String line = getLine(width, width, false);
            System.out.println(line);
        }
    }

    static void emptySquare(int height, int width) {
        for (int row = 1; row <= height; row++) {
            String line;
            if (row == 1 || row == height) {
                line = getLine(width, width, false);
            } else {
                line = getEmptyLine(width);
            }
            System.out.println(line);
        }
    }

    static void downLeft(int height, int width) {
        for (int row = 1; row <= height; row++) {
            int size = Math.min(row, width);
            String line = getLine(width, size, false);
            System.out.println(line);
        }
    }

    static void downRight(int height, int width) {
        for (int row = 1; row <= height; row++) {
            int size = Math.min(row, width);
            String line = getLine(width, size, true);
            System.out.println(line);
        }
    }

    static void upLeft(int height, int width) {
        for (int row = 0; row < height; row++) {
            int spacing = Math.min(row, width);
            String line = getLine(width, width - spacing, false);
            System.out.println(line);
        }
    }

    static void upRight(int height, int width) {
        for (int row = 0; row < height; row++) {
            int spacing = Math.min(row, width);
            String line = getLine(width, width - spacing, true);
            System.out.println(line);
        }
    }

    static String getLine(int length, int size, boolean reversed) {
        StringBuilder lineItems = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            lineItems.append(" * ");
        }

        return String.format((reversed ? "%" : "%-") + (length * 3) + "s", lineItems);
    }

    static String getEmptyLine(int lenght) {
        StringBuilder lineItems = new StringBuilder();

        for (int i = 1; i <= lenght; i++) {
            lineItems.append(i == 1 || i == lenght ? " * " : "   ");
        }

        return lineItems.toString();
    }
}