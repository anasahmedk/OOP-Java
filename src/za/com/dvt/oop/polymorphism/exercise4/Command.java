package za.com.dvt.oop.polymorphism.exercise4;

public class Command {
    private final String text;
    private final TextTransform textTransform;

    public Command(final String text, final TextTransform textTransform) {
        this.text = text;
        this.textTransform = textTransform;
    }

    public String getText() {
        return this.text;
    }

    public TextTransform getTextTransform() {
        return this.textTransform;
    }

}
