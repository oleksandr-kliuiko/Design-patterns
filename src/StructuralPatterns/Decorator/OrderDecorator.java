package StructuralPatterns.Decorator;

public abstract class OrderDecorator implements Order {
    private Order orderDecorator;
    public OrderDecorator(Order order) {
        orderDecorator = order;
    }
    @Override
    public void takeOrder() {
        orderDecorator.takeOrder();
    }

    @Override
    public void processOrder() {
        orderDecorator.processOrder();
    }
}
