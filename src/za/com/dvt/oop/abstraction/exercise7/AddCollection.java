package za.com.dvt.oop.abstraction.exercise7;

public class AddCollection extends Collection implements Addable {
    @Override
    public int add(final String str) {
        super.getItems().add(str);
        return super.getItems().indexOf(str);
    }
}