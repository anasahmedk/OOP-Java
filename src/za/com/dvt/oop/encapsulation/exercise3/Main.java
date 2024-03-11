package za.com.dvt.oop.encapsulation.exercise3;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = readPeople(scanner);
        Map<String, Product> products = readProducts(scanner);

        processCommands(scanner, people, products);

        printResults(people);
    }

    private static Map<String, Person> readPeople(final Scanner scanner) {
        Map<String, Person> people = new LinkedHashMap<>();
        String[] peopleInput = scanner.nextLine().split(";");
        for (String personInfo : peopleInput) {
            String[] personData = personInfo.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            people.put(name, new Person(name, money));
        }
        return people;
    }

    private static Map<String, Product> readProducts(final Scanner scanner) {
        Map<String, Product> products = new LinkedHashMap<>();
        String[] productsInput = scanner.nextLine().split(";");
        for (String productInfo : productsInput) {
            String[] productData = productInfo.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);
            products.put(name, new Product(name, cost));
        }
        return products;
    }

    private static void processCommands(final Scanner scanner, final Map<String, Person> people, final Map<String, Product> products) {
        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            String[] command = input.split("\\s+");
            String personName = command[0];
            String productName = command[1];

            if (!people.containsKey(personName) || !products.containsKey(productName)) {
                System.out.println("Invalid command!");
                continue;
            }

            Person person = people.get(personName);
            Product product = products.get(productName);
            person.buyProduct(product);
        }
    }

    private static void printResults(final Map<String, Person> people) {
        for (Person person : people.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                List<String> boughtProducts = new ArrayList<>();
                for (Product product : person.getProducts()) {
                    boughtProducts.add(product.getName());
                }
                System.out.println(String.join(", ", boughtProducts));
            }
        }
    }
}
