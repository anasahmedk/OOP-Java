package za.com.dvt.oop.inheritence.exercise4;

public class Car extends Vehicle {

    public Car(final double fuel, final int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(3);
    }
}
