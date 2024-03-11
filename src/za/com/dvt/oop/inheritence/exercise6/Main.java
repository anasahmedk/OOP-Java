package za.com.dvt.oop.inheritence.exercise6;

import za.com.dvt.oop.inheritence.exercise6.animals.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String infoForAnimalType = reader.readLine();
                if ("Beast!".equals(infoForAnimalType))
                    break;

                makeAnimals(reader, infoForAnimalType);
            }
        }
    }

    private static void makeAnimals(final BufferedReader reader, final String infoForAnimalType) throws IOException {
        String[] animalInfo = reader.readLine().split(" ");

        try {
            Animal animal = createAnimal(infoForAnimalType, animalInfo);
            printAnimalInfo(animal);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Animal createAnimal(final String type, final String[] animalInfo) {
        String name = animalInfo[0];
        int age = Integer.parseInt(animalInfo[1]);
        String gender = animalInfo.length == 3 ? animalInfo[2] : null;

        switch (type) {
            case "Dog":
                return new Dog(name, age, gender);
            case "Cat":
                return new Cat(name, age, gender);
            case "Frog":
                return new Frog(name, age, gender);
            case "Kitten":
                return new Kitten(name, age);
            case "Tomcat":
                return new Tomcat(name, age);
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }

    private static void printAnimalInfo(final Animal animal) {
        String type = animal.getClass().getSimpleName();
        System.out.println(type);
        System.out.printf("%s %s %s\n", animal.getName(), animal.getAge(), getGenderInfo(animal));
        System.out.println(animal.produceSound());
    }

    private static String getGenderInfo(final Animal animal) {
        if (animal instanceof Kitten)
            return "Female";
        else if (animal instanceof Tomcat)
            return "Male";
        else
            return "Unknown";
    }
}
