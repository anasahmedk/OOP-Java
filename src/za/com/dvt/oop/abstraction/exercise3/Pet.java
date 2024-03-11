package za.com.dvt.oop.abstraction.exercise3;

public class Pet implements Birthable {
    private final String name;
    private final String birthDate;

    public Pet(final String name, final String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
