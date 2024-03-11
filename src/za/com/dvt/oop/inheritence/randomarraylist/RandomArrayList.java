package za.com.dvt.oop.inheritence.randomarraylist;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    private final Random random;

    public RandomArrayList() {
        super();
        random = new Random();
    }

    public T getRandomElement() {
        if (isEmpty()) {
            return null; // Return null if the list is empty
        }
        int index = random.nextInt(size());
        return remove(index);
    }
}