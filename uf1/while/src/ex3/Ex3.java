// Authro Juan Alejandro Marin Ruiz AKA 4stroev
package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Variables
        int number = 0;
        int i = 1;

        // Only accepts integer numbers that are bigger than 0
        while (number <= 0) {
            number = askInt("Introdueix un nombre enter mes gran que 0: ", "Has d'introduir un nombre enter!");
        }

        // Showing numbers
        while (i < number) {
            int square = (int) Math.pow(i, 2);
            int lastDigit = square % 10;

            if (lastDigit < 5) {
                System.out.println(square);
            }
            i++;
        }
    }

    static int askInt(String message, String errorMessage) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(message);
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch(Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }
}
