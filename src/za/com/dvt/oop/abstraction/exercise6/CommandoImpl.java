package za.com.dvt.oop.abstraction.exercise6;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private final HashSet<Mission> missions;

    public CommandoImpl(final int id, final String firstName, final String lastName, final double salary, final String corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new HashSet<>();
    }

    @Override
    public void addMission(final Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableSet(this.missions);
    }

    @Override
    public String toString() {
        if (this.missions.isEmpty()) {
            return super.toString() + System.lineSeparator() + "Missions:";
        }
        StringBuilder sb = new StringBuilder(String.format("Missions:%n"));

        AtomicInteger br = new AtomicInteger();
        this.missions.forEach(e -> {
            sb.append(" ").append(e);
            if (br.get() != this.missions.size() - 1) {
                sb.append(System.lineSeparator());
            }
            br.getAndIncrement();
        });

        return super.toString() + System.lineSeparator() + sb;
    }
}
