// Authro Juan Alejandro Marin Ruiz AKA 4stroev
package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Asking number
        int number = askInt("Introdueix un nombre natural: ", "Has d'introduir un nombre enter");

        // Showing numbers
        int i = 0;
        while (i <= number) {
            System.out.println(i);
            i ++;
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
