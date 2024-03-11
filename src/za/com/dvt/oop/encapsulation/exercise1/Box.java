package za.com.dvt.oop.encapsulation.exercise1;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(final double length, final double width, final double height) {
        setDimensions(length, width, height);
    }

    private final void setDimensions(final double length, final double width, final double height) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative");
        } else if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be negative or zero");
        } else if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double lateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double volume() {
        return length * width * height;
    }
}