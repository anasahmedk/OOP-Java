package za.com.dvt.oop.inheritence.exercise6.animals;

public class Dog extends Animal {

    public Dog(final String name, final int age, final String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Woof!";
    }
}