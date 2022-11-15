import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "septembre", "octubre", "novembre", "desembre"};
        double[] tempBanyoles = new double[12];
        double[] tempPorqueres = new double[12];
        String maxTempTown = "";
        String minTempTown = "";
        String maxTempMonth = months[0];
        String minTempMonth = months[0];
        double max = 0;
        double min = 0;
        double banyolesTempAvg = 0;
        double porqueresTempAvg = 0;

        // Asking for temperatures
        System.out.println("Banyoles");
        populateArray(tempBanyoles, months);
        System.out.println("Porqueres");
        populateArray(tempPorqueres, months);

        // Showing temperatures
        System.out.println("Banyoles");
        for (int i = 0; i < tempBanyoles.length; i++) {
            System.out.printf("%s: %.2f\n", months[i], tempBanyoles[i]);
        }
        System.out.println("Porqueres");
        for (int i = 0; i < tempPorqueres.length; i++) {
            System.out.printf("%s: %.2f\n", months[i], tempPorqueres[i]);
        }

        // Getting max and min
        maxTempTown = "Banyoles";
        minTempTown = "Banyoles";
        maxTempMonth = months[0];
        minTempMonth = months[0];
        max = tempBanyoles[0];
        min = tempBanyoles[0];

        for (int i = 0; i < tempBanyoles.length; i++) {
            if (max < tempBanyoles[i]) {
                max = tempBanyoles[i];
                maxTempMonth = months[i];
                maxTempTown = "Banyoles";
            }
        }

        for (int i = 0; i < tempPorqueres.length; i++) {
            if (max < tempPorqueres[i]) {
                max = tempPorqueres[i];
                maxTempMonth = months[i];
                maxTempTown = "Porqueres";
            }
        }

        for (int i = 0; i < tempBanyoles.length; i++) {
            if (min > tempBanyoles[i]) {
                min = tempBanyoles[i];
                minTempMonth = months[i];
                minTempTown = "Banyoles";
            }
        }

        for (int i = 0; i < tempPorqueres.length; i++) {
            if (min > tempPorqueres[i]) {
                min = tempPorqueres[i];
                minTempMonth = months[i];
                minTempTown = "Porqueres";
            }
        }

        System.out.printf("Temperatura maxima a %s el mes de %s\n", maxTempTown, maxTempMonth);
        System.out.printf("Temperatura minima a %s el mes de %s\n", minTempTown, minTempMonth);

        // Calc average
        banyolesTempAvg = getAverage(tempBanyoles.clone());
        porqueresTempAvg = getAverage(tempPorqueres.clone());

        System.out.printf("Temperatura mitja de Banyoles: %.2f\n", banyolesTempAvg);
        System.out.printf("Temperatura mitja de Porqueres: %.2f\n", porqueresTempAvg);
    }

    static double askDouble(String message, String errorMessage) {
        Scanner stdin = new Scanner(System.in);
        double number = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.print(message);
                number = Double.parseDouble(stdin.nextLine());
                done = true;
            } catch (Exception exception) {
                System.out.print(errorMessage);
            }
        }

        return number;
    }

    static void populateArray(double[] array, String[] months) {
        String inputMessage;
        for (int i = 0; i < array.length; i++) {
            inputMessage = String.format("Temperatura mitja del mes %s: ", months[i]);
            double temperature = askDouble(inputMessage, "Ha de ser un numero decimal!\n");
            array[i] = temperature;
        }
    }

    static double getAverage(double[] array) {
        return Arrays.stream(array).reduce(Double::sum).getAsDouble() / array.length;
    }
}