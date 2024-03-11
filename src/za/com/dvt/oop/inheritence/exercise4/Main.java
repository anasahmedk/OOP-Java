package za.com.dvt.oop.inheritence.exercise4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(62, 150);
        Motorcycle motorcycle = new Motorcycle(30, 25);
        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(20, 200);
        CrossMotorcycle crossMotorcycle = new CrossMotorcycle(25, 80);
        Car car = new Car(60, 200);
        FamilyCar familyCar = new FamilyCar(70, 180);
        SportCar sportCar = new SportCar(40, 605);

        vehicle.drive(100);
        motorcycle.drive(8);
        raceMotorcycle.drive(18);
        crossMotorcycle.drive(30);
        car.drive(12.8);
        familyCar.drive(150);
        sportCar.drive(23);
    }
}
