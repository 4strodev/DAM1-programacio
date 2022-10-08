// Author Juan Alejandro Marin Ruiz AKA 4strodev
package e1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        float nota = 0;

        // Asking note
        System.out.print("Introdueix la nota de l'estudiant: ");
        nota = stdin.nextFloat();

        // Checking if student has aproved
        if (nota >= 5) {
            System.out.println("L'estudiant ha aprovat");
        } else {
            System.out.println("L'estudiant ha suspes");
        }
    }
}
