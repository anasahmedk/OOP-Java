package za.com.dvt.oop.abstraction.exercise7;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public String remove() {
        return super.getItems().removeLast();
    }

    @Override
    public int add(final String str) {
        super.getItems().addFirst(str);
        return 0;
    }
}
