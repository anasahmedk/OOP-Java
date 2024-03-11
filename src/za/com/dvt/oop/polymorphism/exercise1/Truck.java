package za.com.dvt.oop.polymorphism.exercise1;

import java.text.DecimalFormat;

public class Truck extends Vehicles {

    public Truck(final double fuelQuantity, final double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Overridecd 
    public String drive(final double distance) {
        double totalConsumption = this.getLitersPerKm() + 1.6;
        if (totalConsumption * distance > this.getFuelQuantity()) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.setFuelQuantity(this.getFuelQuantity() - totalConsumption * distance);
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
    }

    @Override
    public void refuel(final double litres) {
        this.setFuelQuantity(this.getFuelQuantity() + litres * 0.95);
    }
}