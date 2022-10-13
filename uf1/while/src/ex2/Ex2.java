// Authro Juan Alejandro Marin Ruiz AKA 4stroev
package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Asking number
        int number = askInt("Introdueix un nombre natural: ", "Has d'introduir un nombre enter");
        int sum = 0;

        // Calculating sum
        int i = 1;
        while (i <= number) {
            sum += i;
            if (i == 1) {
                System.out.printf("%d", i);
            } else if (i == number) {
                System.out.printf(" + %d = %d", i, sum);
            } else {
                System.out.printf(" + %d", i);
            }
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
