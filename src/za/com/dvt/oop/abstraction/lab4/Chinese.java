package za.com.dvt.oop.abstraction.lab4;

public class Chinese extends BasePerson implements Person {

    public Chinese(final String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
