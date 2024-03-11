package za.com.dvt.oop.encapsulation.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(String.format("Chicken %s (age %d) can produce %d eggs per day.",
                    chicken.getName(), chicken.getAge(), chicken.producePerDay()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}