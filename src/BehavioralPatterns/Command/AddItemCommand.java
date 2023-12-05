package BehavioralPatterns.Command;

public class AddItemCommand implements OrderCommand {
    private Order order;
    private String item;

    public AddItemCommand(Order order, String item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.addItem(item);
    }
}
