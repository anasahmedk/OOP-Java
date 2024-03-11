package za.com.dvt.oop.polymorphism.exercise1;

public abstract class Vehicles {
    private double fuelQuantity;
    private double litersPerKm;

    public Vehicles(final double fuelQuantity, final double litersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(final double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(final double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    protected abstract String drive(final double distance);

    protected abstract void refuel(final double litres);

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.getFuelQuantity());
    }
}