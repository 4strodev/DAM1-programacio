import java.util.Scanner;

// Fet per Juan Alejandro Marin Ruiz
public class Main {
    public static void main(String[] args) {
        // Variables
        int radius = 0;
        float longitude = 0;
        float area = 0;
        float surface = 0;
        Scanner stdin = new Scanner(System.in);

        // Asking for radius
        System.out.print("Especifica el radi: ");
        radius = stdin.nextInt();

        // Calculating data
        longitude = (float) (2 * Math.PI * radius);
        area = (float) (Math.PI * radius * radius);
        surface = (float) (4 * Math.PI * radius * radius);

        // Showing data
        System.out.printf("Longitud: %.2f\n", longitude);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Superficie: %.2f\n", surface);
    }
}