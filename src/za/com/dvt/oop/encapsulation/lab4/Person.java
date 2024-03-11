package za.com.dvt.oop.encapsulation.lab4;

import java.security.InvalidParameterException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(final String firstName, final String lastName, final int age, final double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        if (firstName.length() < 3) {
            throw new InvalidParameterException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        if (lastName.length() < 3) {
            throw new InvalidParameterException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final int age) {
        if (age < 1) {
            throw new InvalidParameterException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        if (salary < 460) {
            throw new InvalidParameterException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", this.firstName, this.lastName, this.salary);
    }

    public void increaseSalary(final double bonus) {
        if (this.age > 30) {
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }
    }
}