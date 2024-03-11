package za.com.dvt.oop.abstraction.lab4;

public class European extends BasePerson implements Person {

    public European(final String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
