package za.com.dvt.oop.polymorphism.exercise4;

public class CutTransform implements TextTransform {

    private StringBuilder lastCut;

    @Override
    public void invokeOn(final StringBuilder text, final int startIndex, final int endIndex) {
        this.lastCut = new StringBuilder();
        this.lastCut.append(text, startIndex, endIndex);

        text.delete(startIndex, endIndex);
    }

    public StringBuilder getLastCut() {
        return this.lastCut;
    }

}
