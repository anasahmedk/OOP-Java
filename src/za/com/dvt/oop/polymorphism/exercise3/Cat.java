package za.com.dvt.oop.polymorphism.exercise3;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private final String breed;

    protected Cat(final String animalName, final String animalType, final Double animalWeight, final String livingRegion, final String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %s]",
                this.getAnimalType(),
                this.getAnimalName(),
                this.getBreed(),
                decimalFormat.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
