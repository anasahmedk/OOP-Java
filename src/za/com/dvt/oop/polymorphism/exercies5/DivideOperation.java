package za.com.dvt.oop.polymorphism.exercies5;

import java.util.ArrayList;
import java.util.List;

public class DivideOperation implements Operation {

    private final List<Integer> operands;
    private int result;

    public DivideOperation() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(final int operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0) / this.operands.get(1);
        }
    }

    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }
}