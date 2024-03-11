package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private final double caffeine;
    private final double COFFEE_MILLILITERS = 50;
    private final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);

    public Coffee(final String name, final BigDecimal price, final double caffeine) {
        super(name, price, 50);

        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
