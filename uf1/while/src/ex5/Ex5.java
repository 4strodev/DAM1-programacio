// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Variables
        String inputMessage = "Introdueix un nombre mes gran que 0: ";
        String errorMessage = "Ha de ser un nombre!";
        double inputNumber;
        double sum = 0;

        // Asking numbers and getting sum
        do {
            inputNumber = askDouble(inputMessage, errorMessage);
            sum += inputNumber > 0 ? inputNumber : 0;
        } while (inputNumber != 0);

        // Showing sum
        System.out.printf("La suma total es: %f\n", sum);
    }
    static double askDouble(String message, String errorMessage) {
        Scanner stdin = new Scanner(System.in);
        double number = 0;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(message);
                number = Double.parseDouble(stdin.nextLine());
                exit = true;
            } catch(Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }
}
