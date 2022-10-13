// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Variables
        int[] arrayNum = new int[3];
        String errorMessage = "Introdueix un numero enter!";

        // Asking for numbers
        arrayNum[0] = askInt("Introdueix el primer numero: ", errorMessage);
        arrayNum[1] = askInt("Introdueix el segon numero: ", errorMessage);
        arrayNum[2] = askInt("Introdueix el tercer numero: ", errorMessage);

        // Sorting numbers
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum.length - 1; j++) {
                if (arrayNum[j] > arrayNum[j + 1]) {
                    int aux = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = aux;
                }
            }
        }

        // Showing array
        System.out.println(Arrays.toString(arrayNum));
    }

    static int askInt(String inputMessage, String errorMessage) {
        int number = 0;
        Scanner stdin = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return number;
    }
}
