package BehavioralPatterns.Command;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        OrderCommand addItemCommand = new AddItemCommand(order, "Cheese");
        OrderCommand addItemCommand2 = new AddItemCommand(order, "Bread");
        OrderCommand removeItemCommand = new RemoveItemCommand(order, "Cheese");
        OrderCommand placeOrderCommand = new PlaceOrderCommand(order);

        Invoker invoker = new Invoker();

        invoker.setCommand(addItemCommand);
        invoker.executeCommand();

        invoker.setCommand(addItemCommand2);
        invoker.executeCommand();

        invoker.setCommand(removeItemCommand);
        invoker.executeCommand();

        invoker.setCommand(placeOrderCommand);
        invoker.executeCommand();
    }
}
