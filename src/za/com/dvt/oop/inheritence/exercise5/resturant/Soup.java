package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Soup extends Starter {
    public Soup(final String name, final BigDecimal price, final double grams, final double calories) {
        super(name, price, grams, calories);
    }
}
