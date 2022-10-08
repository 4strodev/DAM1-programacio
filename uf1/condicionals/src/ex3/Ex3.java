// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        char character;
        boolean isUpperCase = false;
        boolean isLowerCase = false;

        // Asking for character
        System.out.print("Introdueix una lletra: ");
        character = stdin.nextLine().charAt(0);

        // Checking if a character si uppercase or lowercase
        isLowerCase = character >= 'a' && character <= 'z';
        isUpperCase = character >= 'A' && character <= 'Z';

        // Showing result
        if (isLowerCase) {
            System.out.println("Es una lletra minuscula");
        } else if (isUpperCase) {
            System.out.println("Es una lletra majuscula");
        } else {
            System.out.println("No es una lletra");
        }
    }
}
