// Author Juan Alejandro Marin Ruiz
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = askInt("Introdueix un numero enter: ");
        int number2 = askInt("Introdueix un altre numero enter: ");

        try {
            System.out.printf("%d / %d = %f\n", number1, number2, (float) (number1 / number2));
        } catch (ArithmeticException exception) {
            System.out.println("Error d'aritmetica. Has intentat dividir per zero?");
        } catch (Exception exception) {
            System.out.println(Arrays.toString(exception.getStackTrace()));
        } finally {
            System.out.println("Programa finalitzat");
        }
    }

    static int askInt(String message) {
        Scanner stdin = new Scanner(System.in);
        int number = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.print(message);
                number = Integer.parseInt(stdin.nextLine());
                done = true;
            } catch (Exception exception) {
                System.out.print("El numero ha de ser un enter!\n");
            }
        }

        return number;
    }
}