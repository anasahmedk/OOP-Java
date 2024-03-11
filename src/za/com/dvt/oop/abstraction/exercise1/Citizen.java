package za.com.dvt.oop.abstraction.exercise1;

public class Citizen implements Person {
    private final String name;
    private final int age;

    public Citizen(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
