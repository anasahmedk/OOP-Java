package za.com.dvt.oop.abstraction.exercise7;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private final int maxSize = 100;
    private final List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }

    public List<String> getItems() {
        return items;
    }
}