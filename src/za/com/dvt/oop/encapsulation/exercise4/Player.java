package za.com.dvt.oop.encapsulation.exercise4;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(final String name, final int endurance, final int sprint, final int dribble, final int passing, final int shooting) {
        this.name = name;
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setEndurance(final int endurance) {
        if (isValidStat(endurance)) {
            this.endurance = endurance;
        } else {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
    }

    private void setSprint(final int sprint) {
        if (isValidStat(sprint)) {
            this.sprint = sprint;
        } else {
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
    }

    private void setDribble(final int dribble) {
        if (isValidStat(dribble)) {
            this.dribble = dribble;
        } else {
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
    }

    private void setPassing(final int passing) {
        if (isValidStat(passing)) {
            this.passing = passing;
        } else {
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
    }

    private void setShooting(final int shooting) {
        if (isValidStat(shooting)) {
            this.shooting = shooting;
        } else {
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
    }

    private boolean isValidStat(final int stat) {
        return stat >= 0 && stat <= 100;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }
}