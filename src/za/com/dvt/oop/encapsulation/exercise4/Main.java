package za.com.dvt.oop.encapsulation.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Team> teams = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!(command = scanner.nextLine()).equals("END")) {
            processCommand(command);
        }
    }

    public static void processCommand(final String command) {
        String[] parts = command.split(";");
        String action = parts[0];
        String teamName = parts[1];

        switch (action) {
            case "Team":
                createTeam(teamName);
                break;
            case "Add":
                addPlayerToTeam(teamName, parts);
                break;
            case "Remove":
                removePlayerFromTeam(teamName, parts[2]);
                break;
            case "Rating":
                printTeamRating(teamName);
                break;
            default:
                System.out.println("Invalid command.");
        }
    }

    private static void createTeam(final String teamName) {
        if (teamName == null || teamName.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
            return;
        }
        teams.put(teamName, new Team(teamName));
    }

    private static void addPlayerToTeam(final String teamName, String[] parts) {
        if (!teams.containsKey(teamName)) {
            System.out.println("Team " + teamName + " does not exist.");
            return;
        }

        Team team = teams.get(teamName);
        String playerName = parts[2];
        int endurance = Integer.parseInt(parts[3]);
        int sprint = Integer.parseInt(parts[4]);
        int dribble = Integer.parseInt(parts[5]);
        int passing = Integer.parseInt(parts[6]);
        int shooting = Integer.parseInt(parts[7]);

        try {
            team.addPlayer(new Player(playerName, endurance, sprint, dribble, passing, shooting));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removePlayerFromTeam(final String teamName, final String playerName) {
        if (!teams.containsKey(teamName)) {
            System.out.println("Team " + teamName + " does not exist.");
            return;
        }

        Team team = teams.get(teamName);
        boolean playerRemoved = team.removePlayer(playerName);
        if (!playerRemoved) {
            System.out.println("Player " + playerName + " is not in " + teamName + " team.");
        }
    }

    private static void printTeamRating(final String teamName) {
        if (!teams.containsKey(teamName)) {
            System.out.println("Team " + teamName + " does not exist.");
            return;
        }

        Team team = teams.get(teamName);
        System.out.println(Math.round(team.getRating()));
    }
}