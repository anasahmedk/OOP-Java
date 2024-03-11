package za.com.dvt.oop.inheritence.randomarraylist;

public class Main {
    public static void main (String[] args) {
        RandomArrayList<String> words = new RandomArrayList<String>();

                words.add("This is the first word");
                words.add("This is the second word");
                words.add("This is the third word");

        System.out.println(words.getRandomElement());
        System.out.println(words.getRandomElement());
        System.out.println(words.getRandomElement());
    }
}
