import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring program variables
        Scanner stdin = new Scanner(System.in);
        double euros = 0;
        double pounds = 0;
        double yens = 0;
        double dollars = 0;

        // Saving currencies symbols
        final String EURO_SYMBOL = "\u20AC";
        final String POUND_SYMBOL = "\u00A3";
        final String YEN_SYMBOL = "\u00A5";
        final String DOLLAR_SYMBOL = "\u0024";

        // Asking for euro value
        System.out.print("Escriu un valor en euros: ");
        euros = stdin.nextDouble();

        dollars = euros * 0.96;
        pounds = euros * 0.90;
        yens = euros * 138.98;

        System.out.printf("Valor entregat: %.2f %s\n", euros, EURO_SYMBOL);
        System.out.printf("Lliures: %.2f %s\n", pounds, POUND_SYMBOL);
        System.out.printf("Dolars: %.2f %s\n", dollars, DOLLAR_SYMBOL);
        System.out.printf("Yens: %.2f %s\n", yens, YEN_SYMBOL);
    }
}

