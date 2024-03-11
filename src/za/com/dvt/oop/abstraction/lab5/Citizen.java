package za.com.dvt.oop.abstraction.lab5;

public class Citizen implements Identifiable {
    private final String name;
    private final int age;
    private final String id;

    public Citizen(final String name, final int age, final String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }
}
