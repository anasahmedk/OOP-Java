package za.com.dvt.oop.inheritence.exercise4;

public class RaceMotorcycle extends Motorcycle {
    public RaceMotorcycle(final double fuel, final int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(8);
    }
}
