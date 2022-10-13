// Author: Juan Alejandro Marin Ruiz
package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Variables
        int num1 = 0;
        int num2 = 0;
        Scanner stdin = new Scanner(System.in);

        // Asking for numbers
        System.out.print("Introdueix un numero: ");
        num1 = stdin.nextInt();
        System.out.print("Introdueix un altre numero: ");
        num2 = stdin.nextInt();

        // Making operations
        System.out.printf("Suma: %d\n", num1 + num2);
        System.out.printf("Resta: %d\n", num1 - num2);
        System.out.printf("Multiplicacio: %d\n", num1 * num2);
        System.out.printf("Divisio: %f\n", (float) num1 / num2);
    }
}
