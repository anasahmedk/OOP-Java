package za.com.dvt.oop.inheritence.exercise2;

import za.com.dvt.oop.inheritence.exercise2.zoo.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Animal animal = new Animal(name);

        System.out.println(animal.getName());
    }
}
