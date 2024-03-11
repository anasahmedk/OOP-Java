package za.com.dvt.oop.polymorphism.exercise3;

public class Tiger extends Feline {

    protected Tiger(final String animalName, final String animalType, final Double animalWeight, final String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(final Food food) {
        if (food instanceof Meat) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            System.out.println(this.getAnimalType() + "s are not eating that type of food!");
        }
    }
}
