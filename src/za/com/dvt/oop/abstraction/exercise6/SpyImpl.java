package za.com.dvt.oop.abstraction.exercise6;

public class SpyImpl extends SoldierImpl implements Spy {
    private final String codeNumber;

    public SpyImpl(final int id, final String firstName, final String lastName, final String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%nCode Number: %s", getFirstName(), getLastName(), getId(), getCodeNumber());
    }
}