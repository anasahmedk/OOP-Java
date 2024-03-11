package za.com.dvt.oop.polymorphism.excercise2;

public class Truck extends Vehicles implements Drivable {

    public Truck(final double fuelQuantity, final double fuelConsumption, final double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, 1.6);
    }

    @Override
    public void refuel(final double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.setFuelQuantity(super.getFuelQuantity() + liters * 0.95);
    }
}