package za.com.dvt.oop.polymorphism.exercise3;

import java.text.DecimalFormat;

public class Mammal extends Animal {
    private final String livingRegion;

    protected Mammal(final String animalName, final String animalType, final Double animalWeight, final String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(final Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            String animalType = "Zebras";
            if (this.getClass().getSimpleName().equals("Mouse")) {
                animalType = "Mice";
            }
            System.out.println(animalType + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s]",
                this.getAnimalType(),
                this.getAnimalName(),
                decimalFormat.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
