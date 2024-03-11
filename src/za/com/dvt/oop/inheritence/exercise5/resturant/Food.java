package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Food extends Product {

    public String name;

    public BigDecimal price;
    public double grams;

    public Food(final String name, final BigDecimal price, final double grams) {
        this.name = name;
        this.price = price;
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
