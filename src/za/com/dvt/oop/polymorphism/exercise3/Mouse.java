package za.com.dvt.oop.polymorphism.exercise3;

public class Mouse extends Mammal {
    protected Mouse(final String animalName, final String animalType, final Double animalWeight, final String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
