package za.com.dvt.oop.polymorphism.exercise4;

import java.util.List;

public class AdvancedCommand extends CommandImpl {
    public AdvancedCommand(final StringBuilder text) {
        super(text);
    }

    @Override
    protected List<Command> initCommands() {
        List<Command> commands = super.initCommands();
        CutTransform cutTransform = new CutTransform();
        commands.add(new Command("cut", cutTransform));
        commands.add(new Command("paste", new PasteTransform(cutTransform)));
        return commands;
    }
}
