package za.com.dvt.oop.abstraction.lab4;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(final String name) {
        this.setName(name);
    }

    private void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


