package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Starter extends Food {
    private final double calories;

    public Starter(final String name, final BigDecimal price, final double grams, final double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
