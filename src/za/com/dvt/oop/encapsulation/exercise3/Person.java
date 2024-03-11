package za.com.dvt.oop.encapsulation.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final String name;
    private double money;
    private final List<Product> products;

    public Person(final String name, final double money) {
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();
    }

    public void buyProduct(final Product product) {
        if (this.money >= product.getCost()) {
            this.products.add(product);
            this.money -= product.getCost();
            System.out.println(this.name + " bought " + product.getName());
        } else {
            System.out.println(this.name + " can't afford " + product.getName());
        }
    }

    public void setMoney(final double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }
}
