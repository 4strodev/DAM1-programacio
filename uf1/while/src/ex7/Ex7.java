// Author Juan Alejandro Marin Ruiz AKA 4strodev
package ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^si?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        String input;

        // Checking user input
        do {
            System.out.print("Vols continuar amb l'execucio del programa: ");
            input = stdin.nextLine();
            matcher = pattern.matcher(input);
        } while (matcher.find());
    }
}
