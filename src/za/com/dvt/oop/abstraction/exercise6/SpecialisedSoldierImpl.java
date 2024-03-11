package za.com.dvt.oop.abstraction.exercise6;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(final int id, final String firstName, final String lastName, final double salary, final String corps) {
        super(id, firstName, lastName, salary);
        this.setCorp(corps);
    }

    private void setCorp(final String corps) {
        if (!(corps.equals("Airforces") || corps.equals("Marines"))) {
            throw new IllegalArgumentException();
        }
        this.corps = Corps.valueOf(corps);
    }

    @Override
    public Corps getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + String.format("Corps: %s", corps);
    }

}