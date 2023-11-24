package StructuralPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Order order = new SimpleOrder();

        OrderDecorator onlineOrder = new OnlineOrderDecorator(order);
        OrderDecorator phoneOrder = new PhoneOrderDecorator(order);

        onlineOrder.takeOrder();
        onlineOrder.processOrder();

        System.out.println();

        phoneOrder.takeOrder();
        phoneOrder.processOrder();
    }
}
