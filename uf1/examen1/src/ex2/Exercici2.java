// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercici2 {
    public static void main(String[] args) {
        int width, height;
        boolean askAgain = false;
        String fillCharacter;
        String continueAnswer;
        Pattern saysYesRegex = Pattern.compile("^s(i?)", Pattern.CASE_INSENSITIVE);

        do {
            // Asking for positive integer numbers
            width = askPositiveInt("Introdueix l'amplada: ", "Ha de ser un nombre enter!", "Ha de ser mes gran que 0!");
            height = askPositiveInt("Introdueix l'alçada: ", "Ha de ser un nombre enter!", "Ha de ser mes gran que 0!");
            fillCharacter = askString("Introdueix un caracter per emplenar el cub: ");

            // If the user puts an empty string the square will not render as we want
            if (fillCharacter.equals("")) {
                fillCharacter = " ";
            }

            for (int row = 1; row <= height; row++) {
                String line;
                if (row == 1 || row == height) {
                    line = getLine(width, width, false);
                } else {
                    line = getEmptyLine(width, fillCharacter);
                }
                System.out.println(line);
            }

            // If user says something like Si, S, si or s... ask again for another square
            continueAnswer = askString("Vols continuar? ").trim();
            Matcher saysYes = saysYesRegex.matcher(continueAnswer);
            askAgain = saysYes.find();
        } while (askAgain);

    }

    static String askString(String message) {
        Scanner stdin = new Scanner(System.in);
        System.out.print(message);
        return stdin.nextLine();
    }

    /**
     * Ask to use by stdin for a positive and integer number
     */
    static int askPositiveInt(String inputMessage, String outputMessage, String negativeNumberMessage) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean exit = false;

        // While exit will be true only when the user puts an integer number
        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Integer.parseInt(stdin.nextLine());
                if (number >= 0) {
                    exit = true;
                    continue;
                }
                System.out.println(negativeNumberMessage);
            } catch (Exception exception) {
                System.out.println(outputMessage);
            }
        }

        return number;
    }

    /**
     * Return a line that is internally empty
     */
    static String getEmptyLine(int length, String fillCharacter) {
        StringBuilder lineItems = new StringBuilder();

        for (int i = 1; i <= length; i++) {
            lineItems.append(i == 1 || i == length ? " * " : String.format(" %s ", fillCharacter));
        }

        return lineItems.toString();
    }

    /**
     * Returns a line with specified length and filled with specified size
     */
    static String getLine(int length, int size, boolean reversed) {
        StringBuilder lineItems = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            lineItems.append(" * ");
        }

        return String.format((reversed ? "%" : "%-") + (length * 3) + "s", lineItems);
    }

}
