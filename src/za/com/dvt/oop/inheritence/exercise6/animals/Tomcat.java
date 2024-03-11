package za.com.dvt.oop.inheritence.exercise6.animals;

public class Tomcat extends Cat {

    public Tomcat(final String name, final int age) {
        super(name, age, "Male");
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
