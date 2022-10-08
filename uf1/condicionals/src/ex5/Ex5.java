// Author Juan Alejandro Marin AKA 4strodev
package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Variables
        int day = 0, month = 0, year = 0;
        String nameDay, nameMonth;
        boolean leapYear = false;
        String errorMessage = "Introdueix un nombre enter";

        // Asking for date
        day = askIntSecure("Introdueix el dia de la setmana: ", errorMessage);
        month = askIntSecure("Introdueix el mes: ", errorMessage);
        year = askIntSecure("Introdueix l'any: ", errorMessage);

        // Getting day name
        nameDay = switch (day) {
            case 1 -> "Dilluns";
            case 2 -> "Dimarts";
            case 3 -> "Dimecres";
            case 4 -> "Dijous";
            case 5 -> "Divendres";
            case 6 -> "Dissabte";
            case 7 -> "Diumenge";
            default -> "Nombre del dia no valid";
        };

        // Getting moth name
        nameMonth = switch (month) {
            case 1 -> "Gener";
            case 2 -> "Febrer";
            case 3 -> "Març";
            case 4 -> "Abril";
            case 5 -> "Maig";
            case 6 -> "Juny";
            case 7 -> "Juliol";
            case 8 -> "Agost";
            case 9 -> "Septembre";
            case 10 -> "Octubre";
            case 11 -> "Novembre";
            case 12 -> "Desembre";
            default -> "Nombre del mes no valid";
        };

        // checking leap year
        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0) {
            leapYear = year % 400 == 0;
        }

        // Showing results
        System.out.printf("Nom del dia: %s\n", nameDay);
        System.out.printf("Nom del mes: %s\n", nameMonth);
        System.out.printf("Any de traspas: %s\n", leapYear ? "Si" : "No");
    }

    static int askIntSecure(String inputMessage, String errorMessage) {
        Scanner stdin = new Scanner(System.in);
        boolean exit = false;
        int askInt = 0;

        while (!exit) {
            try {
                System.out.print(inputMessage);
                askInt = Integer.parseInt(stdin.nextLine());
                exit = true;
            } catch (Exception exception) {
                System.out.println(errorMessage);
            }
        }

        return askInt;
    }
}
