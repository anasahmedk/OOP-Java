package za.com.dvt.oop.polymorphism.excercise2;

public class Car extends Vehicles implements Drivable {
    public Car(final double fuelQuantity, final double fuelConsumption, final double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, 0.9);
    }
}