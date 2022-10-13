// Author Juan Alejandro Marin Ruiz
package ex3;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        // Variables
        Random rand = new Random();

        // Generating random numbers
        int num1 = rand.nextInt(1, 7);
        int num2 = rand.nextInt(1, 7);

        // Showing results
        System.out.printf("Num1: %d \n", num1);
        System.out.printf("Num2: %d \n", num2);
    }
}
