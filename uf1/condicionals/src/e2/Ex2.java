// Author Juan Alejandro Marin Ruiz AKA 4strodev
package e2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Variables
        Scanner stdin = new Scanner(System.in);
        String password1 = "";
        String password2 = "";

        // Asking user for password
        System.out.print("Introdueix la contrassenya: ");
        password1 = stdin.nextLine();
        System.out.print("Introdueix la contrassenya un altre cop: ");
        password2 = stdin.nextLine();

        // Validating password
        if (password1.length() < 8) {
            System.out.println("La contrassenya ha de ser de 8 caracters com a minim");
        } else if (!password1.equals(password2)) {
            System.out.println("Les contrassenyes no coincideixen");
        } else {
            System.out.println("Contrassenya valida");
        }
    }
}
