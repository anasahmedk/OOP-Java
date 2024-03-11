package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    public Salmon(final String name, final BigDecimal price, final double grams) {
        super(name, price, 22);
    }
}
