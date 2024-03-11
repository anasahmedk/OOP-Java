package za.com.dvt.oop.abstraction.exercise6;

import java.util.Collection;

public interface Commando {
    void addMission(final Mission mission);

    Collection<Mission> getMissions();
}