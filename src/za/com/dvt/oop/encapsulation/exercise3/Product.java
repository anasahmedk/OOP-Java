package za.com.dvt.oop.encapsulation.exercise3;

public class Product {
    private final String name;
    private double cost;

    public Product(final String name, final double cost) {
        this.name = name;
        this.cost = cost;
    }

    private void setCost(final double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}