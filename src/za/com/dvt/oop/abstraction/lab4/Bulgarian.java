package za.com.dvt.oop.abstraction.lab4;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(final String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
