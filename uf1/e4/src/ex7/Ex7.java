// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // Variables declaration
        Scanner stdin = new Scanner(System.in);
        int[] vector1 = new int[2];
        int[] vector2 = new int[2];
        int escalarProduct = 0;
        // Asking for vector 1
        System.out.print("Introdueix les cooredenades del primer vector: ");
        vector1 = askVector(0, 2);

        // Asking for vector 2
        System.out.print("Introdueix les cooredenades del segon vector: ");
        vector2 = askVector(0, 2);

        for (int i = 0; i < vector1.length; i++) {
            escalarProduct += vector1[i] * vector2[i];
        }

        System.out.printf("Producte escalar: %d\n", escalarProduct);
    }

    static int[] askVector(int first, int last) {
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        String[] vectorElements = line.trim().split(" ");
        int[] vectorNumbers = new int[last - first];

        // Converting vector numbers
        int i = 0;
        for (var element: vectorElements) {
            vectorNumbers[i] = Integer.parseInt(element);
            i++;
        }

        return vectorNumbers;
    }
}
