// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        String name;
        int iterations;

        // Asking name
        System.out.print("Introdueix el teu nom: ");
        name = stdin.nextLine();

        // Asking repetitions
        iterations = askInt("Introdueix el numero de repeticions: ", "Ha de ser un nombre enter!");

        // Showing names
        int i = 0;
        while (i < iterations) {
            System.out.println(name);
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
