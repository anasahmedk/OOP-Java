package za.com.dvt.oop.polymorphism.exercise4;

public class PasteTransform implements TextTransform {
    private final CutTransform cutTransform;

    public PasteTransform(final CutTransform cutTransform) {
        this.cutTransform = cutTransform;
    }

    @Override
    public void invokeOn(final StringBuilder text, final int startIndex, final int endIndex) {
        text.replace(startIndex, endIndex, this.cutTransform.getLastCut().toString());
    }
}
