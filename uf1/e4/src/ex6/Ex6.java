// Author Juan Alejandro Marin Ruiz A.K.A. 4strodev
package ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double a, b, c;

        a = askDoubleSafely("Introdueix la variable a: ");
        b = askDoubleSafely("Introdueix la variable b: ");
        c = askDoubleSafely("Introdueix la variable c: ");

        double positiveResult = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
        double negativeResult = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;

        System.out.printf("Resultat positiu: %.3f\n", positiveResult);
        System.out.printf("Resultat negatiu: %.3f\n", negativeResult);
    }

    /**
     * Ask for a double
     *
     * @return Return always a double
     */
    static double askDoubleSafely(String askMessage) {
        // This boolean will be used as flag to still asking for an input
        boolean ask = true;
        double input = 0;
        Scanner stdin = new Scanner(System.in);

        do {
            try {
                System.out.print(askMessage);
                input = stdin.nextDouble();
                ask = false;
            } catch (InputMismatchException error) {
                System.out.print("Valor incorrecte\n");
                stdin.nextLine();
            }
        } while (ask);

        return input;
    }
}
