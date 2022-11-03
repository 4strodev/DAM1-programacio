// Author Juan Alejandro Marin Ruiz AKA 4strodev
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n = 0;
        int sum = 0;
        boolean exit = false;
        String operator = "";

        while (!exit) {
            n = askInt("Introdueix un nombre enter mes gran que 0: ", "Ha de ser un nombre enter");

            // If n is <= 0 ask for a number again
            if (n > 0) {
                exit = true;
            }
        }

        // Calculating sum and showing numbers
        for (int i = 1; i <= n; i ++) {
            sum += i;
            operator = i == n ? "=" : "+";
            System.out.printf("%d %s ", i, operator);
        }

        // Showing sum
        System.out.println(sum);
    }

    static int askInt(String inputMessage, String outputMessage) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                number = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println(outputMessage);
            }
        }

        return number;
    }
}