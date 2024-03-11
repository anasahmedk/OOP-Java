package za.com.dvt.oop.polymorphism.exercise3;

public abstract class Food {
    private Integer quantity;

    public Food(final Integer quantity) {
        this.setQuantity(quantity);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }
}
