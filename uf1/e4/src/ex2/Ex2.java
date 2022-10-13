// Author: Juan Alejandro Marin Ruiz
package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Variables
        int[] numbers = new int[3];
        int subtotal = 0;
        double average = 0;
        Scanner stdin = new Scanner(System.in);

        // Asking for numbers
        for (int i = 0; i < numbers.length; i ++) {
            System.out.printf("%d. Introdueix un numero: ", i);
            numbers[i] = stdin.nextInt();
        }

        // Reduce the array of integers suming all the numbers in a subtotal
        // Integer::sum, sums two values and if we pass a method reference is the same that
        // (subtotal, num) -> subtotal + sum
        // (subtotal, num) -> Integer.sum(subtotal, num)
        // Integer::sum
        subtotal = Arrays.stream(numbers).reduce(0, Integer::sum);
        average = (double) subtotal / numbers.length;

        // Showing result
        System.out.printf("La mitjana es: %.2f\n", average);
    }
}
