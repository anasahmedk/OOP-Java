package za.com.dvt.oop.abstraction.exercise6;

public class PrivateImpl extends SoldierImpl implements Private, Comparable<PrivateImpl> {
    private final double salary;

    public PrivateImpl(final int id, final String firstName, final String lastName, final double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public int compareTo(PrivateImpl o) {
        return Integer.compare(o.getId(), this.getId());
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary());
    }
}