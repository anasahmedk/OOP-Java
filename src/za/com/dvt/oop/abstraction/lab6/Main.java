package za.com.dvt.oop.abstraction.lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Ferrari ferrari = new Ferrari(input);

        System.out.println(ferrari);
    }
}