package za.com.dvt.oop.polymorphism.lab2;

public final class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nDJAAF", super.explainSelf());
    }
}
