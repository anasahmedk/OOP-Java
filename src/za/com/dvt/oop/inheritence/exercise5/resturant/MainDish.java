package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class MainDish extends Food {
    public MainDish(final String name, final BigDecimal price, final double grams) {
        super(name, price, grams);
    }
}
