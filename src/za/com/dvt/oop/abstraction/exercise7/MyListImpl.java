package za.com.dvt.oop.abstraction.exercise7;

public class MyListImpl extends Collection implements MyList {
    @Override
    public String remove() {
        return super.getItems().removeFirst();
    }

    @Override
    public int add(final String str) {
        super.getItems().addFirst(str);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
