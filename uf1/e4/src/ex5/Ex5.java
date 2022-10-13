// Author: Juan Alejandro Marin Ruiz A.K.A. 4strodev
package ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        int sells = 0;
        double income = 0;
        double baseSalary = 800;
        double totalSalary = 0;

        // Showing context menu
        System.out.println("Calculadora de final de mes $)");

        // This can be converted into a function that recieves a callback
        // Asking for sells
        boolean exit = false;
        while (!exit) {
            System.out.print("Introdueix el numero vendes: ");
            sells = stdin.nextInt();
            exit = true;
        }

        cleanConsole();
        // Asking for incoming
        exit = false;
        while (!exit) {
            System.out.print("Introdueix els beneficis totals: ");
            income = stdin.nextInt();
            exit = true;
        }
        cleanConsole();

        // Calculating total salary
        totalSalary = baseSalary + (sells * 170) + (income * 0.05);
        // Showing total salary
        System.out.printf("Salari total: %.3f\n", totalSalary);
    }

    /**
     * Clear the console text
     */
    static void cleanConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
