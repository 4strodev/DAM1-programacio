// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Variables
        int num1, num2, num3;
        String errorMessage = "Introdueix un numero enter!";

        // Asking for numbers
        num1 = askInt("Introdueix el primer numero: ", errorMessage);
        num2 = askInt("Introdueix el segon numero: ", errorMessage);
        num3 = askInt("Introdueix el tercer numero: ", errorMessage);

        // Checking order
        if (num1 < num2 && num2 < num3) {
            System.out.println("Son de ordre creixent");
        } else {
            System.out.println("No son de ordre creixent");
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
}
