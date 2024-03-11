package za.com.dvt.oop.inheritence.exercise3.hero;

public class Hero {
    private String userName;
    private int level;

    protected Hero(final String userName, final int level) {
        this.userName = userName;
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUserName(),
                this.getLevel());
    }
}
