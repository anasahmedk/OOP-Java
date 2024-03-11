package za.com.dvt.oop.inheritence.exercise4;

public class SportCar extends Car {
    public SportCar(final double fuel, final int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(10);
    }
}
