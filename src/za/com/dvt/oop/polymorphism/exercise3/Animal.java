package za.com.dvt.oop.polymorphism.exercise3;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private Integer foodEaten;

    protected Animal(final String animalName, final String animalType, final Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public abstract void eat(final Food food);

    public String getAnimalName() {
        return animalName;
    }


    public String getAnimalType() {
        return animalType;
    }


    public Double getAnimalWeight() {
        return animalWeight;
    }


    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(final Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

}