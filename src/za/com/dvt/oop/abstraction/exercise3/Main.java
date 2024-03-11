package za.com.dvt.oop.abstraction.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Birthable> allWithBirthDate = readBirthables(reader);

        String year = reader.readLine();
        filterAndPrintBirthDates(allWithBirthDate, year);
    }

    private static List<Birthable> readBirthables(BufferedReader reader) throws IOException {
        List<Birthable> allWithBirthDate = new ArrayList<>();
        String input = reader.readLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String token = tokens[0];

            switch (token) {
                case "Citizen":
                    allWithBirthDate.add(createCitizen(tokens));
                    break;
                case "Pet":
                    allWithBirthDate.add(createPet(tokens));
                    break;
                default:
                    break;
            }
            input = reader.readLine();
        }
        return allWithBirthDate;
    }

    private static Citizen createCitizen(final String[] tokens) {
        return new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
    }

    private static Pet createPet(final String[] tokens) {
        return new Pet(tokens[1], tokens[2]);
    }

    private static Robot createRobot(final String[] tokens) {
        return new Robot(tokens[1], tokens[2]);
    }

    private static void filterAndPrintBirthDates(final List<Birthable> allWithBirthDate, final String year) {
        for (Birthable birthable : allWithBirthDate) {
            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
