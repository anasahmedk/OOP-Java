package za.com.dvt.oop.encapsulation.exercise2;

public class Chicken {

    private String name;

    private int age;

    public Chicken(final String name, final int age) {
        setName(name);
        setAge(age);
    }

    private double calculateProducePerDay() {
        if (age >= 0 && age <= 5)
            return 2.0;
        else if (age >= 5 && age <= 11) {
            return 1.00;
        } else {
            return 0.75;
        }
    }

    public double producePerDay() {
        return calculateProducePerDay();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
}
