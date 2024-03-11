package za.com.dvt.oop.polymorphism.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Vehicles car = createVehicle(reader);
        Vehicles truck = createVehicle(reader);

        int numOfCommands = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfCommands; i++) {
            String[] lines = reader.readLine().split("\\s+");
            String command = lines[0];
            String vehicleType = lines[1];
            double value = Double.parseDouble(lines[2]);

            switch (command) {
                case "Drive":
                    driveVehicle(vehicleType, car, truck, value);
                    break;
                case "Refuel":
                    refuelVehicle(vehicleType, car, truck, value);
                    break;
                default:
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }

    private static void driveVehicle(final String vehicleType, Vehicles car, Vehicles truck, final double value) {
        switch (vehicleType) {
            case "Car":
                System.out.println(car.drive(value));
                break;
            case "Truck":
                System.out.println(truck.drive(value));
                break;
        }
    }

    private static void refuelVehicle(final String vehicleType, Vehicles car, Vehicles truck, final double value) {
        switch (vehicleType) {
            case "Car":
                car.refuel(value);
                break;
            case "Truck":
                truck.refuel(value);
                break;
        }
    }

    private static Vehicles createVehicle(BufferedReader bufferedReader) throws IOException {
        String[] lines = bufferedReader.readLine().split("\\s+");

        String vehicleType = lines[0];
        double fuelQuantity = Double.parseDouble(lines[1]);
        double fuelConsumption = Double.parseDouble(lines[2]);

        return switch (vehicleType) {
            case "Car" -> new Car(fuelQuantity, fuelConsumption);
            case "Truck" -> new Truck(fuelQuantity, fuelConsumption);
            default -> null;
        };
    }
}
