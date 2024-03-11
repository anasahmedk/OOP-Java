package za.com.dvt.oop.polymorphism.exercies5;

import java.util.ArrayDeque;

public class MemorySaveOperation implements Operation {

    private final ArrayDeque<Integer> memory;

    public MemorySaveOperation(final ArrayDeque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(final int operand) {
        this.memory.push(operand);
    }

    @Override
    public int getResult() {
        return this.memory.peek();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}