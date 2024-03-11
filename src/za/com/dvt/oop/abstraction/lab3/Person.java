package za.com.dvt.oop.abstraction.lab3;

public interface Person {

    String getName();

    default String sayHello() {
        return "Hello";
    }
}
