package za.com.dvt.oop.abstraction.lab3;

public class Chinese implements Person {

    private final String name;

    public Chinese(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
