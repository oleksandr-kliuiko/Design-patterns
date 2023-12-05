package BehavioralPatterns.Command;

public class Invoker {
    private OrderCommand command;

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
