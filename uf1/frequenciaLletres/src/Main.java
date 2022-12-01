import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phrase = input("Introdueix una frase: ");
        byte[] characters = new byte[26];

        for (char character : phrase.toUpperCase().toCharArray()) {
            byte asciiByte = (byte) character;
            int index;

            if (!(65 <= asciiByte && asciiByte <= 90)) {
                continue;
            }

            index = asciiByte - 'A';
            characters[index]++;
        }

        for (int i = 0; i < characters.length; i++) {
            System.out.printf("%s: %s\n", (char) (i + 65), characters[i]);
        }
    }

    static String input(String message) {
        Scanner stdin = new Scanner(System.in);

        System.out.print(message);
        return stdin.nextLine();
    }
}