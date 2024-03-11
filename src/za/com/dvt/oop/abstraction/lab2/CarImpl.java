package za.com.dvt.oop.abstraction.lab2;

public class CarImpl implements Car {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduces;

    protected CarImpl(final String model, final String color, final int horsePower, final String countryProduces) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduces = countryProduces;
    }


    public String getModel() {
        return this.model;
    }


    public String getColor() {
        return this.color;
    }


    public Integer getHorsePower() {
        return this.horsePower;
    }


    public String getCountyProduced() {
        return this.countryProduces;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires"
                ,this.getModel()
                ,this.countryProduces
                ,this.TIRES);
    }
}
