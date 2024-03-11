package za.com.dvt.oop.abstraction.exercise6;

public class Mission {
    private final String codeName;
    private State state;

    public Mission(final String codeName, final String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    private void setState(final String state) {
        if (!(state.equals("inProgress") || state.equals("finished"))) {
            throw new IllegalArgumentException();
        }
        this.state = State.valueOf(state);
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state);
    }
}