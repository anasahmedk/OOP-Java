package za.com.dvt.oop.polymorphism.exercies5;

public class Extensions {
    public static InputInterpreter buildInterpreter(final CalculationEngine engine) {
        return new InputInterpreter(engine);
    }
}