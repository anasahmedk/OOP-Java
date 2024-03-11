package za.com.dvt.oop.abstraction.lab2;

public class Audi extends CarImpl implements Rentable {

    private int minRentDay;
    private Double pricePerDay;

    public Audi(final String model, final String color, final int horsePower,
                final String countryProduces, final int minRentDay, final Double pricePerDay) {

        super(model, color, horsePower, countryProduces);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nMinimum rental period of %d days. Price per day %f",
                getMinRentDay(), getPricePerDay());
    }
}
