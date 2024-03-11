package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Beverages extends Product {
    public String name;
    public BigDecimal price;
    public double milliliters;

    public Beverages(final String name, final BigDecimal price, final double milliliters) {
        this.name = name;
        this.price = price;
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
