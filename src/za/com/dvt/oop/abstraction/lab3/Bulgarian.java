package za.com.dvt.oop.abstraction.lab3;

public class Bulgarian implements Person {
    private final String name;

    public Bulgarian(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

