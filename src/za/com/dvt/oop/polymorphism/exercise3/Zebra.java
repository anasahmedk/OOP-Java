package za.com.dvt.oop.polymorphism.exercise3;

public class Zebra extends Mammal {
    protected Zebra(final String animalName, final String animalType, final Double animalWeight, final String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
