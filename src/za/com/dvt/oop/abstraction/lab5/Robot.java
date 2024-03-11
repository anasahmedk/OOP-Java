package za.com.dvt.oop.abstraction.lab5;

public class Robot implements Identifiable {
    private final String id;
    private final String model;

    public Robot(final String id, final String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
