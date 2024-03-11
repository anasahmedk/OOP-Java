package za.com.dvt.oop.inheritence.exercise6.animals;

public class Kitten extends Cat {
    private static final String gender = null;

    public Kitten(final String name, final int age) {
        super(name, age, gender);
        super.setGender("Female");
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}