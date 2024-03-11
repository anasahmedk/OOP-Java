package za.com.dvt.oop.encapsulation.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(final String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(final Player player) {
        players.add(player);
    }

    public boolean removePlayer(final String playerName) {
        return players.removeIf(player -> player.getName().equals(playerName));
    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        }
        double totalSkillLevel = players.stream().mapToDouble(Player::overallSkillLevel).sum();
        return totalSkillLevel / players.size();
    }
}