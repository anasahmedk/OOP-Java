package za.com.dvt.oop.abstraction.exercise6;

import java.util.Collection;

public interface Engineer {
    void addRepair(final Repair repair);

    Collection<Repair> getRepairs();
}