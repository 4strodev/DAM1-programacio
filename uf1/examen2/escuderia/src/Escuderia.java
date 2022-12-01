// Author Juan Alejandro Marin Ruiz AKA 4strodev

import java.util.HashMap;
import java.util.Scanner;

public class Escuderia {
    public static void main(String[] args) {
        HashMap<String, Bike> bikes = new HashMap<>();
        HashMap<String, Rider> riders = new HashMap<>();
        final var MENU = """
                GESTOR ESCUDERIA
                ================
                1.- Entrar motos
                2.- Entrar Pilots
                3.- Mostrar Motos
                4.- Mostrar Pilots
                0.- Sortir
                """;

        var exit = false;
        while (!exit) {
            var option = inputInt(MENU);

            switch (option) {
                case 1 -> {
                    // Asking how many bikes wants to enter
                    int nBikes;
                    while (true) {
                        nBikes = inputInt("Quantes motos vols entrar? ");
                        if (nBikes <= 0) {
                            System.out.println("No valid!");
                            continue;
                        }
                        break;
                    }

                    // Asking for motorcycles
                    for (int i = 0; i < nBikes; i++) {
                        System.out.println("DADES DE LA MOTO " + (i + 1));
                        var moto = askBike();
                        System.out.println();

                        // Saving bike in a hashmap
                        bikes.put(moto.id, moto);
                    }
                }
                case 2 -> {
                    // If there are no bikes then don't ask for a rider
                    if (!(bikes.size() > 0)) {
                        System.out.println("Has de afegir com a minim una moto abans!");
                        continue;
                    }

                    // Asking how many riders want to show
                    int nRiders;
                    while (true) {
                        nRiders = inputInt("Quants pilots vols entrar? ");
                        if (nRiders <= 0) {
                            System.out.println("No valid!");
                            continue;
                        }
                        break;
                    }

                    // Asking for riders
                    for (int i = 0; i < nRiders; i++) {
                        System.out.println("DADES DEL PILOT " + (i + 1));
                        var rider = askRider(bikes);

                        // Saving rider into hashmap
                        riders.put(rider.hashCode() + "", rider);
                    }
                }
                case 3 -> {
                    System.out.println("MOTOS AFEGIDES");
                    showBikes(bikes);
                }
                case 4 -> {
                    System.out.println("PILOTS AFEGITS");
                    showRiders(riders);
                }
                case 0 -> {
                    exit = true;
                }
                default -> {
                    System.out.println("Opcio no valida!");
                }
            }
        }
    }

    /**
     * Show a message and return the input given by the user
     *
     * @param message
     * @return
     */
    public static String input(String message) {
        Scanner stdin = new Scanner(System.in);

        System.out.print(message);
        return stdin.nextLine();
    }

    /**
     * Show a message and return the integer given by the user
     *
     * @param message
     * @return
     */
    public static int inputInt(String message) {
        var valid = false;
        int number = 0;

        while (!valid) {
            try {
                number = Integer.parseInt(input(message));
                valid = true;
            } catch (Exception exception) {
                System.out.println("No valid!");
            }
        }

        return number;
    }

    /**
     * Show a message and return the double given by the user
     *
     * @param message
     * @return
     */
    public static double inputDouble(String message) {
        var valid = false;
        double number = 0;

        while (!valid) {
            try {
                number = Double.parseDouble(input(message));
                valid = true;
            } catch (Exception exception) {
                System.out.println("No valid!");
            }
        }

        return number;
    }

    /**
     * Ask for bike data and return a Bike
     * @return
     */
    static Bike askBike() {
        String id = input("ID: ");
        int power = inputInt("Potencia: ");
        double weight = inputDouble("Pes: ");

        return new Bike(id, power, weight);
    }

    /**
     * Ask for rider data and return a Rider
     * @param availableBikes
     * @return
     */
    static Rider askRider(HashMap<String, Bike> availableBikes) {
        String name = input("Nom: ");
        int weight = inputInt("Pes: ");
        Bike bike = new Bike();
        var done = false;

        System.out.println("MOTOS DISPONIBLES");
        showBikes(availableBikes);
        while (!done) {
            var bikeID = input("Quina moto vols? (Introdueix l'id) ");

            bike = availableBikes.get(bikeID);
            if (bike == null) {
                System.out.println("La moto no existeix");
                continue;
            }
            done = true;
        }

        return new Rider(name, weight, bike);
    }

    /**
     * Show the given bikes
     * @param bikes
     */
    static void showBikes(HashMap<String, Bike> bikes) {
        for (var bike : bikes.values()) {
            System.out.println("================");
            System.out.println(bike);
            System.out.println();
        }
    }

    /**
     * Show the given riders
     * @param riders
     */
    static void showRiders(HashMap<String, Rider> riders) {
        for (var rider : riders.values()) {
            System.out.println("================");
            System.out.println(rider);
            System.out.println();
        }
    }
}