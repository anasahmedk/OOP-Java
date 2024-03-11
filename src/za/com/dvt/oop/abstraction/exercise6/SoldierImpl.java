package za.com.dvt.oop.abstraction.exercise6;

public abstract class SoldierImpl implements Soldier {
    private final int id;
    private final String firstName;
    private final String lastName;

    public SoldierImpl(final int id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }
}