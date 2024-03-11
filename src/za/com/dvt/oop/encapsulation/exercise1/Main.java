package za.com.dvt.oop.encapsulation.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width, height;
        length = scanner.nextDouble();
        width = scanner.nextDouble();
        height = scanner.nextDouble();
        try {
            Box box = new Box(length, width, height);
            System.out.println(String.format("Surface Area - %s", box.surfaceArea()));
            System.out.println(String.format("Lateral Surface Area - %s", box.lateralSurfaceArea()));
            System.out.println(String.format("Volume - %s", box.volume()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}