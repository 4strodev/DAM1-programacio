import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phrase = input("Introdueix una frase: ");
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);

        // Show how many characters phrase has
        System.out.printf("Caracters: %d\n", phrase.length());
        System.out.printf("Vocals: %d\n", phrase.length() - matcher.replaceAll("").length());

        // Show modified string
        System.out.println(matcher.replaceAll("*"));
        System.out.println(reverseString(phrase));
    }

    static String input(String message) {
        Scanner stdin = new Scanner(System.in);
        System.out.print(message);
        return stdin.nextLine();
    }

    static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i --) {
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }
}