import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Car> carArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("""
                Introdueix cotxes indefinidament.
                Per sortir escriu 'fi'""");
        var counter = 1;
        while (true) {
            String end = input("Vols sortir? ");
            if (end.equals("fi"))
                break;

            var car = new Car();
            var valid = false;
            System.out.printf("Cotxe %d\n", counter);
            car.company = input("Introdueix la marca: ");
            car.model = input("Introdueix el model: ");
            while (!valid) {
                try {
                    car.maxSpeed = Double.parseDouble(input("Introdueix la velocitat maxima: "));
                    valid = true;
                } catch (Exception exception) {
                    System.out.println("Ha de ser un numero!");
                }
            }
            pushCar(car);
        }


        for (var car : carArrayList) {
            System.out.printf("Marca: %s\nModel: %s\nVelocitat: %.2f\n", car.company, car.company, car.maxSpeed);
        }
    }

    static String input(String message) {
        Scanner stdin = new Scanner(System.in);
        System.out.print(message);
        return stdin.nextLine();
    }

    static void pushCar(Car car) {
        var carExists = false;

        for (Car carElement : carArrayList) {
            if (carElement.company.equals(car.company) && carElement.model.equals(car.model)) {
                System.out.println("El cotxe ja esta afegit!");
                carExists = true;
                break;
            }
        }

        if (!carExists) {
            carArrayList.add(car);
        }
    }

    static ArrayList<Car> mergeSort(ArrayList<Car> cars) {

    }
}