// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex1;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        int num1, num2, max, min, result = 1;

        // Asking and ensuring that user puts a number
        num1 = askInt("Introdueix un nombre enter: ", "Ha de ser un nombre enter!");
        num2 = askInt("Introdueix un altre nombre enter: ", "Ha de ser un nombre enter!");

        // Getting the max number and the min number
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);

        // Getting result and showing it
        for (int i = min; i <= max; i++) {
            result *= i;
            if (i == max) {
                System.out.printf("%d = %d\n", i, result);
                continue;
            }

            System.out.printf("%d x ", i);
        }
    }

    /**
     * Ask to use by stdin for an integer number
     */
    static int askInt(String inputMessage, String outputMessage) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean exit = false;

        // While exit will be true only when the user puts an integer number
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

}