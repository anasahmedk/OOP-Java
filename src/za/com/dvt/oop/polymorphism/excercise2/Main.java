package za.com.dvt.oop.polymorphism.excercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Vehicles car = createVehicle(bufferedReader);
        Vehicles truck = createVehicle(bufferedReader);
        Bus bus = (Bus) createVehicle(bufferedReader);

        int numberOfCommands = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] lines = bufferedReader.readLine().split("\\s+");
            String command = lines[0];
            String vehicleType = lines[1];
            double value = Double.parseDouble(lines[2]);

            try {
                switch (command) {
                    case "Drive":
                        driveVehicle(vehicleType, car, truck, bus, value);
                        break;
                    case "Refuel":
                        refuelVehicle(vehicleType, car, truck, bus, value);
                        break;
                    case "DriveEmpty":
                        bus.setEmpty(true);
                        System.out.println(bus.drive(value));
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void driveVehicle(final String vehicleType, final Vehicles car, final Vehicles truck, final Bus bus, final double value) {
        switch (vehicleType) {
            case "Car":
                System.out.println(car.drive(value));
                break;
            case "Truck":
                System.out.println(truck.drive(value));
                break;
            case "Bus":
                System.out.println(bus.drive(value));
                break;
        }
    }

    private static void refuelVehicle(final String vehicleType, final Vehicles car, final Vehicles truck, final Bus bus, final double value) {
        switch (vehicleType) {
            case "Car":
                car.refuel(value);
                break;
            case "Truck":
                truck.refuel(value);
                break;
            case "Bus":
                bus.refuel(value);
                break;
        }
    }

    private static Vehicles createVehicle(final BufferedReader bufferedReader) throws IOException {
        String[] lines = bufferedReader.readLine().split("\\s+");

        String vehicleType = lines[0];
        double fuelQuantity = Double.parseDouble(lines[1]);
        double fuelConsumption = Double.parseDouble(lines[2]);
        double tankCapacity = Double.parseDouble(lines[3]);

        return switch (vehicleType) {
            case "Car" -> new Car(fuelQuantity, fuelConsumption, tankCapacity);
            case "Truck" -> new Truck(fuelQuantity, fuelConsumption, tankCapacity);
            case "Bus" -> new Bus(fuelQuantity, fuelConsumption, tankCapacity);
            default -> null;
        };
    }
}
