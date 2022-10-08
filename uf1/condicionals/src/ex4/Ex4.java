// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Variables
        boolean exit = false;
        Scanner stdin = new Scanner(System.in);
        int number = 0;

        // Asking for a number
        while (!exit) {
            try {
                System.out.print("Introdueix un numero enter: ");
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println("Introdueix un numero enter!");
            }
        }

        // Checking if number is even or odd
        if (number % 2 ==0) {
            System.out.println("El nombre es parell");
        } else {
            System.out.println("El nombre es senar");
        }
    }
}
