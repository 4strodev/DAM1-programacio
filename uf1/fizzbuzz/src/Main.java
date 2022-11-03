// Author Juan Alejandro Marin Ruiz AKA 4strodev
public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            boolean fizzbuzz = false;

            // If is multiple of 3 print Fizz
            if (number % 3 == 0) {
                fizzbuzz = true;
                System.out.print("Fizz");
            }

            // If is multiple of 5 print Buzz
            if (number % 5 == 0) {
                fizzbuzz = true;
                System.out.print("Buzz");
            }

            // If fizz or buzz wasn't printed then print the number
            if (!fizzbuzz) {
                System.out.print(number);
            }

            System.out.println();
        }
    }
}