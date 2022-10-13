// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // Variables
        int num1, num2, num3;
        int max;
        String errorMessage = "Introdueix un numero enter!";

        // Asking for numbers
        num1 = askInt("Introdueix el primer numero: ", errorMessage);
        num2 = askInt("Introdueix el segon numero: ", errorMessage);
        num3 = askInt("Introdueix el tercer numero: ", errorMessage);

        // Checking bigest number
        max = num1;
        max = num2 > max ? num2 : max;
        max = num3 > max ? num3 : max;

        // Showing max
        System.out.printf("El nombre mes gran es: %d\n", max);
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
}
