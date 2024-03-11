package za.com.dvt.oop.inheritence.exercise6.animals;

public class Animal {
    private final String name;
    private final int age;
    private final String gender;

    public Animal(final String name, final int age, final String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(final String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public void setAge(final int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public void setGender(final String gender) {
        if (gender.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String produceSound() {
        return "Not Implemented";
    }

    @Override
    public String toString() {
        return String.format("%s %d %s\n%s", name, age, gender, produceSound());
    }
}
