package za.com.dvt.oop.inheritence.exercise1.person;

public class Person {
    private final String name;
    private final int age;

    protected Person(final String name, final int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
