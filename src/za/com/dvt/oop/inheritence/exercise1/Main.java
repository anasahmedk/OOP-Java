package za.com.dvt.oop.inheritence.exercise1;

import za.com.dvt.oop.inheritence.exercise1.person.Child;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int age = Integer.parseInt(sc.nextLine());
        Child child = new Child(name, age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
