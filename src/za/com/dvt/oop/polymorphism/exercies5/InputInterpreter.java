package za.com.dvt.oop.polymorphism.exercies5;

import java.util.ArrayDeque;

public class InputInterpreter {
    private final CalculationEngine engine;
    private final ArrayDeque<Integer> memory;

    public InputInterpreter(final CalculationEngine engine) {
        this.engine = engine;
        this.memory = new ArrayDeque<>();
    }

    public void interpret(final String input) {
        try {
            engine.pushNumber(Integer.parseInt(input));
        } catch (Exception ex) {
            engine.pushOperation(this.getOperation(input));
        }
    }

    public Operation getOperation(final String operation) {

        return switch (operation) {
            case "*" -> new MultiplicationOperation();
            case "/" -> new DivideOperation();
            case "ms" -> new MemorySaveOperation(this.memory);
            case "mr" -> new MemoryRecallOperation(this.memory);
            default -> null;
        };
    }
}