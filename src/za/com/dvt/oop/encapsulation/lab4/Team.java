package za.com.dvt.oop.encapsulation.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private final List<Person> firstTeam;
    private final List<Person> reserveTeam;
    private String name;

    public Team(final String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public void addPlayer(final Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
}
