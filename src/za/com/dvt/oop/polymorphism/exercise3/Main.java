package za.com.dvt.oop.polymorphism.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();
        String input = readInput(reader);

        int counter = 0;
        Animal animal = null;

        while (!input.equals("End")) {
            String[] lines = input.split("\\s+");

            if (counter % 2 == 0) {
                animal = createAnimal(lines);
                animals.add(animal);
            } else {
                Food food = createFood(lines);
                animal.makeSound();
                animal.eat(food);
            }

            input = readInput(reader);
            counter++;
        }
        animals.forEach(System.out::println);
    }

    private static String readInput(final BufferedReader reader) throws IOException {
        return reader.readLine();
    }

    private static Animal createAnimal(String[] lines) {
        String animalType = lines[0];
        String animalName = lines[1];
        double animalWeight = Double.parseDouble(lines[2]);
        String animalLivingRegion = lines[3];
        Animal animal = null;

        switch (animalType) {
            case "Cat":
                String breed = lines[4];
                animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                break;
            case "Tiger":
                animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                break;
        }
        return animal;
    }

    private static Food createFood(String[] lines) {
        String foodType = lines[0];
        int foodQuantity = Integer.parseInt(lines[1]);
        Food food = null;

        if (foodType.equals("Meat")) {
            food = new Meat(foodQuantity);
        } else if (foodType.equals("Vegetable")) {
            food = new Vegetable(foodQuantity);
        }
        return food;
    }
}