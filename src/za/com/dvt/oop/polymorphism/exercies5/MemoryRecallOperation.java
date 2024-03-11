package za.com.dvt.oop.polymorphism.exercies5;

import java.util.ArrayDeque;

public class MemoryRecallOperation implements Operation {

    ArrayDeque<Integer> memory;

    public MemoryRecallOperation(final ArrayDeque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(final int operand) {

    }

    @Override
    public int getResult() {
        return this.memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return !this.memory.isEmpty();
    }
}