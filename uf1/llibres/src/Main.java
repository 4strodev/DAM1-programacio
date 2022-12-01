import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nBooks = inputInt("Quants llibres vols introduir: ");
        ArrayList<Book> books = new ArrayList<>(nBooks);
        boolean exit = false;

        for (int i = 0; i < nBooks; i++) {
            books.add(inputBook());
        }

        while (!exit) {
            int option = inputInt("""
                    Que vols fer amb els llibres?
                    1. Mostrar llibres
                    2. Buscar llibres
                    3. Sortir
                    """);

            switch (option) {
                case 1 -> {
                    System.out.println("-".repeat(20));
                    for (var book : books) {
                        System.out.println(book);
                        System.out.println("-".repeat(20));
                    }
                }
                case 2 -> {
                    String searchText = input("Introdueix el text a cercar: ").toLowerCase();
                    ArrayList<Book> filteredBooks = new ArrayList<>(
                            books.stream()
                                    .filter(book -> book.title.toLowerCase().contains(searchText))
                                    .toList()
                    );

                    System.out.println("-".repeat(20));
                    for (var book : filteredBooks) {
                        System.out.println(book);
                        System.out.println("-".repeat(20));
                    }
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }
    }

    static String input(String message) {
        Scanner stdin = new Scanner(System.in);
        System.out.print(message);
        return stdin.nextLine();
    }

    static int inputInt(String message) {
        Scanner stdin = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(stdin.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid data");
            }
        }
    }

    static double inputDouble(String message) {
        Scanner stdin = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(stdin.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid data");
            }
        }
    }

    static Book inputBook() {
        Book book = new Book();
        book.author = input("Autor: ");
        book.title = input("Titol: ");
        book.pages = inputInt("Pagines: ");
        book.isbn = inputDouble("ISBN: ");
        boolean validType = false;
        do {
            String type = input("Tipus (KIDS, YOUNG, ADULT, ALL_PUBLICS): ");
            book.type = switch (type) {
                case "KIDS" -> BookType.KIDS;
                case "YOUNG" -> BookType.YOUNG;
                case "ADULT" -> BookType.ADULT;
                case "ALL_PUBLICS" -> BookType.ALL_PUBLICS;
                default -> BookType.NONE;
            };

            if (book.type == BookType.NONE) {
                System.out.println("Invalid data");
                continue;
            }

            validType = true;
        } while (!validType);

        return book;
    }
}