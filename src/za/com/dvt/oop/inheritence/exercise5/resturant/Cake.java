package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    private final double CAKE_GRAMS = 250;
    private final double CAKE_CALORIES = 1000;
    private final BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(final String name, final BigDecimal price, final double calories) {
        super(name, price, 250, calories);

    }
}
