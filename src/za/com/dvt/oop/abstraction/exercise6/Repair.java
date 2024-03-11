package za.com.dvt.oop.abstraction.exercise6;

public class Repair {
    private final String partName;
    private final int hoursWorked;

    public Repair(final String partName, final int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public String getPartName() {
        return partName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", partName, hoursWorked);
    }
}