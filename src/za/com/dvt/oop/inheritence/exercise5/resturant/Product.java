package za.com.dvt.oop.inheritence.exercise5.resturant;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;

    public void Product(final String name, final BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
}
