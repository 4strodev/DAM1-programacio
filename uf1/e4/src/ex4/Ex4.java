// Author Juan Alejandro Marin Ruiz
package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Variables
        var gridNumbers = new int[2][2];
        var operatedGridNumbers = new int[2][2];
        var multiplier = 0;
        var stdin = new Scanner(System.in);

        // Getting multiplier
        System.out.print("Introdueix un multiplicador: ");
        multiplier = stdin.nextInt();

        // Getting numbers
        for (var numberArray : gridNumbers) {
            for (var i = 0; i < numberArray.length; i++) {
                System.out.print("Introdueix un numero: ");
                numberArray[i] = stdin.nextInt();
            }
        }

        // Multipliying grid
        for (var i = 0; i < gridNumbers.length; i++) {
            for (var j = 0; j < gridNumbers[i].length; j++) {
                operatedGridNumbers[i][j] = gridNumbers[i][j] * multiplier;
            }
        }

        // Get spacing it will be used to display numbers
        int spacing = 1;
        for (var numbersArray : operatedGridNumbers) {
            spacing = Math.max(spacing, getMaxLength(numbersArray));
        }

        // Showing operated numbers
        System.out.println("Taula multiplicada");
        for (var operatedGridNumbersArray : operatedGridNumbers) {
            for (var number : operatedGridNumbersArray) {
                System.out.printf("%" + spacing + "s ", number);
            }
            System.out.println();
        }
    }

    /**
     * Get the largest number of an array of integers
     * NOTE: it can be converted to a generic function
     * @param numbersArray the source where the largest will be extracted
     * @return the largest number of the provided array
     */
    static int getMaxLength(int[] numbersArray) {
        int max = 1;
        for (var number : numbersArray) {
            var numberString = "" + number;
            max = Math.max(numberString.length(), max);
        }
        return max;
    }
}
