package za.com.dvt.oop.polymorphism.exercise4;

public class Initialization {

    public static CommandInterface buildCommandInterface(final StringBuilder text) {

        CommandInterface commandInterface = new AdvancedCommand(text);
        commandInterface.init();

        return commandInterface;
    }
}
