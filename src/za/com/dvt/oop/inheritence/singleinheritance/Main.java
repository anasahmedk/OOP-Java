package za.com.dvt.oop.inheritence.singleinheritance;

import za.com.dvt.oop.inheritence.hierarchicalinheritance.Cat;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}