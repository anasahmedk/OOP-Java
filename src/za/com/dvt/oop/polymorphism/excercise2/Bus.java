package za.com.dvt.oop.polymorphism.excercise2;

public class Bus extends Vehicles implements Drivable {

    private boolean isEmpty = false;

    public Bus(final double fuelQuantity, final double fuelConsumption, final double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, 1.4);
    }

    @Override
    public String drive(final double distance) {
        if (this.isEmpty) {
            super.setCONSUMPTION_INCREASE_VALUE(0);
            this.isEmpty = false;
        }

        String result = super.drive(distance);

        super.setCONSUMPTION_INCREASE_VALUE(1.4);

        return result;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }
}