package za.com.dvt.oop.abstraction.lab2;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(final String model, final String color, final int horsePower,
                final String countryProduces, final Double price) {

        super(model, color, horsePower, countryProduces);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nLeon sells for %f", getPrice());
    }
}
