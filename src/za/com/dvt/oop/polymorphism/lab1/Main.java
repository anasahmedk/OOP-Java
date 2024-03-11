package za.com.dvt.oop.polymorphism.lab1;

public class Main {

    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }
}
// add method does not perform any I/O operations that might throw an
//exception. Removed for ease of readability.