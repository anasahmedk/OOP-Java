package za.com.dvt.oop.polymorphism.exercies5;

public class CalculationEngine {
    private int result;
    private Operation currentOperation;

    public CalculationEngine() {
        this.result = 0;
        this.currentOperation = null;
    }

    public void pushNumber(final int number) {
        if (this.currentOperation != null) {
            currentOperation.addOperand(number);

            if (currentOperation.isCompleted()) {
                this.result = currentOperation.getResult();
                this.currentOperation = null;
            }
        } else {
            this.result = number;
        }
    }

    void pushOperation(final Operation operation) {
        if (operation.isCompleted()) {
            this.pushNumber(operation.getResult());
        } else {
            this.currentOperation = operation;
            this.pushNumber(this.result);
        }
    }

    int getCurrentResult() {
        return this.result;
    }
}