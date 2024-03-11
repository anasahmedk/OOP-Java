package za.com.dvt.oop.polymorphism.lab2;

public class Animal {
    private final String name;
    private final String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s",
                this.name,
                this.favouriteFood);
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
