package za.com.dvt.oop.abstraction.exercise2;

public class Citizen implements Person, Birthable, Identifiable {
    private final String name;
    private final int age;
    private final String id;
    private final String birthDate;

    public Citizen(final String name, final int age, final String id, final String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("Citizen{name='%s', age=%d, id='%s', birthDate='%s'}", name, age, id, birthDate);
    }
}
