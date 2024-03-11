package za.com.dvt.oop.polymorphism.exercise3;

public class Feline extends Mammal {
    protected Feline(final String animalName, final String animalType, final Double animalWeight, final String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());

    }
}