package za.com.dvt.oop.inheritence.exercise4;

public class Vehicle {
    public final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(final double fuel, final int horsePower) {
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.fuel = fuel;
        this.horsePower = horsePower;

    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(final double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(final double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(final int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(final double kilometers) {
        double fuelNeeded = kilometers * fuelConsumption;
        if (fuel >= fuelNeeded) {
            fuel -= fuelNeeded;
            System.out.println("Vehicle has driven " + kilometers + "kilometers.");
        } else {
            System.out.println("Not enough fuel to drive " + kilometers + "kilometers");
        }
    }
}
